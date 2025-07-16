package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "tax")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "rate",
        "active",
        "deleted",
        "name"
})
public class Tax {

    @XmlElement(required = true)
    private Float rate;

    @XmlElement
    private String active;

    @XmlElement
    private String deleted;

    @XmlElement(required = true)
    private Language name;

    // Getters e Setters

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Language getName() {
        return name;
    }

    public void setName(Language name) {
        this.name = name;
    }
}
