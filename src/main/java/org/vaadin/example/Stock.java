package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "stock")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stock {

    @XmlElement(name = "id_warehouse")
    private Integer idWarehouse;

    @XmlElement(name = "id_product")
    private Integer idProduct;

    @XmlElement(name = "id_product_attribute")
    private Integer idProductAttribute;

    @XmlElement(name = "real_quantity")
    private Integer realQuantity;

    @XmlElement(name = "reference")
    private String reference;

    @XmlElement(name = "ean13")
    private String ean13;

    @XmlElement(name = "isbn")
    private String isbn;

    @XmlElement(name = "upc")
    private String upc;

    @XmlElement(name = "mpn")
    private String mpn;

    @XmlElement(name = "physical_quantity")
    private Integer physicalQuantity;

    @XmlElement(name = "usable_quantity")
    private Integer usableQuantity;

    @XmlElement(name = "price_te")
    private Double priceTe;

    // GETTERS & SETTERS

    public Integer getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Integer idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    public Integer getRealQuantity() {
        return realQuantity;
    }

    public void setRealQuantity(Integer realQuantity) {
        this.realQuantity = realQuantity;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public Integer getPhysicalQuantity() {
        return physicalQuantity;
    }

    public void setPhysicalQuantity(Integer physicalQuantity) {
        this.physicalQuantity = physicalQuantity;
    }

    public Integer getUsableQuantity() {
        return usableQuantity;
    }

    public void setUsableQuantity(Integer usableQuantity) {
        this.usableQuantity = usableQuantity;
    }

    public Double getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(Double priceTe) {
        this.priceTe = priceTe;
    }
}
