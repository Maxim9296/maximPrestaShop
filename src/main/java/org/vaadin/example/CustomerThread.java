package org.vaadin.example;



import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customer_thread")
public class CustomerThread {

    @XmlElement(name = "id_lang", required = true)
    private Long idLang;

    @XmlElement(name = "id_shop")
    private Long idShop;

    @XmlElement(name = "id_customer")
    private Long idCustomer;

    @XmlElement(name = "id_order")
    private Long idOrder;

    @XmlElement(name = "id_product")
    private Long idProduct;

    @XmlElement(name = "id_contact", required = true)
    private Long idContact;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "token", required = true)
    private String token;

    @XmlElement(name = "status")
    private String status;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    @XmlElement(name = "associations")
    private Associations associations;

    // === GETTERS AND SETTERS ===

    public Long getIdLang() {
        return idLang;
    }

    public void setIdLang(Long idLang) {
        this.idLang = idLang;
    }

    public Long getIdShop() {
        return idShop;
    }

    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getIdContact() {
        return idContact;
    }

    public void setIdContact(Long idContact) {
        this.idContact = idContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // === ASSOCIATIONS INNER CLASS ===
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElement(name = "customer_messages")
        private CustomerMessages customerMessages;

        public CustomerMessages getCustomerMessages() {
            return customerMessages;
        }

        public void setCustomerMessages(CustomerMessages customerMessages) {
            this.customerMessages = customerMessages;
        }
    }

    // === CUSTOMER_MESSAGES INNER CLASS ===
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class CustomerMessages {

        @XmlElement(name = "customer_message")
        private List<CustomerMessage> customerMessage;

        public List<CustomerMessage> getCustomerMessage() {
            return customerMessage;
        }

        public void setCustomerMessage(List<CustomerMessage> customerMessage) {
            this.customerMessage = customerMessage;
        }
    }

    // === CUSTOMER_MESSAGE INNER CLASS ===
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class CustomerMessage {

        @XmlElement(name = "id")
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
