package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "product_option_value")
public class ProductOptionValue {

    @XmlElement(name = "id_attribute_group", required = true)
    private Integer idAttributeGroup;

    @XmlElement(name = "color")
    private String color;

    @XmlElement(name = "position")
    private Integer position;

    @XmlElementWrapper(name = "name", required = true)
    @XmlElement(name = "language")
    private List<Language> name;

    // Getters e Setters

    public Integer getIdAttributeGroup() {
        return idAttributeGroup;
    }

    public void setIdAttributeGroup(Integer idAttributeGroup) {
        this.idAttributeGroup = idAttributeGroup;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }
}
