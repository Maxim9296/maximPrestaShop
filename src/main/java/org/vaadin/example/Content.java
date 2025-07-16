package org.vaadin.example;



import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "content")
public class Content {

    @XmlElement(name = "id_cms_category")
    private Integer idCmsCategory;

    @XmlElement(name = "position")
    private Integer position;

    @XmlElement(name = "indexation")
    private String indexation;

    @XmlElement(name = "active")
    private String active;

    @XmlElementWrapper(name = "meta_description")
    @XmlElement(name = "language")
    private List<Language> metaDescription;

    @XmlElementWrapper(name = "meta_title")
    @XmlElement(name = "language")
    private List<Language> metaTitle;

    @XmlElementWrapper(name = "head_seo_title")
    @XmlElement(name = "language")
    private List<Language> headSeoTitle;

    @XmlElementWrapper(name = "link_rewrite")
    @XmlElement(name = "language")
    private List<Language> linkRewrite;

    @XmlElementWrapper(name = "content")
    @XmlElement(name = "language")
    private List<Language> content;

    // === Getters and setters ===

    public Integer getIdCmsCategory() {
        return idCmsCategory;
    }

    public void setIdCmsCategory(Integer idCmsCategory) {
        this.idCmsCategory = idCmsCategory;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getIndexation() {
        return indexation;
    }

    public void setIndexation(String indexation) {
        this.indexation = indexation;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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

    public List<Language> getHeadSeoTitle() {
        return headSeoTitle;
    }

    public void setHeadSeoTitle(List<Language> headSeoTitle) {
        this.headSeoTitle = headSeoTitle;
    }

    public List<Language> getLinkRewrite() {
        return linkRewrite;
    }

    public void setLinkRewrite(List<Language> linkRewrite) {
        this.linkRewrite = linkRewrite;
    }

    public List<Language> getContent() {
        return content;
    }

    public void setContent(List<Language> content) {
        this.content = content;
    }
}
