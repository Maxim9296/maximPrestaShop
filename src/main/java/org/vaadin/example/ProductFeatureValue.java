package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "product_feature_value")
public class ProductFeatureValue {

    @XmlElement(name = "id_feature", required = true)
    private Integer idFeature;

    @XmlElement(name = "custom")
    private Boolean custom;

    @XmlElement(name = "position")
    private Integer position;

    @XmlElementWrapper(name = "value", required = true)
    @XmlElement(name = "language")
    private List<Language> value;

    // Getters e Setters

    public Integer getIdFeature() {
        return idFeature;
    }

    public void setIdFeature(Integer idFeature) {
        this.idFeature = idFeature;
    }

    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public List<Language> getValue() {
        return value;
    }

    public void setValue(List<Language> value) {
        this.value = value;
    }
}
