package org.vaadin.example;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "message")
public class Message {

    @XmlElement(name = "id_cart")
    private String idCart;

    @XmlElement(name = "id_order")
    private String idOrder;

    @XmlElement(name = "id_customer")
    private String idCustomer;

    @XmlElement(name = "id_employee")
    private String idEmployee;

    @XmlElement(name = "message")
    private String message;

    @XmlElement(name = "private")
    private String isPrivate;

    @XmlElement(name = "date_add")
    private String dateAdd;

    // === Getters and Setters ===

    public String getIdCart() {
        return idCart;
    }

    public void setIdCart(String idCart) {
        this.idCart = idCart;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(String isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
}
