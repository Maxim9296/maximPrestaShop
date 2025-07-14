package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Route("")
public class MainView extends VerticalLayout {

    private final PrestaShopApiClient apiClient = new PrestaShopApiClient(
            "http://localhost/prestashop",
            "7KI1XGBGVM1LBGG1W1GCDDDENARA4V8F"
    );

    private final PrestaShopResourceManager resourceManager = new PrestaShopResourceManager(apiClient);

    private final Select<PrestaShopResources> resourceSelect = new Select<>();
    private final Button addNewButton = new Button("Nuova Risorsa");
    private final Grid<Map<String, Object>> grid = new Grid<>();

    public MainView() {
        setSizeFull();

        resourceSelect.setLabel("Seleziona risorsa");
        resourceSelect.setItems(PrestaShopResources.values());
        resourceSelect.setItemLabelGenerator(PrestaShopResources::getDisplayName);

        resourceSelect.addValueChangeListener(event -> {
            PrestaShopResources selectedResource = event.getValue();
            addNewButton.setEnabled(selectedResource != null);
            if (selectedResource != null) {
                loadResourceData(selectedResource);
            } else {
                grid.setItems(Collections.emptyList());
            }
        });

        addNewButton.setEnabled(false);
        addNewButton.addClickListener(e -> {
            PrestaShopResources selectedResource = resourceSelect.getValue();
            if (selectedResource != null) {
                openAddDialog(selectedResource);
            }
        });

        add(resourceSelect, addNewButton, grid);
    }

    private void loadResourceData(PrestaShopResources resource) {
        try {
            String xmlString = apiClient.get(resource.getEndpoint());

            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(xmlString.getBytes(StandardCharsets.UTF_8)));
            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
            NodeList resourceNodes = root.getChildNodes();

            Element itemsElement = null;
            for (int i = 0; i < resourceNodes.getLength(); i++) {
                Node node = resourceNodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    itemsElement = (Element) node;
                    break;
                }
            }

            if (itemsElement == null) {
                Notification.show("Nessun dato disponibile");
                grid.setItems(Collections.emptyList());
                return;
            }

            NodeList itemList = itemsElement.getChildNodes();
            List<Map<String, Object>> rows = new ArrayList<>();
            Set<String> columns = new LinkedHashSet<>();

            for (int i = 0; i < itemList.getLength(); i++) {
                Node itemNode = itemList.item(i);
                if (itemNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element itemElement = (Element) itemNode;
                    Map<String, Object> row = new HashMap<>();
                    NodeList fields = itemElement.getChildNodes();

                    for (int j = 0; j < fields.getLength(); j++) {
                        Node fieldNode = fields.item(j);
                        if (fieldNode.getNodeType() == Node.ELEMENT_NODE) {
                            String tagName = fieldNode.getNodeName();
                            String textContent = fieldNode.getTextContent();
                            columns.add(tagName);
                            row.put(tagName, textContent);
                        }
                    }
                    rows.add(row);
                }
            }

            grid.removeAllColumns();
            for (String col : columns) {
                grid.addColumn(item -> Objects.toString(item.get(col), "")).setHeader(col);
            }

            grid.addComponentColumn(item -> {
                Button editButton = new Button("Modifica");
                editButton.addClickListener(e -> openEditDialog(item, resource));
                return editButton;
            }).setHeader("Azioni");

