package org.vaadin.example; // Package della classe

import org.w3c.dom.*; // Import per lavorare con XML DOM

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*; // Import per trasformazioni XML
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*; // Import per I/O
import java.net.HttpURLConnection; // Per gestire connessioni HTTP
import java.util.*; // Collezioni (Map, Set, ecc)
import java.util.stream.Collectors; // Per operazioni su stream di dati

public class PrestaShopResourceManager {

    private final PrestaShopApiClient client; // Oggetto per interagire con l’API PrestaShop

    // Costruttore che inizializza il client API
    public PrestaShopResourceManager(PrestaShopApiClient client) {
        this.client = client;
    }

    // Metodo per aggiornare una risorsa esistente in PrestaShop
    public void updateResource(PrestaShopResources resource, Map<String, String> data) throws Exception {
        String id = data.get("id"); // Recupera l’ID dalla mappa dati
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("ID mancante"); // Se manca ID, lancia eccezione

        String xml = client.getById(resource.getEndpoint(), id); // Ottiene XML della risorsa tramite API
        Document doc = loadXml(xml); // Converte stringa XML in documento DOM
        Element mainElement = findMainElement(doc); // Trova l’elemento principale dentro XML

        updateFields(doc, mainElement, data); // Aggiorna i campi XML con i nuovi dati

        Set<String> readOnly = getReadOnlyFields(resource.getEndpoint()); // Ottiene i campi di sola lettura
        removeNonWritableFields(doc, readOnly); // Rimuove dal DOM i campi che non possono essere modificati

        String updatedXml = xmlToString(doc); // Converte il documento DOM modificato in stringa XML
        System.out.println("🔄 XML aggiornato:\n" + updatedXml); // Stampa XML aggiornato su console

        // Prepara connessione HTTP PUT verso API per aggiornare la risorsa
        HttpURLConnection connection = client.prepareConnection(resource.getEndpoint() + "/" + id, "PUT", true);
        try (OutputStream os = connection.getOutputStream()) {
            os.write(updatedXml.getBytes("UTF-8")); // Scrive XML aggiornato nel body della richiesta
        }

        handleResponse(connection, "PUT"); // Gestisce la risposta HTTP (controllo successo o errore)
    }

    // Metodo per aggiungere una nuova risorsa in PrestaShop
    public void addResource(PrestaShopResources resource, Map<String, String> data) throws Exception {
        String blankXml = client.getSchema(resource.getEndpoint(), "blank"); // Ottiene XML "vuoto" per la risorsa
        Document doc = loadXml(blankXml); // Converte XML vuoto in documento DOM
        Element mainElement = findMainElement(doc); // Trova elemento principale nel documento

        updateFields(doc, mainElement, data); // Inserisce i dati nei campi XML

        Set<String> readOnly = getReadOnlyFields(resource.getEndpoint()); // Ottiene campi di sola lettura
        removeNonWritableFields(doc, readOnly); // Rimuove campi non scrivibili dal DOM

        String updatedXml = xmlToString(doc); // Converte DOM modificato in stringa XML
        System.out.println("📤 XML da inviare:\n" + updatedXml); // Stampa XML da inviare

        // Prepara connessione HTTP POST per creare nuova risorsa
        HttpURLConnection connection = client.prepareConnection(resource.getEndpoint(), "POST", true);
        try (OutputStream os = connection.getOutputStream()) {
            os.write(updatedXml.getBytes("UTF-8")); // Scrive XML nel corpo della richiesta POST
        }

        handleResponse(connection, "POST"); // Gestisce la risposta HTTP (controllo successo o errore)
    }

