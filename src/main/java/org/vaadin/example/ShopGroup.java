package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "shop_group")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopGroup {

    @XmlElement
    private String name;

    @XmlElement
    private String color;

    @XmlElement(name = "share_customer")
    private String shareCustomer;

    @XmlElement(name = "share_order")
    private String shareOrder;

    @XmlElement(name = "share_stock")
    private String shareStock;

    @XmlElement
    private String active;

    @XmlElement
    private String deleted;

    // ----- GETTER e SETTER -----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isShareCustomer() {
        return shareCustomer;
    }

    public void setShareCustomer(String shareCustomer) {
        this.shareCustomer = shareCustomer;
    }

    public String isShareOrder() {
        return shareOrder;
    }

    public void setShareOrder(String shareOrder) {
        this.shareOrder = shareOrder;
    }

    public String isShareStock() {
        return shareStock;
    }

    public void setShareStock(String shareStock) {
        this.shareStock = shareStock;
    }

    public String isActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String isDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
