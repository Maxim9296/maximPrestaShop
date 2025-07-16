package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "tax_rule")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "idTaxRulesGroup",
        "idState",
        "idCountry",
        "zipcodeFrom",
        "zipcodeTo",
        "idTax",
        "behavior",
        "description"
})
public class TaxRule {

    @XmlElement(name = "id_tax_rules_group", required = true)
    private Integer idTaxRulesGroup;

    @XmlElement(name = "id_state")
    private Integer idState;

    @XmlElement(name = "id_country", required = true)
    private Integer idCountry;

    @XmlElement(name = "zipcode_from")
    private String zipcodeFrom;

    @XmlElement(name = "zipcode_to")
    private String zipcodeTo;

    @XmlElement(name = "id_tax", required = true)
    private Integer idTax;

    @XmlElement(name = "behavior")
    private Integer behavior;

    @XmlElement(name = "description")
    private String description;

    // Getters and setters

    public Integer getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public String getZipcodeFrom() {
        return zipcodeFrom;
    }

    public void setZipcodeFrom(String zipcodeFrom) {
        this.zipcodeFrom = zipcodeFrom;
    }

    public String getZipcodeTo() {
        return zipcodeTo;
    }

    public void setZipcodeTo(String zipcodeTo) {
        this.zipcodeTo = zipcodeTo;
    }

    public Integer getIdTax() {
        return idTax;
    }

    public void setIdTax(Integer idTax) {
        this.idTax = idTax;
    }

    public Integer getBehavior() {
        return behavior;
    }

    public void setBehavior(Integer behavior) {
        this.behavior = behavior;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
