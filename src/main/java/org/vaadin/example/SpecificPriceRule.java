package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlRootElement(name = "specific_price_rule")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecificPriceRule {

    @XmlElement(name = "id_shop", required = true)
    private Integer idShop;

    @XmlElement(name = "id_country", required = true)
    private Integer idCountry;

    @XmlElement(name = "id_currency", required = true)
    private Integer idCurrency;

    @XmlElement(name = "id_group", required = true)
    private Integer idGroup;

    @XmlElement(required = true)
    private String name;

    @XmlElement(name = "from_quantity", required = true)
    private Integer fromQuantity;

    @XmlElement(required = true)
    private BigDecimal price;

    @XmlElement(required = true)
    private BigDecimal reduction;

    @XmlElement(name = "reduction_tax", required = true)
    private String reductionTax;

    @XmlElement(name = "reduction_type", required = true)
    private String reductionType;

    @XmlElement
    private String from;

    @XmlElement
    private String to;

    // ----- GETTER e SETTER -----

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

    public String isReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(String reductionTax) {
        this.reductionTax = reductionTax;
    }

    public String getReductionType() {
        return reductionType;
    }

    public void setReductionType(String reductionType) {
        this.reductionType = reductionType;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
