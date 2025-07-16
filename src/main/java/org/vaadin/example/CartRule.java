package org.vaadin.example;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cart_rule")
public class CartRule {

    @XmlElement(name = "id_customer")
    private Integer idCustomer;

    @XmlElement(name = "date_from")
    private String dateFrom;

    @XmlElement(name = "date_to")
    private String dateTo;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "quantity")
    private Integer quantity;

    @XmlElement(name = "quantity_per_user")
    private Integer quantityPerUser;

    @XmlElement(name = "priority")
    private Integer priority;

    @XmlElement(name = "partial_use")
    private String partialUse;

    @XmlElement(name = "code")
    private String code;

    @XmlElement(name = "minimum_amount")
    private Double minimumAmount;

    @XmlElement(name = "minimum_amount_tax")
    private String minimumAmountTax;

    @XmlElement(name = "minimum_amount_currency")
    private Integer minimumAmountCurrency;

    @XmlElement(name = "minimum_amount_shipping")
    private String minimumAmountShipping;

    @XmlElement(name = "country_restriction")
    private String countryRestriction;

    @XmlElement(name = "carrier_restriction")
    private String carrierRestriction;

    @XmlElement(name = "group_restriction")
    private String groupRestriction;

    @XmlElement(name = "cart_rule_restriction")
    private String cartRuleRestriction;

    @XmlElement(name = "product_restriction")
    private String productRestriction;

    @XmlElement(name = "shop_restriction")
    private String shopRestriction;

    @XmlElement(name = "free_shipping")
    private String freeShipping;

    @XmlElement(name = "reduction_percent")
    private Double reductionPercent;

    @XmlElement(name = "reduction_amount")
    private Double reductionAmount;

    @XmlElement(name = "reduction_tax")
    private String reductionTax;

    @XmlElement(name = "reduction_currency")
    private Integer reductionCurrency;

    @XmlElement(name = "reduction_product")
    private Integer reductionProduct;

    @XmlElement(name = "reduction_exclude_special")
    private String reductionExcludeSpecial;

    @XmlElement(name = "gift_product")
    private Integer giftProduct;

    @XmlElement(name = "gift_product_attribute")
    private Integer giftProductAttribute;

    @XmlElement(name = "highlight")
    private String highlight;

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    // Per il campo <name> che ha lingue annidate
    @XmlElementWrapper(name = "name")
    @XmlElement(name = "language")
    private List<Language> name;

    // Getter e Setter
    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantityPerUser() {
        return quantityPerUser;
    }

    public void setQuantityPerUser(Integer quantityPerUser) {
        this.quantityPerUser = quantityPerUser;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getPartialUse() {
        return partialUse;
    }

    public void setPartialUse(String partialUse) {
        this.partialUse = partialUse;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(Double minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public String getMinimumAmountTax() {
        return minimumAmountTax;
    }

    public void setMinimumAmountTax(String minimumAmountTax) {
        this.minimumAmountTax = minimumAmountTax;
    }

    public Integer getMinimumAmountCurrency() {
        return minimumAmountCurrency;
    }

    public void setMinimumAmountCurrency(Integer minimumAmountCurrency) {
        this.minimumAmountCurrency = minimumAmountCurrency;
    }

    public String getMinimumAmountShipping() {
        return minimumAmountShipping;
    }

    public void setMinimumAmountShipping(String minimumAmountShipping) {
        this.minimumAmountShipping = minimumAmountShipping;
    }

    public String getCountryRestriction() {
        return countryRestriction;
    }

    public void setCountryRestriction(String countryRestriction) {
        this.countryRestriction = countryRestriction;
    }

    public String getCarrierRestriction() {
        return carrierRestriction;
    }

    public void setCarrierRestriction(String carrierRestriction) {
        this.carrierRestriction = carrierRestriction;
    }

    public String getGroupRestriction() {
        return groupRestriction;
    }

    public void setGroupRestriction(String groupRestriction) {
        this.groupRestriction = groupRestriction;
    }

    public String getCartRuleRestriction() {
        return cartRuleRestriction;
    }

    public void setCartRuleRestriction(String cartRuleRestriction) {
        this.cartRuleRestriction = cartRuleRestriction;
    }

    public String getProductRestriction() {
        return productRestriction;
    }

    public void setProductRestriction(String productRestriction) {
        this.productRestriction = productRestriction;
    }

    public String getShopRestriction() {
        return shopRestriction;
    }

    public void setShopRestriction(String shopRestriction) {
        this.shopRestriction = shopRestriction;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Double getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(Double reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    public Double getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(Double reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public String getReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(String reductionTax) {
        this.reductionTax = reductionTax;
    }

    public Integer getReductionCurrency() {
        return reductionCurrency;
    }

    public void setReductionCurrency(Integer reductionCurrency) {
        this.reductionCurrency = reductionCurrency;
    }

    public Integer getReductionProduct() {
        return reductionProduct;
    }

    public void setReductionProduct(Integer reductionProduct) {
        this.reductionProduct = reductionProduct;
    }

    public String getReductionExcludeSpecial() {
        return reductionExcludeSpecial;
    }

    public void setReductionExcludeSpecial(String reductionExcludeSpecial) {
        this.reductionExcludeSpecial = reductionExcludeSpecial;
    }

    public Integer getGiftProduct() {
        return giftProduct;
    }

    public void setGiftProduct(Integer giftProduct) {
        this.giftProduct = giftProduct;
    }

    public Integer getGiftProductAttribute() {
        return giftProductAttribute;
    }

    public void setGiftProductAttribute(Integer giftProductAttribute) {
        this.giftProductAttribute = giftProductAttribute;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
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

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }
}
