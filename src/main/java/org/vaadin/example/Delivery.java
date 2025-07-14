package org.vaadin.example;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class Delivery {

    @XmlElement(name = "id_carrier", required = true)
    private Long idCarrier;

    @XmlElement(name = "id_range_price", required = true)
    private Long idRangePrice;

    @XmlElement(name = "id_range_weight", required = true)
    private Long idRangeWeight;

    @XmlElement(name = "id_zone", required = true)
    private Long idZone;

    @XmlElement(name = "id_shop")
    private Long idShop;

    @XmlElement(name = "id_shop_group")
    private Long idShopGroup;

    @XmlElement(name = "price", required = true)
    private BigDecimal price;

    public Delivery() {}

    public Long getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Long idCarrier) {
        this.idCarrier = idCarrier;
    }

    public Long getIdRangePrice() {
        return idRangePrice;
    }

    public void setIdRangePrice(Long idRangePrice) {
        this.idRangePrice = idRangePrice;
    }

    public Long getIdRangeWeight() {
        return idRangeWeight;
    }

    public void setIdRangeWeight(Long idRangeWeight) {
        this.idRangeWeight = idRangeWeight;
    }

    public Long getIdZone() {
        return idZone;
    }

    public void setIdZone(Long idZone) {
        this.idZone = idZone;
    }

    public Long getIdShop() {
        return idShop;
    }

    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }

    public Long getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Long idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
