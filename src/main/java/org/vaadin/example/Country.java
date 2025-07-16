package org.vaadin.example;



import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "country")
public class Country {

    @XmlElement(name = "id_zone")
    private Long idZone;

    @XmlElement(name = "id_currency")
    private Long idCurrency;

    @XmlElement(name = "call_prefix")
    private Integer callPrefix;

    @XmlElement(name = "iso_code")
    private String isoCode;

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "contains_states")
    private String containsStates;

    @XmlElement(name = "need_identification_number")
    private String needIdentificationNumber;

    @XmlElement(name = "need_zip_code")
    private String needZipCode;

    @XmlElement(name = "zip_code_format")
    private String zipCodeFormat;

    @XmlElement(name = "display_tax_label")
    private String displayTaxLabel;

    @XmlElementWrapper(name = "name")
    @XmlElement(name = "language")
    private List<Language> name;

    // === Getters and Setters ===

    public Long getIdZone() {
        return idZone;
    }

    public void setIdZone(Long idZone) {
        this.idZone = idZone;
    }

    public Long getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Long idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Integer getCallPrefix() {
        return callPrefix;
    }

    public void setCallPrefix(Integer callPrefix) {
        this.callPrefix = callPrefix;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getContainsStates() {
        return containsStates;
    }

    public void setContainsStates(String containsStates) {
        this.containsStates = containsStates;
    }

    public String getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }

    public void setNeedIdentificationNumber(String needIdentificationNumber) {
        this.needIdentificationNumber = needIdentificationNumber;
    }

    public String getNeedZipCode() {
        return needZipCode;
    }

    public void setNeedZipCode(String needZipCode) {
        this.needZipCode = needZipCode;
    }

    public String getZipCodeFormat() {
        return zipCodeFormat;
    }

    public void setZipCodeFormat(String zipCodeFormat) {
        this.zipCodeFormat = zipCodeFormat;
    }

    public String getDisplayTaxLabel() {
        return displayTaxLabel;
    }

    public void setDisplayTaxLabel(String displayTaxLabel) {
        this.displayTaxLabel = displayTaxLabel;
    }

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }
}
