package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "state")
@XmlAccessorType(XmlAccessType.FIELD)
public class State {

    @XmlElement(name = "id_zone", required = true)
    private Integer idZone;

    @XmlElement(name = "id_country", required = true)
    private Integer idCountry;

    @XmlElement(name = "iso_code", required = true)
    private String isoCode;

    @XmlElement(name = "name", required = true)
    private String name;

    @XmlElement
    private Boolean active;

    // -------- GETTER E SETTER --------

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

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
