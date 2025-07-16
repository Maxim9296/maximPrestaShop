package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "stock_available")
@XmlAccessorType(XmlAccessType.FIELD)
public class StockAvailable {

    @XmlElement(name = "id_product", required = true)
    private Integer idProduct;

    @XmlElement(name = "id_product_attribute", required = true)
    private Integer idProductAttribute;

    @XmlElement(name = "id_shop")
    private Integer idShop;

    @XmlElement(name = "id_shop_group")
    private Integer idShopGroup;

    @XmlElement(name = "quantity", required = true)
    private Integer quantity;

    @XmlElement(name = "depends_on_stock", required = true)
    private String dependsOnStock;

    @XmlElement(name = "out_of_stock", required = true)
    private Integer outOfStock;

    @XmlElement(name = "location")
    private String location;

    // ----------- GETTER E SETTER ------------

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Integer idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDependsOnStock() {
        return dependsOnStock;
    }

    public void setDependsOnStock(String dependsOnStock) {
        this.dependsOnStock = dependsOnStock;
    }

    public Integer getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Integer outOfStock) {
        this.outOfStock = outOfStock;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
