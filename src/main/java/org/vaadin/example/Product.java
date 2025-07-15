package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "product")
public class Product {

    @XmlElement(name = "id_manufacturer")
    private Integer idManufacturer;

    @XmlElement(name = "id_supplier")
    private Integer idSupplier;

    @XmlElement(name = "id_category_default")
    private Integer idCategoryDefault;

    @XmlElement(name = "new")
    private String isNew;

    @XmlElement(name = "cache_default_attribute")
    private Integer cacheDefaultAttribute;

    @XmlElement(name = "id_default_image")
    private Integer idDefaultImage;

    @XmlElement(name = "id_default_combination")
    private Integer idDefaultCombination;

    @XmlElement(name = "id_tax_rules_group")
    private Integer idTaxRulesGroup;

    @XmlElement(name = "position_in_category")
    private Integer positionInCategory;

    @XmlElement(name = "manufacturer_name")
    private String manufacturerName;

    @XmlElement(name = "quantity")
    private Integer quantity;

    @XmlElement(name = "type")
    private String type;

    @XmlElement(name = "id_shop_default")
    private Integer idShopDefault;

    @XmlElement(name = "reference")
    private String reference;

    @XmlElement(name = "supplier_reference")
    private String supplierReference;

    @XmlElement(name = "location")
    private String location;

    @XmlElement(name = "width")
    private BigDecimal width;

    @XmlElement(name = "height")
    private BigDecimal height;

    @XmlElement(name = "depth")
    private BigDecimal depth;

    @XmlElement(name = "weight")
    private BigDecimal weight;

    @XmlElement(name = "quantity_discount")
    private Boolean quantityDiscount;

    @XmlElement(name = "ean13")
    private String ean13;

    @XmlElement(name = "isbn")
    private String isbn;

    @XmlElement(name = "upc")
    private String upc;

    @XmlElement(name = "mpn")
    private String mpn;

    @XmlElement(name = "cache_is_pack")
    private Boolean cacheIsPack;

    @XmlElement(name = "cache_has_attachments")
    private Boolean cacheHasAttachments;

    @XmlElement(name = "is_virtual")
    private Boolean isVirtual;

    @XmlElement(name = "state")
    private Integer state;

    @XmlElement(name = "additional_delivery_times")
    private Integer additionalDeliveryTimes;

    @XmlElementWrapper(name = "delivery_in_stock")
    @XmlElement(name = "language")
    private List<Language> deliveryInStock;

    @XmlElementWrapper(name = "delivery_out_stock")
    @XmlElement(name = "language")
    private List<Language> deliveryOutStock;

    @XmlElement(name = "product_type")
    private String productType;

    @XmlElement(name = "on_sale")
    private Boolean onSale;

    @XmlElement(name = "online_only")
    private Boolean onlineOnly;

    @XmlElement(name = "ecotax")
    private BigDecimal ecotax;

    @XmlElement(name = "minimal_quantity")
    private Integer minimalQuantity;

    @XmlElement(name = "low_stock_threshold")
    private Integer lowStockThreshold;

    @XmlElement(name = "low_stock_alert")
    private Boolean lowStockAlert;

    @XmlElement(name = "price", required = true)
    private BigDecimal price;

    @XmlElement(name = "wholesale_price")
    private BigDecimal wholesalePrice;

    @XmlElement(name = "unity")
    private String unity;

    @XmlElement(name = "unit_price")
    private BigDecimal unitPrice;

    @XmlElement(name = "unit_price_ratio")
    private BigDecimal unitPriceRatio;

    @XmlElement(name = "additional_shipping_cost")
    private BigDecimal additionalShippingCost;

    @XmlElement(name = "customizable")
    private Integer customizable;

    @XmlElement(name = "text_fields")
    private Integer textFields;

    @XmlElement(name = "uploadable_files")
    private Integer uploadableFiles;

    @XmlElement(name = "active")
    private Boolean active;

    @XmlElement(name = "redirect_type")
    private String redirectType;

    @XmlElement(name = "id_type_redirected")
    private Integer idTypeRedirected;

    @XmlElement(name = "available_for_order")
    private Boolean availableForOrder;

    @XmlElement(name = "available_date")
    private String availableDate;

    @XmlElement(name = "show_condition")
    private Boolean showCondition;

    @XmlElement(name = "condition")
    private String condition;

    @XmlElement(name = "show_price")
    private Boolean showPrice;

    @XmlElement(name = "indexed")
    private Boolean indexed;

