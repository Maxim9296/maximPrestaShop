package org.vaadin.example;



import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "combination")
@XmlAccessorType(XmlAccessType.FIELD)
public class Combination {

    @XmlElement(name = "id_product", required = true)
    private String idProduct;

    @XmlElement(name = "ean13")
    private String ean13;

    @XmlElement(name = "isbn")
    private String isbn;

    @XmlElement(name = "upc")
    private String upc;

    @XmlElement(name = "mpn")
    private String mpn;

    @XmlElement(name = "reference")
    private String reference;

    @XmlElement(name = "supplier_reference")
    private String supplierReference;

    @XmlElement(name = "wholesale_price")
    private String wholesalePrice;

    @XmlElement(name = "price")
    private String price;

    @XmlElement(name = "ecotax")
    private String ecotax;

    @XmlElement(name = "weight")
    private String weight;

    @XmlElement(name = "unit_price_impact")
    private String unitPriceImpact;

    @XmlElement(name = "minimal_quantity", required = true)
    private String minimalQuantity;

    @XmlElement(name = "low_stock_threshold")
    private String lowStockThreshold;

    @XmlElement(name = "low_stock_alert")
    private String lowStockAlert;

    @XmlElement(name = "default_on")
    private String defaultOn;

    @XmlElement(name = "available_date")
    private String availableDate;

    @XmlElementWrapper(name = "available_now")
    @XmlElement(name = "language")
    private List<Language> availableNow;

    @XmlElementWrapper(name = "available_later")
    @XmlElement(name = "language")
    private List<Language> availableLater;

    @XmlElement(name = "associations")
    private Associations associations;

    // Getters and Setters

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }

    public String getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(String wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEcotax() {
        return ecotax;
    }

    public void setEcotax(String ecotax) {
        this.ecotax = ecotax;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getUnitPriceImpact() {
        return unitPriceImpact;
    }

    public void setUnitPriceImpact(String unitPriceImpact) {
        this.unitPriceImpact = unitPriceImpact;
    }

    public String getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(String minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }

    public String getLowStockThreshold() {
        return lowStockThreshold;
    }

    public void setLowStockThreshold(String lowStockThreshold) {
        this.lowStockThreshold = lowStockThreshold;
    }

    public String getLowStockAlert() {
        return lowStockAlert;
    }

    public void setLowStockAlert(String lowStockAlert) {
        this.lowStockAlert = lowStockAlert;
    }

    public String getDefaultOn() {
        return defaultOn;
    }

    public void setDefaultOn(String defaultOn) {
        this.defaultOn = defaultOn;
    }

    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }

    public List<Language> getAvailableNow() {
        return availableNow;
    }

    public void setAvailableNow(List<Language> availableNow) {
        this.availableNow = availableNow;
    }

    public List<Language> getAvailableLater() {
        return availableLater;
    }

    public void setAvailableLater(List<Language> availableLater) {
        this.availableLater = availableLater;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // Inner classes for associations

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElement(name = "product_option_values")
        private ProductOptionValues productOptionValues;

        @XmlElement(name = "images")
        private Images images;

        public ProductOptionValues getProductOptionValues() {
            return productOptionValues;
        }

        public void setProductOptionValues(ProductOptionValues productOptionValues) {
            this.productOptionValues = productOptionValues;
        }

        public Images getImages() {
            return images;
        }

        public void setImages(Images images) {
            this.images = images;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ProductOptionValues {

        @XmlElement(name = "product_option_value")
        private List<ProductOptionValue> productOptionValue;

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
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Images {

        @XmlElement(name = "image")
        private List<Image> image;

        public List<Image> getImage() {
            return image;
        }

        public void setImage(List<Image> image) {
            this.image = image;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Image {

        @XmlElement(name = "id")
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
