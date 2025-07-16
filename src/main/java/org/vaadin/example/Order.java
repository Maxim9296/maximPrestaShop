package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order")
public class Order {

    @XmlElement(name = "id_address_delivery", required = true)
    private Long idAddressDelivery;

    @XmlElement(name = "id_address_invoice", required = true)
    private Long idAddressInvoice;

    @XmlElement(name = "id_cart", required = true)
    private Long idCart;

    @XmlElement(name = "id_currency", required = true)
    private Long idCurrency;

    @XmlElement(name = "id_lang", required = true)
    private Long idLang;

    @XmlElement(name = "id_customer", required = true)
    private Long idCustomer;

    @XmlElement(name = "id_carrier", required = true)
    private Long idCarrier;

    @XmlElement(name = "current_state")
    private Long currentState;

    @XmlElement(name = "module", required = true)
    private String module;

    @XmlElement(name = "invoice_number")
    private Long invoiceNumber;

    @XmlElement(name = "invoice_date")
    private String invoiceDate;

    @XmlElement(name = "delivery_number")
    private Long deliveryNumber;

    @XmlElement(name = "delivery_date")
    private String deliveryDate;

    @XmlElement(name = "valid")
    private String valid;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    @XmlElement(name = "shipping_number")
    private String shippingNumber;

    @XmlElement(name = "note")
    private String note;

    @XmlElement(name = "id_shop_group")
    private Long idShopGroup;

    @XmlElement(name = "id_shop")
    private Long idShop;

    @XmlElement(name = "secure_key")
    private String secureKey;

    @XmlElement(name = "payment", required = true)
    private String payment;

    @XmlElement(name = "recyclable")
    private String recyclable;

    @XmlElement(name = "gift")
    private String gift;

    @XmlElement(name = "gift_message")
    private String giftMessage;

    @XmlElement(name = "mobile_theme")
    private String mobileTheme;

    @XmlElement(name = "total_discounts")
    private Double totalDiscounts;

    @XmlElement(name = "total_discounts_tax_incl")
    private Double totalDiscountsTaxIncl;

    @XmlElement(name = "total_discounts_tax_excl")
    private Double totalDiscountsTaxExcl;

    @XmlElement(name = "total_paid", required = true)
    private Double totalPaid;

    @XmlElement(name = "total_paid_tax_incl")
    private Double totalPaidTaxIncl;

    @XmlElement(name = "total_paid_tax_excl")
    private Double totalPaidTaxExcl;

    @XmlElement(name = "total_paid_real", required = true)
    private Double totalPaidReal;

    @XmlElement(name = "total_products", required = true)
    private Double totalProducts;

    @XmlElement(name = "total_products_wt", required = true)
    private Double totalProductsWt;

    @XmlElement(name = "total_shipping")
    private Double totalShipping;

    @XmlElement(name = "total_shipping_tax_incl")
    private Double totalShippingTaxIncl;

    @XmlElement(name = "total_shipping_tax_excl")
    private Double totalShippingTaxExcl;

    @XmlElement(name = "carrier_tax_rate")
    private Float carrierTaxRate;

    @XmlElement(name = "total_wrapping")
    private Double totalWrapping;

    @XmlElement(name = "total_wrapping_tax_incl")
    private Double totalWrappingTaxIncl;

    @XmlElement(name = "total_wrapping_tax_excl")
    private Double totalWrappingTaxExcl;

    @XmlElement(name = "round_mode")
    private Integer roundMode;

    @XmlElement(name = "round_type")
    private Integer roundType;

    @XmlElement(name = "conversion_rate", required = true)
    private Float conversionRate;

    @XmlElement(name = "reference")
    private String reference;

    @XmlElement(name = "associations")
    private Associations associations;

    // Getters e Setters

    public Long getIdAddressDelivery() {
        return idAddressDelivery;
    }

    public void setIdAddressDelivery(Long idAddressDelivery) {
        this.idAddressDelivery = idAddressDelivery;
    }

    public Long getIdAddressInvoice() {
        return idAddressInvoice;
    }

    public void setIdAddressInvoice(Long idAddressInvoice) {
        this.idAddressInvoice = idAddressInvoice;
    }

    public Long getIdCart() {
        return idCart;
    }

    public void setIdCart(Long idCart) {
        this.idCart = idCart;
    }

    public Long getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Long idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Long getIdLang() {
        return idLang;
    }

    public void setIdLang(Long idLang) {
        this.idLang = idLang;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Long getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Long idCarrier) {
        this.idCarrier = idCarrier;
    }

