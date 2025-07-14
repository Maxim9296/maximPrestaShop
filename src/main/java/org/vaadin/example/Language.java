package org.vaadin.example;



import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Language {

    @XmlAttribute(name = "id")
    private Integer id;

    @XmlAttribute(name = "xlink:href", namespace = "http://www.w3.org/1999/xlink")
    private String href;

    @XmlValue
    private String value;

    // Getter e Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
