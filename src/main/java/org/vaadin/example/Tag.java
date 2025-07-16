package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "tag")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tag {

    @XmlElement(name = "id_lang")
    private String idLang;

    @XmlElement(name = "name")
    private String name;

    // GETTERS & SETTERS
    public String getIdLang() {
        return idLang;
    }

    public void setIdLang(String idLang) {
        this.idLang = idLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
