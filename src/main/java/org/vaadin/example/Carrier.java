package org.vaadin.example;


import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "carrier")
public class Carrier{

    @XmlElement(name = "deleted")
    private Boolean deleted;

    @XmlElement(name = "is_module")
    private Boolean isModule;

    @XmlElement(name = "id_tax_rules_group")
    private Long idTaxRulesGroup;

    @XmlElement(name = "id_reference")
    private Long idReference;

    @XmlElement(name = "name", required = true)
    private String name;

    @XmlElement(name = "active", required = true)
    private Boolean active;

    @XmlElement(name = "is_free")
    private Boolean isFree;

    @XmlElement(name = "url")
    private String url;

    @XmlElement(name = "shipping_handling")
    private Boolean shippingHandling;

    @XmlElement(name = "shipping_external")
    private String shippingExternal;

    @XmlElement(name = "range_behavior")
    private Boolean rangeBehavior;

    @XmlElement(name = "shipping_method")
    private Integer shippingMethod;

    @XmlElement(name = "max_width")
    private Integer maxWidth;

    @XmlElement(name = "max_height")
    private Integer maxHeight;

    @XmlElement(name = "max_depth")
    private Integer maxDepth;

    @XmlElement(name = "max_weight")
    private Double maxWeight;

    @XmlElement(name = "grade")
    private Integer grade;

    @XmlElement(name = "external_module_name")
    private String externalModuleName;

    @XmlElement(name = "need_range")
    private String needRange;

    @XmlElement(name = "position")
    private String position;

    @XmlElementWrapper(name = "delay")
    @XmlElement(name = "language")
    private List<Language> delay;

    // Getter e Setter

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getIsModule() {
        return isModule;
    }

    public void setIsModule(Boolean isModule) {
        this.isModule = isModule;
    }

    public Long getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Long idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public Long getIdReference() {
        return idReference;
    }

    public void setIdReference(Long idReference) {
        this.idReference = idReference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getShippingHandling() {
        return shippingHandling;
    }

    public void setShippingHandling(Boolean shippingHandling) {
        this.shippingHandling = shippingHandling;
    }

    public String getShippingExternal() {
        return shippingExternal;
    }

    public void setShippingExternal(String shippingExternal) {
        this.shippingExternal = shippingExternal;
    }

    public Boolean getRangeBehavior() {
        return rangeBehavior;
    }

    public void setRangeBehavior(Boolean rangeBehavior) {
        this.rangeBehavior = rangeBehavior;
    }

    public Integer getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(Integer shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Integer getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Integer getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getExternalModuleName() {
        return externalModuleName;
    }

    public void setExternalModuleName(String externalModuleName) {
        this.externalModuleName = externalModuleName;
    }

    public String getNeedRange() {
        return needRange;
    }

    public void setNeedRange(String needRange) {
        this.needRange = needRange;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Language> getDelay() {
        return delay;
    }

    public void setDelay(List<Language> delay) {
        this.delay = delay;
    }
}