    public Long getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Long currentState) {
        this.currentState = currentState;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Long getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(Long deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
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

    public String getShippingNumber() {
        return shippingNumber;
    }

    public void setShippingNumber(String shippingNumber) {
        this.shippingNumber = shippingNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Long idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public Long getIdShop() {
        return idShop;
    }

    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getRecyclable() {
        return recyclable;
    }

    public void setRecyclable(String recyclable) {
        this.recyclable = recyclable;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public String getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(String mobileTheme) {
        this.mobileTheme = mobileTheme;
    }

    public Double getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(Double totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public Double getTotalDiscountsTaxIncl() {
        return totalDiscountsTaxIncl;
    }

    public void setTotalDiscountsTaxIncl(Double totalDiscountsTaxIncl) {
        this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
    }

    public Double getTotalDiscountsTaxExcl() {
        return totalDiscountsTaxExcl;
    }

    public void setTotalDiscountsTaxExcl(Double totalDiscountsTaxExcl) {
        this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
    }

    public Double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public Double getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(Double totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }

    public Double getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(Double totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }

    public Double getTotalPaidReal() {
        return totalPaidReal;
    }

    public void setTotalPaidReal(Double totalPaidReal) {
        this.totalPaidReal = totalPaidReal;
    }

    public Double getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(Double totalProducts) {
        this.totalProducts = totalProducts;
    }

    public Double getTotalProductsWt() {
        return totalProductsWt;
    }

    public void setTotalProductsWt(Double totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
    }

    public Double getTotalShipping() {
        return totalShipping;
    }

    public void setTotalShipping(Double totalShipping) {
        this.totalShipping = totalShipping;
    }

    public Double getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(Double totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public Double getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(Double totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public Float getCarrierTaxRate() {
        return carrierTaxRate;
    }

    public void setCarrierTaxRate(Float carrierTaxRate) {
        this.carrierTaxRate = carrierTaxRate;
    }

    public Double getTotalWrapping() {
        return totalWrapping;
    }

    public void setTotalWrapping(Double totalWrapping) {
        this.totalWrapping = totalWrapping;
    }

    public Double getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(Double totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }

    public Double getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(Double totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }

    public Integer getRoundMode() {
        return roundMode;
    }

    public void setRoundMode(Integer roundMode) {
        this.roundMode = roundMode;
    }

    public Integer getRoundType() {
        return roundType;
    }

    public void setRoundType(Integer roundType) {
        this.roundType = roundType;
    }

    public Float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Float conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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
        @XmlElement(name = "order_rows")
        private OrderRows orderRows;

        public OrderRows getOrderRows() {
            return orderRows;
        }

        public void setOrderRows(OrderRows orderRows) {
            this.orderRows = orderRows;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class OrderRows {
        @XmlElement(name = "order_row")
        private List<OrderRow> orderRow;

        public List<OrderRow> getOrderRow() {
            return orderRow;
        }

        public void setOrderRow(List<OrderRow> orderRow) {
            this.orderRow = orderRow;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class OrderRow {

        @XmlElement(name = "id")
        private Long id;

        @XmlElement(name = "product_id", required = true)
        private Long productId;

        @XmlElement(name = "product_attribute_id", required = true)
        private Long productAttributeId;

        @XmlElement(name = "product_quantity", required = true)
        private Integer productQuantity;

        @XmlElement(name = "product_name")
        private String productName;

        @XmlElement(name = "product_reference")
        private String productReference;

        @XmlElement(name = "product_ean13")
        private String productEan13;

        @XmlElement(name = "product_isbn")
        private String productIsbn;

        @XmlElement(name = "product_upc")
        private String productUpc;

        @XmlElement(name = "product_price")
        private Double productPrice;

        @XmlElement(name = "id_customization")
        private Long idCustomization;

        @XmlElement(name = "unit_price_tax_incl")
        private Double unitPriceTaxIncl;

        @XmlElement(name = "unit_price_tax_excl")
        private Double unitPriceTaxExcl;

        // Getters e Setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public Long getProductAttributeId() {
            return productAttributeId;
        }

        public void setProductAttributeId(Long productAttributeId) {
            this.productAttributeId = productAttributeId;
        }

        public Integer getProductQuantity() {
            return productQuantity;
        }

        public void setProductQuantity(Integer productQuantity) {
            this.productQuantity = productQuantity;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductReference() {
            return productReference;
        }

        public void setProductReference(String productReference) {
            this.productReference = productReference;
        }

        public String getProductEan13() {
            return productEan13;
        }

        public void setProductEan13(String productEan13) {
            this.productEan13 = productEan13;
        }

        public String getProductIsbn() {
            return productIsbn;
        }

        public void setProductIsbn(String productIsbn) {
            this.productIsbn = productIsbn;
        }

        public String getProductUpc() {
            return productUpc;
        }

        public void setProductUpc(String productUpc) {
            this.productUpc = productUpc;
        }

        public Double getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(Double productPrice) {
            this.productPrice = productPrice;
        }

        public Long getIdCustomization() {
            return idCustomization;
        }

        public void setIdCustomization(Long idCustomization) {
            this.idCustomization = idCustomization;
        }

        public Double getUnitPriceTaxIncl() {
            return unitPriceTaxIncl;
        }

        public void setUnitPriceTaxIncl(Double unitPriceTaxIncl) {
            this.unitPriceTaxIncl = unitPriceTaxIncl;
        }

        public Double getUnitPriceTaxExcl() {
            return unitPriceTaxExcl;
        }

        public void setUnitPriceTaxExcl(Double unitPriceTaxExcl) {
            this.unitPriceTaxExcl = unitPriceTaxExcl;
        }
    }
}
