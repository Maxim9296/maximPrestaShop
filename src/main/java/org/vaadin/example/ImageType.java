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
    private String categories;

    @XmlElement(name = "products")
    private String products;

    @XmlElement(name = "manufacturers")
    private String manufacturers;

    @XmlElement(name = "suppliers")
    private String suppliers;

    @XmlElement(name = "stores")
    private String stores;

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

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String suppliers) {
        this.suppliers = suppliers;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }
}
