package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_payment")
public class OrderPayment {

    @XmlElement(name = "order_reference")
    private String orderReference;

    @XmlElement(name = "id_currency", required = true)
    private Integer idCurrency;

    @XmlElement(name = "amount", required = true)
    private String amount;

    @XmlElement(name = "payment_method")
    private String paymentMethod;

    @XmlElement(name = "conversion_rate")
    private Float conversionRate;

    @XmlElement(name = "transaction_id")
    private String transactionId;

    @XmlElement(name = "card_number")
    private String cardNumber;

    @XmlElement(name = "card_brand")
    private String cardBrand;

    @XmlElement(name = "card_expiration")
    private String cardExpiration;

    @XmlElement(name = "card_holder")
    private String cardHolder;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "id_employee")
    private Integer idEmployee;

    // Getters and setters

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Float conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }
}
