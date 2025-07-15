package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "shop")
@XmlAccessorType(XmlAccessType.FIELD)
public class Shop {

    @XmlElement(name = "id_shop_group", required = true)
    private Integer idShopGroup;

    @XmlElement(name = "id_category", required = true)
    private Integer idCategory;

    @XmlElement
    private boolean active;

    @XmlElement
    private boolean deleted;

    @XmlElement(required = true)
    private String name;

    @XmlElement
    private String color;

    @XmlElement(name = "theme_name")
    private String themeName;

    // ----- GETTER e SETTER -----

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }
}
