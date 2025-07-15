package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "product_option")
public class ProductOption {

    @XmlElement(name = "is_color_group")
    private Boolean isColorGroup;

    @XmlElement(name = "group_type", required = true)
    private String groupType;

    @XmlElement(name = "position")
    private Integer position;

    @XmlElementWrapper(name = "name", required = true)
    @XmlElement(name = "language")
    private List<Language> name;

    @XmlElementWrapper(name = "public_name", required = true)
    @XmlElement(name = "language")
    private List<Language> publicName;

    @XmlElement(name = "associations")
    private Associations associations;

    // Getters e Setters

    public Boolean getIsColorGroup() {
        return isColorGroup;
    }

    public void setIsColorGroup(Boolean isColorGroup) {
        this.isColorGroup = isColorGroup;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
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

    public List<Language> getPublicName() {
        return publicName;
    }

    public void setPublicName(List<Language> publicName) {
        this.publicName = publicName;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // === Inner static classes for nested XML ===

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElement(name = "product_option_values")
        private ProductOptionValues productOptionValues;

        // Getter e Setter
        public ProductOptionValues getProductOptionValues() {
            return productOptionValues;
        }

        public void setProductOptionValues(ProductOptionValues productOptionValues) {
            this.productOptionValues = productOptionValues;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ProductOptionValues {

        @XmlElement(name = "product_option_value")
        private List<ProductOptionValue> productOptionValue;

        // Getter e Setter
        public List<ProductOptionValue> getProductOptionValue() {
            return productOptionValue;
        }

        public void setProductOptionValue(List<ProductOptionValue> productOptionValue) {
            this.productOptionValue = productOptionValue;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ProductOptionValue {

        @XmlElement(name = "id")
        private Integer id;

        // Getter e Setter
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }
}
