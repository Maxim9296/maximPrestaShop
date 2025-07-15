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
    private boolean shareCustomer;

    @XmlElement(name = "share_order")
    private boolean shareOrder;

    @XmlElement(name = "share_stock")
    private boolean shareStock;

    @XmlElement
    private boolean active;

    @XmlElement
    private boolean deleted;

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

    public boolean isShareCustomer() {
        return shareCustomer;
    }

    public void setShareCustomer(boolean shareCustomer) {
        this.shareCustomer = shareCustomer;
    }

    public boolean isShareOrder() {
        return shareOrder;
    }

    public void setShareOrder(boolean shareOrder) {
        this.shareOrder = shareOrder;
    }

    public boolean isShareStock() {
        return shareStock;
    }

    public void setShareStock(boolean shareStock) {
        this.shareStock = shareStock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
