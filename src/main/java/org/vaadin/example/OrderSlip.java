package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_slip")
public class OrderSlip {

    @XmlElement(name = "id_customer", required = true)
    private Integer idCustomer;

    @XmlElement(name = "id_order", required = true)
    private Integer idOrder;

    @XmlElement(name = "conversion_rate", required = true)
    private Float conversionRate;

    @XmlElement(name = "total_products_tax_excl", required = true)
    private Float totalProductsTaxExcl;

    @XmlElement(name = "total_products_tax_incl", required = true)
    private Float totalProductsTaxIncl;

    @XmlElement(name = "total_shipping_tax_excl", required = true)
    private Float totalShippingTaxExcl;

    @XmlElement(name = "total_shipping_tax_incl", required = true)
    private Float totalShippingTaxIncl;

    @XmlElement(name = "amount")
    private Float amount;

    @XmlElement(name = "shipping_cost")
    private String shippingCost;

    @XmlElement(name = "shipping_cost_amount")
    private Float shippingCostAmount;

    @XmlElement(name = "partial")
    private String partial;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    @XmlElement(name = "order_slip_type")
    private Integer orderSlipType;

    @XmlElementWrapper(name = "associations")
    @XmlElement(name = "order_slip_details")
    private OrderSlipDetails orderSlipDetails;

    // Inner class for associations/order_slip_details
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class OrderSlipDetails {

        @XmlElement(name = "order_slip_detail")
        private List<OrderSlipDetail> orderSlipDetail;

        // Getters and setters
        public List<OrderSlipDetail> getOrderSlipDetail() {
            return orderSlipDetail;
        }

        public void setOrderSlipDetail(List<OrderSlipDetail> orderSlipDetail) {
            this.orderSlipDetail = orderSlipDetail;
        }
    }

    // Inner class for each order_slip_detail
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class OrderSlipDetail {

        @XmlElement(name = "id")
        private String id;

        @XmlElement(name = "id_order_detail", required = true)
        private Integer idOrderDetail;

        @XmlElement(name = "product_quantity", required = true)
        private Integer productQuantity;

        @XmlElement(name = "amount_tax_excl", required = true)
        private Float amountTaxExcl;

        @XmlElement(name = "amount_tax_incl", required = true)
        private Float amountTaxIncl;

        // Getters and setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getIdOrderDetail() {
            return idOrderDetail;
        }

        public void setIdOrderDetail(Integer idOrderDetail) {
            this.idOrderDetail = idOrderDetail;
        }

        public Integer getProductQuantity() {
            return productQuantity;
        }

        public void setProductQuantity(Integer productQuantity) {
            this.productQuantity = productQuantity;
        }

        public Float getAmountTaxExcl() {
            return amountTaxExcl;
        }

        public void setAmountTaxExcl(Float amountTaxExcl) {
            this.amountTaxExcl = amountTaxExcl;
        }

        public Float getAmountTaxIncl() {
            return amountTaxIncl;
        }

        public void setAmountTaxIncl(Float amountTaxIncl) {
            this.amountTaxIncl = amountTaxIncl;
        }
    }

    // Getters and setters for main class fields

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Float conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Float getTotalProductsTaxExcl() {
        return totalProductsTaxExcl;
    }

    public void setTotalProductsTaxExcl(Float totalProductsTaxExcl) {
        this.totalProductsTaxExcl = totalProductsTaxExcl;
    }

    public Float getTotalProductsTaxIncl() {
        return totalProductsTaxIncl;
    }

    public void setTotalProductsTaxIncl(Float totalProductsTaxIncl) {
        this.totalProductsTaxIncl = totalProductsTaxIncl;
    }

    public Float getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(Float totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public Float getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(Float totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(String shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Float getShippingCostAmount() {
        return shippingCostAmount;
    }

    public void setShippingCostAmount(Float shippingCostAmount) {
        this.shippingCostAmount = shippingCostAmount;
    }

    public String getPartial() {
        return partial;
    }

    public void setPartial(String partial) {
        this.partial = partial;
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

    public Integer getOrderSlipType() {
        return orderSlipType;
    }

    public void setOrderSlipType(Integer orderSlipType) {
        this.orderSlipType = orderSlipType;
    }

    public OrderSlipDetails getOrderSlipDetails() {
        return orderSlipDetails;
    }

    public void setOrderSlipDetails(OrderSlipDetails orderSlipDetails) {
        this.orderSlipDetails = orderSlipDetails;
    }
}