    @XmlElement(name = "visibility")
    private String visibility;

    @XmlElement(name = "advanced_stock_management")
    private Boolean advancedStockManagement;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    @XmlElement(name = "pack_stock_type")
    private Integer packStockType;

    @XmlElementWrapper(name = "meta_description")
    @XmlElement(name = "language")
    private List<Language> metaDescription;

    @XmlElementWrapper(name = "meta_title")
    @XmlElement(name = "language")
    private List<Language> metaTitle;

    @XmlElementWrapper(name = "link_rewrite")
    @XmlElement(name = "language")
    private List<Language> linkRewrite;

    @XmlElementWrapper(name = "name")
    @XmlElement(name = "language")
    private List<Language> name;

    @XmlElementWrapper(name = "description")
    @XmlElement(name = "language")
    private List<Language> description;

    @XmlElementWrapper(name = "description_short")
    @XmlElement(name = "language")
    private List<Language> descriptionShort;

    @XmlElementWrapper(name = "available_now")
    @XmlElement(name = "language")
    private List<Language> availableNow;

    @XmlElementWrapper(name = "available_later")
    @XmlElement(name = "language")
    private List<Language> availableLater;

    @XmlElement(name = "associations")
    private Associations associations;
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElementWrapper(name = "categories")
        @XmlElement(name = "category")
        private List<Category> categories;

        @XmlElementWrapper(name = "images")
        @XmlElement(name = "image")
        private List<Image> images;

        @XmlElementWrapper(name = "combinations")
        @XmlElement(name = "combination")
        private List<Combination> combinations;

        @XmlElementWrapper(name = "product_features")
        @XmlElement(name = "product_feature")
        private List<ProductFeature> productFeatures;

        @XmlElementWrapper(name = "tags")
        @XmlElement(name = "tag")
        private List<Tag> tags;

        // Getter e Setter

        public List<Category> getCategories() {
            return categories;
        }

        public void setCategories(List<Category> categories) {
            this.categories = categories;
        }

        public List<Image> getImages() {
            return images;
        }

        public void setImages(List<Image> images) {
            this.images = images;
        }

        public List<Combination> getCombinations() {
            return combinations;
        }

        public void setCombinations(List<Combination> combinations) {
            this.combinations = combinations;
        }

        public List<ProductFeature> getProductFeatures() {
            return productFeatures;
        }

        public void setProductFeatures(List<ProductFeature> productFeatures) {
            this.productFeatures = productFeatures;
        }

        public List<Tag> getTags() {
            return tags;
        }

        public void setTags(List<Tag> tags) {
            this.tags = tags;
        }

