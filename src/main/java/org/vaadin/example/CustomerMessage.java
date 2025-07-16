package org.vaadin.example;



import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customer_message")
public class CustomerMessage {

    @XmlElement(name = "id_employee")
    private Long idEmployee;

    @XmlElement(name = "id_product")
    private Long idProduct;

    @XmlElement(name = "id_customer_thread")
    private Long idCustomerThread;

    @XmlElement(name = "ip_address")
    private String ipAddress;

    @XmlElement(name = "message", required = true)
    private String message;

    @XmlElement(name = "file_name")
    private String fileName;

    @XmlElement(name = "user_agent")
    private String userAgent;

    @XmlElement(name = "private")
    private String isPrivate;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    @XmlElement(name = "read")
    private String isRead;

    // === Getters and Setters ===

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getIdCustomerThread() {
        return idCustomerThread;
    }

    public void setIdCustomerThread(Long idCustomerThread) {
        this.idCustomerThread = idCustomerThread;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
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

    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }
}
