package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "zone")
@XmlAccessorType(XmlAccessType.FIELD)
public class Zone {

    @XmlElement(name = "name", required = true)
    private String name;

    @XmlElement(name = "active")
    private Boolean active;

    // Getters e setters

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
}
