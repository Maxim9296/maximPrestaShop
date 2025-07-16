package org.vaadin.example;



import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "currency")
public class Currency {

    @XmlElementWrapper(name = "names")
    @XmlElement(name = "language")
    private List<Language> names;

    @XmlElement(name = "name")
    private String name;

    @XmlElementWrapper(name = "symbol")
    @XmlElement(name = "language")
    private List<Language> symbol;

    @XmlElement(name = "iso_code")
    private String isoCode;

    @XmlElement(name = "numeric_iso_code")
    private String numericIsoCode;

    @XmlElement(name = "precision")
    private Integer precision;

    @XmlElement(name = "conversion_rate")
    private Double conversionRate;

    @XmlElement(name = "deleted")
    private String deleted;

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "unofficial")
    private String unofficial;

    @XmlElement(name = "modified")
    private String modified;

    @XmlElementWrapper(name = "pattern")
    @XmlElement(name = "language")
    private List<Language> pattern;

    // === Getters and Setters ===

    public List<Language> getNames() {
        return names;
    }

    public void setNames(List<Language> names) {
        this.names = names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Language> getSymbol() {
        return symbol;
    }

    public void setSymbol(List<Language> symbol) {
        this.symbol = symbol;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getNumericIsoCode() {
        return numericIsoCode;
    }

    public void setNumericIsoCode(String numericIsoCode) {
        this.numericIsoCode = numericIsoCode;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getUnofficial() {
        return unofficial;
    }

    public void setUnofficial(String unofficial) {
        this.unofficial = unofficial;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public List<Language> getPattern() {
        return pattern;
    }

    public void setPattern(List<Language> pattern) {
        this.pattern = pattern;
    }
}
