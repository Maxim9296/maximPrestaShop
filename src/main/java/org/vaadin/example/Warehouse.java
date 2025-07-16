package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "warehouse")
@XmlAccessorType(XmlAccessType.FIELD)
public class Warehouse {

    @XmlElement(name = "id_address", required = true)
    private String idAddress;

    @XmlElement(name = "id_employee", required = true)
    private String idEmployee;

    @XmlElement(name = "id_currency", required = true)
    private String idCurrency;

    @XmlElement(name = "valuation", required = false)
    private String valuation;

    @XmlElement(name = "deleted")
    private String deleted;

    @XmlElement(required = true)
    private String reference;

    @XmlElement(required = true)
    private String name;

    @XmlElement(name = "management_type", required = true)
    private String managementType;

    @XmlElement(name = "associations")
    private Associations associations;

    // Getters e setters

    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // Classi interne per associations

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElement(name = "stocks")
        private Stocks stocks;

        @XmlElement(name = "carriers")
        private Carriers carriers;

        @XmlElement(name = "shops")
        private Shops shops;

        // Getters e setters

        public Stocks getStocks() {
            return stocks;
        }

        public void setStocks(Stocks stocks) {
            this.stocks = stocks;
        }

        public Carriers getCarriers() {
            return carriers;
        }

        public void setCarriers(Carriers carriers) {
            this.carriers = carriers;
        }

        public Shops getShops() {
            return shops;
        }

        public void setShops(Shops shops) {
            this.shops = shops;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Stocks {

        @XmlElement(name = "stock")
        private List<IdElement> stock;

        // Getter e setter
        public List<IdElement> getStock() {
            return stock;
        }

        public void setStock(List<IdElement> stock) {
            this.stock = stock;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Carriers {

        @XmlElement(name = "carrier")
        private List<IdElement> carrier;

        // Getter e setter
        public List<IdElement> getCarrier() {
            return carrier;
        }

        public void setCarrier(List<IdElement> carrier) {
            this.carrier = carrier;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Shops {

        @XmlElement(name = "shop")
        private List<Shop> shop;

        // Getter e setter
        public List<Shop> getShop() {
            return shop;
        }

        public void setShop(List<Shop> shop) {
            this.shop = shop;
        }
    }

    // Elemento generico con solo <id> inside
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class IdElement {

        @XmlElement(name = "id")
        private String id;

        // Getter e setter
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    // Shop ha id + name
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Shop {

        @XmlElement(name = "id")
        private String id;

        @XmlElement(name = "name")
        private String name;

        // Getter e setter
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
