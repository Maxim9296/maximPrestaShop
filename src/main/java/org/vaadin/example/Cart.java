package org.vaadin.example;

import jakarta.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "cart")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cart {

    @XmlElement(name = "id_address_delivery")
    private Long idAddressDelivery;

    @XmlElement(name = "id_address_invoice")
    private Long idAddressInvoice;

    @XmlElement(name = "id_currency", required = true)
    private Long idCurrency;

    @XmlElement(name = "id_customer")
    private Long idCustomer;

    @XmlElement(name = "id_guest")
    private Long idGuest;

    @XmlElement(name = "id_lang", required = true)
    private Long idLang;

    @XmlElement(name = "id_shop_group")
    private Long idShopGroup;

    @XmlElement(name = "id_shop")
    private Long idShop;

    @XmlElement(name = "id_carrier")
    private Long idCarrier;

    @XmlElement(name = "recyclable")
    private Boolean recyclable;

    @XmlElement(name = "gift")
    private Boolean gift;

    @XmlElement(name = "gift_message")
    private String giftMessage;

    @XmlElement(name = "mobile_theme")
    private Boolean mobileTheme;

    @XmlElement(name = "delivery_option")
    private String deliveryOption;

    @XmlElement(name = "secure_key")
    private String secureKey;

    @XmlElement(name = "allow_seperated_package")
    private Boolean allowSeperatedPackage;

    @XmlElement(name = "date_add")
    private Date dateAdd;

    @XmlElement(name = "date_upd")
    private Date dateUpd;

    // Lista di CartRow gestita DIRETTAMENTE qui
    @XmlElementWrapper(name = "associations")
    @XmlElement(name = "cart_rows")
    private List<CartRow> cartRows;

    // ===== Inner Class per cart_row =====
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class CartRow {

        @XmlElement(name = "id_product")
        private Long idProduct;

        @XmlElement(name = "id_product_attribute")
        private Long idProductAttribute;

        @XmlElement(name = "id_address_delivery")
        private Long idAddressDelivery;

        @XmlElement(name = "id_customization")
        private Long idCustomization;

        @XmlElement(name = "quantity")
        private Integer quantity;

        // Getters e Setters
        public Long getIdProduct() { return idProduct; }
        public void setIdProduct(Long idProduct) { this.idProduct = idProduct; }

        public Long getIdProductAttribute() { return idProductAttribute; }
        public void setIdProductAttribute(Long idProductAttribute) { this.idProductAttribute = idProductAttribute; }

        public Long getIdAddressDelivery() { return idAddressDelivery; }
        public void setIdAddressDelivery(Long idAddressDelivery) { this.idAddressDelivery = idAddressDelivery; }

        public Long getIdCustomization() { return idCustomization; }
        public void setIdCustomization(Long idCustomization) { this.idCustomization = idCustomization; }

        public Integer getQuantity() { return quantity; }
        public void setQuantity(Integer quantity) { this.quantity = quantity; }
    }

    // ===== Getters e Setters Cart =====

    public Long getIdAddressDelivery() { return idAddressDelivery; }
    public void setIdAddressDelivery(Long idAddressDelivery) { this.idAddressDelivery = idAddressDelivery; }

    public Long getIdAddressInvoice() { return idAddressInvoice; }
    public void setIdAddressInvoice(Long idAddressInvoice) { this.idAddressInvoice = idAddressInvoice; }

    public Long getIdCurrency() { return idCurrency; }
    public void setIdCurrency(Long idCurrency) { this.idCurrency = idCurrency; }

    public Long getIdCustomer() { return idCustomer; }
    public void setIdCustomer(Long idCustomer) { this.idCustomer = idCustomer; }

    public Long getIdGuest() { return idGuest; }
    public void setIdGuest(Long idGuest) { this.idGuest = idGuest; }

    public Long getIdLang() { return idLang; }
    public void setIdLang(Long idLang) { this.idLang = idLang; }

    public Long getIdShopGroup() { return idShopGroup; }
    public void setIdShopGroup(Long idShopGroup) { this.idShopGroup = idShopGroup; }

    public Long getIdShop() { return idShop; }
    public void setIdShop(Long idShop) { this.idShop = idShop; }

    public Long getIdCarrier() { return idCarrier; }
    public void setIdCarrier(Long idCarrier) { this.idCarrier = idCarrier; }

    public Boolean getRecyclable() { return recyclable; }
    public void setRecyclable(Boolean recyclable) { this.recyclable = recyclable; }

    public Boolean getGift() { return gift; }
    public void setGift(Boolean gift) { this.gift = gift; }

    public String getGiftMessage() { return giftMessage; }
    public void setGiftMessage(String giftMessage) { this.giftMessage = giftMessage; }

    public Boolean getMobileTheme() { return mobileTheme; }
    public void setMobileTheme(Boolean mobileTheme) { this.mobileTheme = mobileTheme; }

    public String getDeliveryOption() { return deliveryOption; }
    public void setDeliveryOption(String deliveryOption) { this.deliveryOption = deliveryOption; }

    public String getSecureKey() { return secureKey; }
    public void setSecureKey(String secureKey) { this.secureKey = secureKey; }

    public Boolean getAllowSeperatedPackage() { return allowSeperatedPackage; }
    public void setAllowSeperatedPackage(Boolean allowSeperatedPackage) { this.allowSeperatedPackage = allowSeperatedPackage; }

    public Date getDateAdd() { return dateAdd; }
    public void setDateAdd(Date dateAdd) { this.dateAdd = dateAdd; }

    public Date getDateUpd() { return dateUpd; }
    public void setDateUpd(Date dateUpd) { this.dateUpd = dateUpd; }

    public List<CartRow> getCartRows() { return cartRows; }
    public void setCartRows(List<CartRow> cartRows) { this.cartRows = cartRows; }
}
