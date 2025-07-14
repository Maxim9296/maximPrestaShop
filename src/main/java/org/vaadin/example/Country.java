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
    private Boolean active;

    @XmlElement(name = "contains_states")
    private Boolean containsStates;

    @XmlElement(name = "need_identification_number")
    private Boolean needIdentificationNumber;

    @XmlElement(name = "need_zip_code")
    private Boolean needZipCode;

    @XmlElement(name = "zip_code_format")
    private String zipCodeFormat;

    @XmlElement(name = "display_tax_label")
    private Boolean displayTaxLabel;

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getContainsStates() {
        return containsStates;
    }

    public void setContainsStates(Boolean containsStates) {
        this.containsStates = containsStates;
    }

    public Boolean getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }

    public void setNeedIdentificationNumber(Boolean needIdentificationNumber) {
        this.needIdentificationNumber = needIdentificationNumber;
    }

    public Boolean getNeedZipCode() {
        return needZipCode;
    }

    public void setNeedZipCode(Boolean needZipCode) {
        this.needZipCode = needZipCode;
    }

    public String getZipCodeFormat() {
        return zipCodeFormat;
    }

    public void setZipCodeFormat(String zipCodeFormat) {
        this.zipCodeFormat = zipCodeFormat;
    }

    public Boolean getDisplayTaxLabel() {
        return displayTaxLabel;
    }

    public void setDisplayTaxLabel(Boolean displayTaxLabel) {
        this.displayTaxLabel = displayTaxLabel;
    }

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }
}
