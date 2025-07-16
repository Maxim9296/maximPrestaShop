package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "supplier")
@XmlAccessorType(XmlAccessType.FIELD)
public class Supplier {

    @XmlElement(name = "link_rewrite")
    private String linkRewrite;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    // description with <language> children
    @XmlElementWrapper(name = "description")
    @XmlElement(name = "language")
    private List<Language> description;

    // meta_title with <language> children
    @XmlElementWrapper(name = "meta_title")
    @XmlElement(name = "language")
    private List<Language> metaTitle;

    // meta_description with <language> children
    @XmlElementWrapper(name = "meta_description")
    @XmlElement(name = "language")
    private List<Language> metaDescription;

    // GETTERS & SETTERS

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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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
}
