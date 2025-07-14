package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "image_type")
public class ImageType {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "width")
    private Integer width;

    @XmlElement(name = "height")
    private Integer height;

    @XmlElement(name = "categories")
    private Boolean categories;

    @XmlElement(name = "products")
    private Boolean products;

    @XmlElement(name = "manufacturers")
    private Boolean manufacturers;

    @XmlElement(name = "suppliers")
    private Boolean suppliers;

    @XmlElement(name = "stores")
    private Boolean stores;

    // === Getters and setters ===

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getCategories() {
        return categories;
    }

    public void setCategories(Boolean categories) {
        this.categories = categories;
    }

    public Boolean getProducts() {
        return products;
    }

    public void setProducts(Boolean products) {
        this.products = products;
    }

    public Boolean getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Boolean manufacturers) {
        this.manufacturers = manufacturers;
    }

    public Boolean getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Boolean suppliers) {
        this.suppliers = suppliers;
    }

    public Boolean getStores() {
        return stores;
    }

    public void setStores(Boolean stores) {
        this.stores = stores;
    }
}
