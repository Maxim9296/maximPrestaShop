package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_invoice")
public class OrderInvoice {

    @XmlElement(name = "id_order", required = true)
    private Integer idOrder;

    @XmlElement(name = "number", required = true)
    private Integer number;

    @XmlElement(name = "delivery_number")
    private Integer deliveryNumber;

    @XmlElement(name = "delivery_date")
    private String deliveryDate;

    @XmlElement(name = "total_discount_tax_excl")
    private String totalDiscountTaxExcl;

    @XmlElement(name = "total_discount_tax_incl")
    private String totalDiscountTaxIncl;

    @XmlElement(name = "total_paid_tax_excl")
    private String totalPaidTaxExcl;

    @XmlElement(name = "total_paid_tax_incl")
    private String totalPaidTaxIncl;

    @XmlElement(name = "total_products")
    private String totalProducts;

    @XmlElement(name = "total_products_wt")
    private String totalProductsWt;

    @XmlElement(name = "total_shipping_tax_excl")
    private String totalShippingTaxExcl;

    @XmlElement(name = "total_shipping_tax_incl")
    private String totalShippingTaxIncl;

    @XmlElement(name = "shipping_tax_computation_method")
    private Integer shippingTaxComputationMethod;

    @XmlElement(name = "total_wrapping_tax_excl")
    private String totalWrappingTaxExcl;

    @XmlElement(name = "total_wrapping_tax_incl")
    private String totalWrappingTaxIncl;

    @XmlElement(name = "shop_address")
    private String shopAddress;

    @XmlElement(name = "note")
    private String note;

    @XmlElement(name = "date_add")
    private String dateAdd;

    // Getters and setters

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(Integer deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getTotalDiscountTaxExcl() {
        return totalDiscountTaxExcl;
    }

    public void setTotalDiscountTaxExcl(String totalDiscountTaxExcl) {
        this.totalDiscountTaxExcl = totalDiscountTaxExcl;
    }

    public String getTotalDiscountTaxIncl() {
        return totalDiscountTaxIncl;
    }

    public void setTotalDiscountTaxIncl(String totalDiscountTaxIncl) {
        this.totalDiscountTaxIncl = totalDiscountTaxIncl;
    }

    public String getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(String totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }

    public String getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(String totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }

    public String getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(String totalProducts) {
        this.totalProducts = totalProducts;
    }

    public String getTotalProductsWt() {
        return totalProductsWt;
    }

    public void setTotalProductsWt(String totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
    }

    public String getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(String totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public String getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(String totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public Integer getShippingTaxComputationMethod() {
        return shippingTaxComputationMethod;
    }

    public void setShippingTaxComputationMethod(Integer shippingTaxComputationMethod) {
        this.shippingTaxComputationMethod = shippingTaxComputationMethod;
    }

    public String getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(String totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }

    public String getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(String totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
}