        // Classi interne di Associations

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class Category {
            @XmlElement(name = "id")
            private Integer id;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class Image {
            @XmlElement(name = "id")
            private Integer id;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class Combination {
            @XmlElement(name = "id")
            private Integer id;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class ProductFeature {
            @XmlElement(name = "id")
            private Integer id;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class Tag {
            @XmlElement(name = "id")
            private Integer id;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }
        }
    }
    // --- Getter e Setter ---
    public Integer getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(Integer idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public Integer getIdCategoryDefault() {
        return idCategoryDefault;
    }

    public void setIdCategoryDefault(Integer idCategoryDefault) {
        this.idCategoryDefault = idCategoryDefault;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public Integer getCacheDefaultAttribute() {
        return cacheDefaultAttribute;
    }

    public void setCacheDefaultAttribute(Integer cacheDefaultAttribute) {
        this.cacheDefaultAttribute = cacheDefaultAttribute;
    }

    public Integer getIdDefaultImage() {
        return idDefaultImage;
    }

    public void setIdDefaultImage(Integer idDefaultImage) {
        this.idDefaultImage = idDefaultImage;
    }

    public Integer getIdDefaultCombination() {
        return idDefaultCombination;
    }

    public void setIdDefaultCombination(Integer idDefaultCombination) {
        this.idDefaultCombination = idDefaultCombination;
    }

    public Integer getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public Integer getPositionInCategory() {
        return positionInCategory;
    }

    public void setPositionInCategory(Integer positionInCategory) {
        this.positionInCategory = positionInCategory;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIdShopDefault() {
        return idShopDefault;
    }

    public void setIdShopDefault(Integer idShopDefault) {
        this.idShopDefault = idShopDefault;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Boolean getQuantityDiscount() {
        return quantityDiscount;
    }

    public void setQuantityDiscount(Boolean quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
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

    public Boolean getCacheIsPack() {
        return cacheIsPack;
    }

    public void setCacheIsPack(Boolean cacheIsPack) {
        this.cacheIsPack = cacheIsPack;
    }

    public Boolean getCacheHasAttachments() {
        return cacheHasAttachments;
    }

    public void setCacheHasAttachments(Boolean cacheHasAttachments) {
        this.cacheHasAttachments = cacheHasAttachments;
    }

    public Boolean getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAdditionalDeliveryTimes() {
        return additionalDeliveryTimes;
    }

    public void setAdditionalDeliveryTimes(Integer additionalDeliveryTimes) {
        this.additionalDeliveryTimes = additionalDeliveryTimes;
    }

    public List<Language> getDeliveryInStock() {
        return deliveryInStock;
    }

    public void setDeliveryInStock(List<Language> deliveryInStock) {
        this.deliveryInStock = deliveryInStock;
    }

    public List<Language> getDeliveryOutStock() {
        return deliveryOutStock;
    }

    public void setDeliveryOutStock(List<Language> deliveryOutStock) {
        this.deliveryOutStock = deliveryOutStock;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public Boolean getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }

    public Integer getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(Integer minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }

    public Integer getLowStockThreshold() {
        return lowStockThreshold;
    }

    public void setLowStockThreshold(Integer lowStockThreshold) {
        this.lowStockThreshold = lowStockThreshold;
    }

    public Boolean getLowStockAlert() {
        return lowStockAlert;
    }

    public void setLowStockAlert(Boolean lowStockAlert) {
        this.lowStockAlert = lowStockAlert;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPriceRatio() {
        return unitPriceRatio;
    }

    public void setUnitPriceRatio(BigDecimal unitPriceRatio) {
        this.unitPriceRatio = unitPriceRatio;
    }

    public BigDecimal getAdditionalShippingCost() {
        return additionalShippingCost;
    }

    public void setAdditionalShippingCost(BigDecimal additionalShippingCost) {
        this.additionalShippingCost = additionalShippingCost;
    }

    public Integer getCustomizable() {
        return customizable;
    }

    public void setCustomizable(Integer customizable) {
        this.customizable = customizable;
    }

    public Integer getTextFields() {
        return textFields;
    }

    public void setTextFields(Integer textFields) {
        this.textFields = textFields;
    }

    public Integer getUploadableFiles() {
        return uploadableFiles;
    }

    public void setUploadableFiles(Integer uploadableFiles) {
        this.uploadableFiles = uploadableFiles;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(String redirectType) {
        this.redirectType = redirectType;
    }

    public Integer getIdTypeRedirected() {
        return idTypeRedirected;
    }

    public void setIdTypeRedirected(Integer idTypeRedirected) {
        this.idTypeRedirected = idTypeRedirected;
    }

    public Boolean getAvailableForOrder() {
        return availableForOrder;
    }

    public void setAvailableForOrder(Boolean availableForOrder) {
        this.availableForOrder = availableForOrder;
    }

    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }

    public Boolean getShowCondition() {
        return showCondition;
    }

    public void setShowCondition(Boolean showCondition) {
        this.showCondition = showCondition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Boolean getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Boolean showPrice) {
        this.showPrice = showPrice;
    }

    public Boolean getIndexed() {
        return indexed;
    }

    public void setIndexed(Boolean indexed) {
        this.indexed = indexed;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Boolean getAdvancedStockManagement() {
        return advancedStockManagement;
    }

    public void setAdvancedStockManagement(Boolean advancedStockManagement) {
        this.advancedStockManagement = advancedStockManagement;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }

    public Integer getPackStockType() {
        return packStockType;
    }

    public void setPackStockType(Integer packStockType) {
        this.packStockType = packStockType;
    }

    public List<Language> getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(List<Language> metaDescription) {
        this.metaDescription = metaDescription;
    }

    public List<Language> getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(List<Language> metaTitle) {
        this.metaTitle = metaTitle;
    }

    public List<Language> getLinkRewrite() {
        return linkRewrite;
    }

    public void setLinkRewrite(List<Language> linkRewrite) {
        this.linkRewrite = linkRewrite;
    }

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }

    public List<Language> getDescription() {
        return description;
    }

    public void setDescription(List<Language> description) {
        this.description = description;
    }

    public List<Language> getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(List<Language> descriptionShort) {
        this.descriptionShort = descriptionShort;
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

    // Le classi interne te le preparo subito dopo in un altro messaggio per non superare il limite!
}
