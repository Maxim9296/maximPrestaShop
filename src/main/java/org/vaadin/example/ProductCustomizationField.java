package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customization_field")
public class ProductCustomizationField {

    @XmlElement(name = "id_product", required = true)
    private Integer idProduct;

    @XmlElement(name = "type", required = true)
    private Integer type;

    @XmlElement(name = "required", required = true)
    private Boolean required;

    @XmlElement(name = "is_module")
    private Boolean isModule;

    @XmlElement(name = "is_deleted")
    private Boolean isDeleted;

    @XmlElementWrapper(name = "name", required = true)
    @XmlElement(name = "language")
    private List<Language> name;

    // Getters e setters

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getIsModule() {
        return isModule;
    }

    public void setIsModule(Boolean isModule) {
        this.isModule = isModule;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }
}
