package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "zone")
@XmlAccessorType(XmlAccessType.FIELD)
public class Zone {

    @XmlElement(name = "name", required = true)
    private String name;

    @XmlElement(name = "active")
    private String active;

    // Getters e setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