            grid.setItems(rows);

        } catch (Exception e) {
            Notification.show("Errore caricamento dati: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void openEditDialog(Map<String, Object> item, PrestaShopResources resource) {
        Dialog dialog = new Dialog();
        VerticalLayout layout = new VerticalLayout();
        Map<String, TextField> fieldMap = new HashMap<>();

        try {
            String id = Objects.toString(item.get("id"));
            String xmlString = apiClient.getById(resource.getEndpoint(), id);

            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(xmlString.getBytes(StandardCharsets.UTF_8)));
            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
            NodeList rootChildren = root.getChildNodes();
            Element mainElement = null;
            for (int i = 0; i < rootChildren.getLength(); i++) {
                if (rootChildren.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    mainElement = (Element) rootChildren.item(i);
                    break;
                }
            }

            if (mainElement == null) return;

            NodeList fields = mainElement.getChildNodes();
            for (int i = 0; i < fields.getLength(); i++) {
                Node node = fields.item(i);
                if (node.getNodeType() != Node.ELEMENT_NODE) continue;

                Element field = (Element) node;
                String tagName = field.getTagName();

                NodeList languages = field.getElementsByTagName("language");
                if (languages.getLength() > 0) {
                    for (int j = 0; j < languages.getLength(); j++) {
                        Element langElem = (Element) languages.item(j);
                        String langId = langElem.getAttribute("id");
                        String key = tagName + "_language_" + langId;
                        TextField tf = new TextField(tagName + " [lang " + langId + "]");
                        tf.setValue(langElem.getTextContent());
                        fieldMap.put(key, tf);
                        layout.add(tf);
                    }
                } else {
                    TextField tf = new TextField(tagName);
                    tf.setValue(field.getTextContent());
                    fieldMap.put(tagName, tf);
                    layout.add(tf);
                }
            }

        } catch (Exception e) {
            Notification.show("Errore caricamento dati: " + e.getMessage());
            e.printStackTrace();
        }

        Button save = new Button("Salva", e -> {
            Map<String, String> updated = new HashMap<>();
            updated.put("id", Objects.toString(item.get("id")));
            fieldMap.forEach((k, v) -> updated.put(k, v.getValue()));

            try {
                resourceManager.updateResource(resource, updated);
                dialog.close();
                loadResourceData(resource);
                Notification.show("Modificato con successo");
            } catch (Exception ex) {
                Notification.show("Errore salvataggio: " + ex.getMessage());
                ex.printStackTrace();
            }
        });

        Button cancel = new Button("Annulla", e -> dialog.close());
        dialog.add(layout, new Div(save, cancel));
        dialog.open();
    }

    private void openAddDialog(PrestaShopResources resource) {
        Dialog dialog = new Dialog();
        VerticalLayout layout = new VerticalLayout();
        Map<String, TextField> fieldMap = new HashMap<>();

        try {
            String blankXml = apiClient.getSchema(resource.getEndpoint(), "blank");

            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(blankXml.getBytes(StandardCharsets.UTF_8)));
            doc.getDocumentElement().normalize();

            NodeList resourceNodes = doc.getDocumentElement().getElementsByTagName(resource.getEndpoint());
            if (resourceNodes.getLength() == 0) return;

            Element mainElement = (Element) resourceNodes.item(0);
            NodeList fields = mainElement.getChildNodes();

            for (int i = 0; i < fields.getLength(); i++) {
                Node node = fields.item(i);
                if (node.getNodeType() != Node.ELEMENT_NODE) continue;

                Element field = (Element) node;
                String tagName = field.getTagName();
                if ("id".equals(tagName)) continue;

                NodeList languages = field.getElementsByTagName("language");
                if (languages.getLength() > 0) {
                    for (int j = 0; j < languages.getLength(); j++) {
                        Element langElem = (Element) languages.item(j);
                        String langId = langElem.getAttribute("id");
                        String key = tagName + "_language_" + langId;
                        TextField tf = new TextField(tagName + " [lang " + langId + "]");
                        fieldMap.put(key, tf);
                        layout.add(tf);
                    }
                } else {
                    TextField tf = new TextField(tagName);
                    fieldMap.put(tagName, tf);
                    layout.add(tf);
                }
            }

        } catch (Exception e) {
            Notification.show("Errore caricamento schema: " + e.getMessage());
            e.printStackTrace();
        }

        Button save = new Button("Salva", e -> {
            Map<String, String> data = new HashMap<>();
            fieldMap.forEach((k, v) -> data.put(k, v.getValue()));

            try {
                resourceManager.addResource(resource, data);
                dialog.close();
                loadResourceData(resource);
                Notification.show("Aggiunto con successo");
            } catch (Exception ex) {
                Notification.show("Errore salvataggio: " + ex.getMessage());
                ex.printStackTrace();
            }
        });

        Button cancel = new Button("Annulla", e -> dialog.close());
        dialog.add(layout, new Div(save, cancel));
        dialog.open();
    }
}
