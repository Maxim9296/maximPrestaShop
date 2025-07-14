package org.vaadin.example;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "category")
@XmlAccessorType(XmlAccessType.FIELD)
public class Category {

    @XmlElement(name = "id_parent")
    private Integer idParent;

    @XmlElement(name = "level_depth")
    private Integer levelDepth;

    @XmlElement(name = "nb_products_recursive")
    private Integer nbProductsRecursive;

    @XmlElement(name = "active")
    private Boolean active;

    @XmlElement(name = "id_shop_default")
    private Integer idShopDefault;

    @XmlElement(name = "is_root_category")
    private Boolean isRootCategory;

    @XmlElement(name = "position")
    private Integer position;

    @XmlElement(name = "redirect_type")
    private String redirectType;

    @XmlElement(name = "id_type_redirected")
    private Integer idTypeRedirected;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    // Campi multilingua (usa la tua classe Language)
    @XmlElement(name = "name")
    private Language name;

    @XmlElement(name = "link_rewrite")
    private Language linkRewrite;

    @XmlElement(name = "description")
    private Language description;

    @XmlElement(name = "additional_description")
    private Language additionalDescription;

    @XmlElement(name = "meta_title")
    private Language metaTitle;

    @XmlElement(name = "meta_description")
    private Language metaDescription;

    @XmlElement(name = "associations")
    private Associations associations;

    // =====================
    // GETTERS & SETTERS
    // =====================

    public Integer getIdParent() {
        return idParent;
    }

    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    public Integer getLevelDepth() {
        return levelDepth;
    }

    public void setLevelDepth(Integer levelDepth) {
        this.levelDepth = levelDepth;
    }

    public Integer getNbProductsRecursive() {
        return nbProductsRecursive;
    }

    public void setNbProductsRecursive(Integer nbProductsRecursive) {
        this.nbProductsRecursive = nbProductsRecursive;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getIdShopDefault() {
        return idShopDefault;
    }

    public void setIdShopDefault(Integer idShopDefault) {
        this.idShopDefault = idShopDefault;
    }

    public Boolean getIsRootCategory() {
        return isRootCategory;
    }

    public void setIsRootCategory(Boolean isRootCategory) {
        this.isRootCategory = isRootCategory;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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

    public Language getName() {
        return name;
    }

    public void setName(Language name) {
        this.name = name;
    }

    public Language getLinkRewrite() {
        return linkRewrite;
    }

    public void setLinkRewrite(Language linkRewrite) {
        this.linkRewrite = linkRewrite;
    }

    public Language getDescription() {
        return description;
    }

    public void setDescription(Language description) {
        this.description = description;
    }

    public Language getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(Language additionalDescription) {
        this.additionalDescription = additionalDescription;
    }

    public Language getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(Language metaTitle) {
        this.metaTitle = metaTitle;
    }

    public Language getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(Language metaDescription) {
        this.metaDescription = metaDescription;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // =====================
    // Inner class Associations
    // =====================
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {
        @XmlElementWrapper(name = "categories")
        @XmlElement(name = "category")
        private java.util.List<IdOnly> categories;

        @XmlElementWrapper(name = "products")
        @XmlElement(name = "product")
        private java.util.List<IdOnly> products;

        public java.util.List<IdOnly> getCategories() {
            return categories;
        }

        public void setCategories(java.util.List<IdOnly> categories) {
            this.categories = categories;
        }

        public java.util.List<IdOnly> getProducts() {
            return products;
        }

        public void setProducts(java.util.List<IdOnly> products) {
            this.products = products;
        }
    }

    // =====================
    // Inner class IdOnly
    // =====================
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class IdOnly {
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
