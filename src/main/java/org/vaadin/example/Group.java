package org.vaadin.example;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "group")
public class Group {

    @XmlElement(name = "reduction")
    private Float reduction;

    @XmlElement(name = "price_display_method")
    private Integer priceDisplayMethod;

    @XmlElement(name = "show_prices")
    private String showPrices;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    @XmlElementWrapper(name = "name")
    @XmlElement(name = "language")
    private List<Language> name;

    // === Getters and setters ===

    public Float getReduction() {
        return reduction;
    }

    public void setReduction(Float reduction) {
        this.reduction = reduction;
    }

    public Integer getPriceDisplayMethod() {
        return priceDisplayMethod;
    }

    public void setPriceDisplayMethod(Integer priceDisplayMethod) {
        this.priceDisplayMethod = priceDisplayMethod;
    }

    public String getShowPrices() {
        return showPrices;
    }

    public void setShowPrices(String showPrices) {
        this.showPrices = showPrices;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }
}
