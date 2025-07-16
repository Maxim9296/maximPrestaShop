package org.vaadin.example;



import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_cart_rule")
public class OrderCartRule {

    @XmlElement(name = "id_order")
    private Integer idOrder;

    @XmlElement(name = "id_cart_rule")
    private Integer idCartRule;

    @XmlElement(name = "id_order_invoice")
    private Integer idOrderInvoice;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "value")
    private BigDecimal value;

    @XmlElement(name = "value_tax_excl")
    private BigDecimal valueTaxExcl;

    @XmlElement(name = "free_shipping")
    private String freeShipping;

    @XmlElement(name = "deleted")
    private String deleted;

    // === Getters and Setters ===

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdCartRule() {
        return idCartRule;
    }

    public void setIdCartRule(Integer idCartRule) {
        this.idCartRule = idCartRule;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValueTaxExcl() {
        return valueTaxExcl;
    }

    public void setValueTaxExcl(BigDecimal valueTaxExcl) {
        this.valueTaxExcl = valueTaxExcl;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
