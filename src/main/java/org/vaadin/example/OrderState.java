package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_state")
public class OrderState {

    @XmlElement(name = "unremovable")
    private String unremovable;

    @XmlElement(name = "delivery")
    private String delivery;

    @XmlElement(name = "hidden")
    private String hidden;

    @XmlElement(name = "send_email")
    private String sendEmail;

    @XmlElement(name = "module_name")
    private String moduleName;

    @XmlElement(name = "invoice")
    private String invoice;

    @XmlElement(name = "color")
    private String color;

    @XmlElement(name = "logable")
    private String logable;

    @XmlElement(name = "shipped")
    private String shipped;

    @XmlElement(name = "paid")
    private String paid;

    @XmlElement(name = "pdf_delivery")
    private String pdfDelivery;

    @XmlElement(name = "pdf_invoice")
    private String pdfInvoice;

    @XmlElement(name = "deleted")
    private String deleted;

    @XmlElement(name = "name", required = true)
    private Language name;

    @XmlElement(name = "template")
    private Language template;

    // Getters e setters

    public String getUnremovable() {
        return unremovable;
    }

    public void setUnremovable(String unremovable) {
        this.unremovable = unremovable;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogable() {
        return logable;
    }

    public void setLogable(String logable) {
        this.logable = logable;
    }

    public String getShipped() {
        return shipped;
    }

    public void setShipped(String shipped) {
        this.shipped = shipped;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getPdfDelivery() {
        return pdfDelivery;
    }

    public void setPdfDelivery(String pdfDelivery) {
        this.pdfDelivery = pdfDelivery;
    }

    public String getPdfInvoice() {
        return pdfInvoice;
    }

    public void setPdfInvoice(String pdfInvoice) {
        this.pdfInvoice = pdfInvoice;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Language getName() {
        return name;
    }

    public void setName(Language name) {
        this.name = name;
    }

    public Language getTemplate() {
        return template;
    }

    public void setTemplate(Language template) {
        this.template = template;
    }
}