    // Metodo di utilità per convertire stringa XML in documento DOM
    private Document loadXml(String xml) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // Factory per builder XML
        DocumentBuilder builder = factory.newDocumentBuilder(); // Costruisce parser XML
        return builder.parse(new ByteArrayInputStream(xml.getBytes("UTF-8"))); // Parsing da stringa in DOM
    }

    // Trova l’elemento principale (primo elemento figlio) dentro il documento XML
    private Element findMainElement(Document doc) {
        NodeList nodes = doc.getDocumentElement().getChildNodes(); // Prende i figli dell’elemento radice
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE) return (Element) n; // Ritorna il primo nodo elemento
        }
        throw new IllegalStateException("Elemento principale non trovato"); // Se non trovato, errore
    }

    // Aggiorna i campi XML con i dati passati
    private void updateFields(Document doc, Element main, Map<String, String> data) {
        NodeList fields = main.getChildNodes(); // Tutti i figli dell’elemento principale
        for (int i = 0; i < fields.getLength(); i++) {
            Node fieldNode = fields.item(i);
            if (fieldNode.getNodeType() != Node.ELEMENT_NODE) continue; // Ignora nodi non-elemento
            Element field = (Element) fieldNode;
            String tag = field.getTagName(); // Nome del tag XML

            NodeList languages = field.getElementsByTagName("language"); // Controlla se ha sotto-elementi <language>
            if (languages.getLength() > 0) { // Se è un campo multilingua
                for (int j = 0; j < languages.getLength(); j++) {
                    Element lang = (Element) languages.item(j);
                    String langId = lang.getAttribute("id"); // Prende l’attributo id lingua
                    String key = tag + "_language_" + langId; // Chiave per cercare nella mappa dati
                    if (data.containsKey(key)) {
                        setElementValue(doc, lang, data.get(key)); // Aggiorna valore per quella lingua
                    }
                }
            } else if (data.containsKey(tag)) {
                setElementValue(doc, field, data.get(tag)); // Campo normale: aggiorna valore se presente nei dati
            }
        }
    }

    // Sostituisce il contenuto del nodo con un CDATA contenente il valore specificato
    private void setElementValue(Document doc, Element el, String value) {
        while (el.hasChildNodes()) el.removeChild(el.getFirstChild()); // Rimuove tutti i nodi figli esistenti
        CDATASection cdata = doc.createCDATASection(value); // Crea sezione CDATA per il valore
        el.appendChild(cdata); // Aggiunge il CDATA come figlio
    }

    // Rimuove dal documento tutti i campi che sono in sola lettura (non scrivibili)
    private void removeNonWritableFields(Document doc, Set<String> readOnlyFields) {
        removeFieldsByName(doc.getDocumentElement(), readOnlyFields); // Rimuove ricorsivamente
    }

    // Metodo ricorsivo per rimuovere nodi con tag contenuti in namesToRemove
    private void removeFieldsByName(Node node, Set<String> namesToRemove) {
        if (node.getNodeType() != Node.ELEMENT_NODE) return; // Se non è elemento esce

        NodeList children = node.getChildNodes(); // Lista figli
        for (int i = children.getLength() - 1; i >= 0; i--) { // Itera all’indietro per rimozione sicura
            Node child = children.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                Element el = (Element) child;
                if (namesToRemove.contains(el.getTagName())) {
                    node.removeChild(el); // Rimuove nodo se tag è in lista read-only
                } else {
                    removeFieldsByName(el, namesToRemove); // Altrimenti continua ricorsione
                }
            }
        }
    }

    // Estrae i campi di sola lettura dallo schema XML (usando attributi read_only o readOnly)
    private Set<String> getReadOnlyFields(String resource) throws Exception {
        String schema = client.getSchema(resource, "synopsis"); // Ottiene schema XML sintetico
        Set<String> readOnlyFields = new HashSet<>();
        Document doc = loadXml(schema); // Converte schema in DOM
        Element main = findMainElement(doc); // Trova elemento principale
        NodeList fields = main.getChildNodes();

        for (int i = 0; i < fields.getLength(); i++) {
            Node fieldNode = fields.item(i);
            if (fieldNode.getNodeType() == Node.ELEMENT_NODE) {
                Element field = (Element) fieldNode;
                // Se il campo ha attributo read_only o readOnly true, lo aggiunge a readOnlyFields
                if ("true".equalsIgnoreCase(field.getAttribute("read_only")) ||
                        "true".equalsIgnoreCase(field.getAttribute("readOnly"))) {
                    readOnlyFields.add(field.getTagName());
                }
            }
        }

        return readOnlyFields; // Ritorna set di campi in sola lettura
    }

    // Converte un documento DOM in stringa XML formattata
    private String xmlToString(Document doc) throws Exception {
        TransformerFactory tf = TransformerFactory.newInstance(); // Factory per trasformazioni
        Transformer transformer = tf.newTransformer(); // Ottiene trasformatore
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no"); // Non omettere dichiarazione XML
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); // Encoding UTF-8
        transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Indentazione per leggibilità

        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer)); // Trasforma DOM in stringa
        return writer.toString(); // Ritorna XML come stringa
    }

    // Gestisce la risposta HTTP: controlla codice e lancia eccezione in caso di errore
    private void handleResponse(HttpURLConnection connection, String method) throws IOException {
        int code = connection.getResponseCode(); // Ottiene codice di risposta HTTP
        if (code != HttpURLConnection.HTTP_OK && code != HttpURLConnection.HTTP_NO_CONTENT &&
                code != HttpURLConnection.HTTP_CREATED) {
            String response = "";
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getErrorStream(), "UTF-8"))) {
                response = br.lines().collect(Collectors.joining("\n")); // Legge messaggio di errore dal server
            } catch (Exception ignored) {
            }
            throw new IOException("❌ Errore " + method + " PrestaShop (" + code + "):\n" + response); // Lancia eccezione con dettaglio errore
        } else {
            System.out.println("✅ " + method + " completato con successo (HTTP " + code + ")"); // Stampa messaggio successo
        }
    }
}
