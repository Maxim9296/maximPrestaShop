package org.vaadin.example;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "configuration")
@XmlAccessorType(XmlAccessType.FIELD)
public class Configuration {

    @XmlElement(name = "value")
    private String value;

    @XmlElement(name = "name", required = true)
    private String name;

    @XmlElement(name = "id_shop_group")
    private String idShopGroup;

    @XmlElement(name = "id_shop")
    private String idShop;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    // Getters and setters

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
}
