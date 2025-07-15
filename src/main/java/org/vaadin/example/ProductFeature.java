package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "product_feature")
public class ProductFeature {

    @XmlElement(name = "position")
    private Integer position;

    @XmlElementWrapper(name = "name", required = true)
    @XmlElement(name = "language")
    private List<Language> name;

    // Getters e Setters

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
