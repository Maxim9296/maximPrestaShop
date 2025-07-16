package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlRootElement(name = "specific_price")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpecificPrice {

    @XmlElement(name = "id_shop_group")
    private Integer idShopGroup;

    @XmlElement(name = "id_shop", required = true)
    private Integer idShop;

    @XmlElement(name = "id_cart", required = true)
    private Integer idCart;

    @XmlElement(name = "id_product", required = true)
    private Integer idProduct;

    @XmlElement(name = "id_product_attribute")
    private Integer idProductAttribute;

    @XmlElement(name = "id_currency", required = true)
    private Integer idCurrency;

    @XmlElement(name = "id_country", required = true)
    private Integer idCountry;

    @XmlElement(name = "id_group", required = true)
    private Integer idGroup;

    @XmlElement(name = "id_customer", required = true)
    private Integer idCustomer;

    @XmlElement(name = "id_specific_price_rule")
    private Integer idSpecificPriceRule;

    @XmlElement(required = true)
    private BigDecimal price;

    @XmlElement(name = "from_quantity", required = true)
    private Integer fromQuantity;

    @XmlElement(required = true)
    private BigDecimal reduction;

    @XmlElement(name = "reduction_tax", required = true)
    private String reductionTax;

    @XmlElement(name = "reduction_type", required = true)
    private String reductionType;

    @XmlElement(required = true)
    private String from;

    @XmlElement(required = true)
    private String to;

    // -------- GETTER E SETTER --------

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdCart() {
        return idCart;
    }

    public void setIdCart(Integer idCart) {
        this.idCart = idCart;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Integer idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdSpecificPriceRule() {
        return idSpecificPriceRule;
    }

    public void setIdSpecificPriceRule(Integer idSpecificPriceRule) {
        this.idSpecificPriceRule = idSpecificPriceRule;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

    public String isReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(String reductionTax) {
        this.reductionTax = reductionTax;
    }

    public String getReductionType() {
        return reductionType;
    }

    public void setReductionType(String reductionType) {
        this.reductionType = reductionType;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
