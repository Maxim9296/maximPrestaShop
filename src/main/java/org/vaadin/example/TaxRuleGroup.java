package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "tax_rule_group")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "active", "deleted", "dateAdd", "dateUpd"})
public class TaxRuleGroup {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "active")
    private Boolean active;

    @XmlElement(name = "deleted")
    private Boolean deleted;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    // GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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
}
