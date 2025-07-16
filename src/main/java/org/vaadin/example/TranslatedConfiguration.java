package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "translated_configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "value",
        "dateAdd",
        "dateUpd",
        "name",
        "idShopGroup",
        "idShop"
})
public class TranslatedConfiguration {

    @XmlElementWrapper(name = "value")
    @XmlElement(name = "language")
    private List<Language> value;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    @XmlElement(required = true)
    private String name;

    @XmlElement(name = "id_shop_group")
    private String idShopGroup;

    @XmlElement(name = "id_shop")
    private String idShop;

    // Getters e Setters

    public List<Language> getValue() {
        return value;
    }

    public void setValue(List<Language> value) {
        this.value = value;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(String idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String idShop) {
        this.idShop = idShop;
    }
}
