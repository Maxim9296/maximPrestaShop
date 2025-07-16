package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "customization")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customization {

    @XmlElement(name = "id_address_delivery", required = true)
    private Long idAddressDelivery;

    @XmlElement(name = "id_cart", required = true)
    private Long idCart;

    @XmlElement(name = "id_product", required = true)
    private Long idProduct;

    @XmlElement(name = "id_product_attribute", required = true)
    private Long idProductAttribute;

    @XmlElement(name = "quantity", required = true)
    private Long quantity;

    @XmlElement(name = "quantity_refunded", required = true)
    private Long quantityRefunded;

    @XmlElement(name = "quantity_returned", required = true)
    private Long quantityReturned;

    @XmlElement(name = "in_cart", required = true)
    private String inCart;

    @XmlElement(name = "associations")
    private Associations associations;

    // Getters and setters

    public Long getIdAddressDelivery() {
        return idAddressDelivery;
    }

    public void setIdAddressDelivery(Long idAddressDelivery) {
        this.idAddressDelivery = idAddressDelivery;
    }

    public Long getIdCart() {
        return idCart;
    }

    public void setIdCart(Long idCart) {
        this.idCart = idCart;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Long idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantityRefunded() {
        return quantityRefunded;
    }

    public void setQuantityRefunded(Long quantityRefunded) {
        this.quantityRefunded = quantityRefunded;
    }

    public Long getQuantityReturned() {
        return quantityReturned;
    }

    public void setQuantityReturned(Long quantityReturned) {
        this.quantityReturned = quantityReturned;
    }

    public String getInCart() {
        return inCart;
    }

    public void setInCart(String inCart) {
        this.inCart = inCart;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // Inner classes

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElementWrapper(name = "customized_data_text_fields")
        @XmlElement(name = "customized_data_text_field")
        private List<CustomizedDataTextField> customizedDataTextFields;

        @XmlElementWrapper(name = "customized_data_images")
        @XmlElement(name = "customized_data_image")
        private List<CustomizedDataImage> customizedDataImages;

        public List<CustomizedDataTextField> getCustomizedDataTextFields() {
            return customizedDataTextFields;
        }

        public void setCustomizedDataTextFields(List<CustomizedDataTextField> customizedDataTextFields) {
            this.customizedDataTextFields = customizedDataTextFields;
        }

        public List<CustomizedDataImage> getCustomizedDataImages() {
            return customizedDataImages;
        }

        public void setCustomizedDataImages(List<CustomizedDataImage> customizedDataImages) {
            this.customizedDataImages = customizedDataImages;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class CustomizedDataTextField {

        @XmlElement(name = "id_customization_field", required = true)
        private Long idCustomizationField;

        @XmlElement(name = "value")
        private String value;

        public Long getIdCustomizationField() {
            return idCustomizationField;
        }

        public void setIdCustomizationField(Long idCustomizationField) {
            this.idCustomizationField = idCustomizationField;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class CustomizedDataImage {

        @XmlElement(name = "id_customization_field")
        private Long idCustomizationField;

        @XmlElement(name = "value")
        private String value;

        public Long getIdCustomizationField() {
            return idCustomizationField;
        }

        public void setIdCustomizationField(Long idCustomizationField) {
            this.idCustomizationField = idCustomizationField;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
