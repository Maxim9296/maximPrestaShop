package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "stock_mvt")
@XmlAccessorType(XmlAccessType.FIELD)
public class StockMovement {

    @XmlElement(name = "id_product")
    private Integer idProduct;

    @XmlElement(name = "id_product_attribute")
    private Integer idProductAttribute;

    @XmlElement(name = "id_warehouse")
    private Integer idWarehouse;

    @XmlElement(name = "id_currency")
    private Integer idCurrency;

    @XmlElement(name = "management_type")
    private String managementType;

    @XmlElement(name = "id_employee")
    private Integer idEmployee;

    @XmlElement(name = "id_stock")
    private Integer idStock;

    @XmlElement(name = "id_stock_mvt_reason")
    private Integer idStockMvtReason;

    @XmlElement(name = "id_order")
    private Integer idOrder;

    @XmlElement(name = "id_supply_order")
    private Integer idSupplyOrder;

    @XmlElementWrapper(name = "product_name")
    @XmlElement(name = "language")
    private List<Language> productName;

    @XmlElement(name = "ean13")
    private String ean13;

    @XmlElement(name = "upc")
    private String upc;

    @XmlElement(name = "reference")
    private String reference;

    @XmlElement(name = "mpn")
    private String mpn;

    @XmlElement(name = "physical_quantity")
    private Integer physicalQuantity;

    @XmlElement(name = "sign")
    private Integer sign;

    @XmlElement(name = "last_wa")
    private Double lastWa;

    @XmlElement(name = "current_wa")
    private Double currentWa;

    @XmlElement(name = "price_te")
    private Double priceTe;

    @XmlElement(name = "date_add")
    private String dateAdd;

    // GETTERS & SETTERS

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

    public Integer getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Integer getIdStock() {
        return idStock;
    }

    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }

    public Integer getIdStockMvtReason() {
        return idStockMvtReason;
    }

    public void setIdStockMvtReason(Integer idStockMvtReason) {
        this.idStockMvtReason = idStockMvtReason;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdSupplyOrder() {
        return idSupplyOrder;
    }

    public void setIdSupplyOrder(Integer idSupplyOrder) {
        this.idSupplyOrder = idSupplyOrder;
    }

    public List<Language> getProductName() {
        return productName;
    }

    public void setProductName(List<Language> productName) {
        this.productName = productName;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Double getLastWa() {
        return lastWa;
    }

    public void setLastWa(Double lastWa) {
        this.lastWa = lastWa;
    }

    public Double getCurrentWa() {
        return currentWa;
    }

    public void setCurrentWa(Double currentWa) {
        this.currentWa = currentWa;
    }

    public Double getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(Double priceTe) {
        this.priceTe = priceTe;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
}
