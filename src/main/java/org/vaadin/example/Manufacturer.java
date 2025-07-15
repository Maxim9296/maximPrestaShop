package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "manufacturer")
public class Manufacturer {

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "link_rewrite")
    private String linkRewrite;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    @XmlElementWrapper(name = "description")
    @XmlElement(name = "language")
    private List<Language> description;

    @XmlElementWrapper(name = "short_description")
    @XmlElement(name = "language")
    private List<Language> shortDescription;

    @XmlElementWrapper(name = "meta_title")
    @XmlElement(name = "language")
    private List<Language> metaTitle;

    @XmlElementWrapper(name = "meta_description")
    @XmlElement(name = "language")
    private List<Language> metaDescription;

    @XmlElement(name = "associations")
    private Associations associations;

    // === Nested class for Associations ===
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElementWrapper(name = "addresses")
        @XmlElement(name = "address")
        private List<Address> addresses;

        // Getter and setter
        public List<Address> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<Address> addresses) {
            this.addresses = addresses;
        }
    }

    // === Nested class for Address ===
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Address {

        @XmlElement(name = "id")
        private String id;

        // Getter and setter
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    // === Getters and Setters for Manufacturer ===

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLinkRewrite() {
        return linkRewrite;
    }

    public void setLinkRewrite(String linkRewrite) {
        this.linkRewrite = linkRewrite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Language> getDescription() {
        return description;
    }

    public void setDescription(List<Language> description) {
        this.description = description;
    }

    public List<Language> getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(List<Language> shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<Language> getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(List<Language> metaTitle) {
        this.metaTitle = metaTitle;
    }

    public List<Language> getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(List<Language> metaDescription) {
        this.metaDescription = metaDescription;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }
}
