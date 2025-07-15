package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_state")
public class OrderState {

    @XmlElement(name = "unremovable")
    private Boolean unremovable;

    @XmlElement(name = "delivery")
    private Boolean delivery;

    @XmlElement(name = "hidden")
    private Boolean hidden;

    @XmlElement(name = "send_email")
    private Boolean sendEmail;

    @XmlElement(name = "module_name")
    private String moduleName;

    @XmlElement(name = "invoice")
    private Boolean invoice;

    @XmlElement(name = "color")
    private String color;

    @XmlElement(name = "logable")
    private Boolean logable;

    @XmlElement(name = "shipped")
    private Boolean shipped;

    @XmlElement(name = "paid")
    private Boolean paid;

    @XmlElement(name = "pdf_delivery")
    private Boolean pdfDelivery;

    @XmlElement(name = "pdf_invoice")
    private Boolean pdfInvoice;

    @XmlElement(name = "deleted")
    private Boolean deleted;

    @XmlElement(name = "name", required = true)
    private Language name;

    @XmlElement(name = "template")
    private Language template;

    // Getters e setters

    public Boolean getUnremovable() {
        return unremovable;
    }

    public void setUnremovable(Boolean unremovable) {
        this.unremovable = unremovable;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Boolean getInvoice() {
        return invoice;
    }

    public void setInvoice(Boolean invoice) {
        this.invoice = invoice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getLogable() {
        return logable;
    }

    public void setLogable(Boolean logable) {
        this.logable = logable;
    }

    public Boolean getShipped() {
        return shipped;
    }

    public void setShipped(Boolean shipped) {
        this.shipped = shipped;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Boolean getPdfDelivery() {
        return pdfDelivery;
    }

    public void setPdfDelivery(Boolean pdfDelivery) {
        this.pdfDelivery = pdfDelivery;
    }

    public Boolean getPdfInvoice() {
        return pdfInvoice;
    }

    public void setPdfInvoice(Boolean pdfInvoice) {
        this.pdfInvoice = pdfInvoice;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
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
