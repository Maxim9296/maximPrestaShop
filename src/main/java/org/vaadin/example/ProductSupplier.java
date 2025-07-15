package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "product_supplier")
public class ProductSupplier {

    @XmlElement(name = "id_product", required = true)
    private Integer idProduct;

    @XmlElement(name = "id_product_attribute", required = true)
    private Integer idProductAttribute;

    @XmlElement(name = "id_supplier", required = true)
    private Integer idSupplier;

    @XmlElement(name = "id_currency")
    private Integer idCurrency;

    @XmlElement(name = "product_supplier_reference")
    private String productSupplierReference;

    @XmlElement(name = "product_supplier_price_te")
    private BigDecimal productSupplierPriceTe;

    // === GETTERS and SETTERS ===

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

    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }

    public BigDecimal getProductSupplierPriceTe() {
        return productSupplierPriceTe;
    }

    public void setProductSupplierPriceTe(BigDecimal productSupplierPriceTe) {
        this.productSupplierPriceTe = productSupplierPriceTe;
    }
}
