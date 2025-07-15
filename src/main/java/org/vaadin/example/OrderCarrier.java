package org.vaadin.example;



import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_carrier")
public class OrderCarrier {

    @XmlElement(name = "id_order")
    private Integer idOrder;

    @XmlElement(name = "id_carrier")
    private Integer idCarrier;

    @XmlElement(name = "id_order_invoice")
    private Integer idOrderInvoice;

    @XmlElement(name = "weight")
    private BigDecimal weight;

    @XmlElement(name = "shipping_cost_tax_excl")
    private BigDecimal shippingCostTaxExcl;

    @XmlElement(name = "shipping_cost_tax_incl")
    private BigDecimal shippingCostTaxIncl;

    @XmlElement(name = "tracking_number")
    private String trackingNumber;

    @XmlElement(name = "date_add")
    private String dateAdd;

    // === Getters and Setters ===

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getShippingCostTaxExcl() {
        return shippingCostTaxExcl;
    }

    public void setShippingCostTaxExcl(BigDecimal shippingCostTaxExcl) {
        this.shippingCostTaxExcl = shippingCostTaxExcl;
    }

    public BigDecimal getShippingCostTaxIncl() {
        return shippingCostTaxIncl;
    }

    public void setShippingCostTaxIncl(BigDecimal shippingCostTaxIncl) {
        this.shippingCostTaxIncl = shippingCostTaxIncl;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
}
