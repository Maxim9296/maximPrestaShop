package org.vaadin.example;



import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_detail")
public class OrderDetail {

    @XmlElement(name = "id_order")
    private Integer idOrder;

    @XmlElement(name = "product_id")
    private Integer productId;

    @XmlElement(name = "product_attribute_id")
    private Integer productAttributeId;

    @XmlElement(name = "product_quantity_reinjected")
    private Integer productQuantityReinjected;

    @XmlElement(name = "group_reduction")
    private BigDecimal groupReduction;

    @XmlElement(name = "discount_quantity_applied")
    private Integer discountQuantityApplied;

    @XmlElement(name = "download_hash")
    private String downloadHash;

    @XmlElement(name = "download_deadline")
    private String downloadDeadline;

    @XmlElement(name = "id_order_invoice")
    private Integer idOrderInvoice;

    @XmlElement(name = "id_warehouse")
    private Integer idWarehouse;

    @XmlElement(name = "id_shop")
    private Integer idShop;

    @XmlElement(name = "id_customization")
    private Integer idCustomization;

    @XmlElement(name = "product_name")
    private String productName;

    @XmlElement(name = "product_quantity")
    private Integer productQuantity;

    @XmlElement(name = "product_quantity_in_stock")
    private Integer productQuantityInStock;

    @XmlElement(name = "product_quantity_return")
    private Integer productQuantityReturn;

    @XmlElement(name = "product_quantity_refunded")
    private Integer productQuantityRefunded;

    @XmlElement(name = "product_price")
    private BigDecimal productPrice;

    @XmlElement(name = "reduction_percent")
    private BigDecimal reductionPercent;

    @XmlElement(name = "reduction_amount")
    private BigDecimal reductionAmount;

    @XmlElement(name = "reduction_amount_tax_incl")
    private BigDecimal reductionAmountTaxIncl;

    @XmlElement(name = "reduction_amount_tax_excl")
    private BigDecimal reductionAmountTaxExcl;

    @XmlElement(name = "product_quantity_discount")
    private BigDecimal productQuantityDiscount;

    @XmlElement(name = "product_ean13")
    private String productEan13;

    @XmlElement(name = "product_isbn")
    private String productIsbn;

    @XmlElement(name = "product_upc")
    private String productUpc;

    @XmlElement(name = "product_mpn")
    private String productMpn;

    @XmlElement(name = "product_reference")
    private String productReference;

    @XmlElement(name = "product_supplier_reference")
    private String productSupplierReference;

    @XmlElement(name = "product_weight")
    private BigDecimal productWeight;

    @XmlElement(name = "tax_computation_method")
    private Integer taxComputationMethod;

    @XmlElement(name = "id_tax_rules_group")
    private Integer idTaxRulesGroup;

    @XmlElement(name = "ecotax")
    private BigDecimal ecotax;

    @XmlElement(name = "ecotax_tax_rate")
    private BigDecimal ecotaxTaxRate;

    @XmlElement(name = "download_nb")
    private Integer downloadNb;

    @XmlElement(name = "unit_price_tax_incl")
    private BigDecimal unitPriceTaxIncl;

    @XmlElement(name = "unit_price_tax_excl")
    private BigDecimal unitPriceTaxExcl;

    @XmlElement(name = "total_price_tax_incl")
    private BigDecimal totalPriceTaxIncl;

    @XmlElement(name = "total_price_tax_excl")
    private BigDecimal totalPriceTaxExcl;

    @XmlElement(name = "total_shipping_price_tax_excl")
    private BigDecimal totalShippingPriceTaxExcl;

    @XmlElement(name = "total_shipping_price_tax_incl")
    private BigDecimal totalShippingPriceTaxIncl;

    @XmlElement(name = "purchase_supplier_price")
    private BigDecimal purchaseSupplierPrice;

    @XmlElement(name = "original_product_price")
    private BigDecimal originalProductPrice;

    @XmlElement(name = "original_wholesale_price")
    private BigDecimal originalWholesalePrice;

    @XmlElement(name = "total_refunded_tax_excl")
    private BigDecimal totalRefundedTaxExcl;

    @XmlElement(name = "total_refunded_tax_incl")
    private BigDecimal totalRefundedTaxIncl;

    @XmlElement(name = "associations")
    private Associations associations;

    // === Getters and Setters ===

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Integer productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public Integer getProductQuantityReinjected() {
        return productQuantityReinjected;
    }

    public void setProductQuantityReinjected(Integer productQuantityReinjected) {
        this.productQuantityReinjected = productQuantityReinjected;
    }

    public BigDecimal getGroupReduction() {
        return groupReduction;
    }

    public void setGroupReduction(BigDecimal groupReduction) {
        this.groupReduction = groupReduction;
    }

    public Integer getDiscountQuantityApplied() {
        return discountQuantityApplied;
    }

    public void setDiscountQuantityApplied(Integer discountQuantityApplied) {
        this.discountQuantityApplied = discountQuantityApplied;
    }

    public String getDownloadHash() {
        return downloadHash;
    }

    public void setDownloadHash(String downloadHash) {
        this.downloadHash = downloadHash;
    }

    public String getDownloadDeadline() {
        return downloadDeadline;
    }

    public void setDownloadDeadline(String downloadDeadline) {
        this.downloadDeadline = downloadDeadline;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public Integer getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdCustomization() {
        return idCustomization;
    }

    public void setIdCustomization(Integer idCustomization) {
        this.idCustomization = idCustomization;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getProductQuantityInStock() {
        return productQuantityInStock;
    }

    public void setProductQuantityInStock(Integer productQuantityInStock) {
        this.productQuantityInStock = productQuantityInStock;
    }

    public Integer getProductQuantityReturn() {
        return productQuantityReturn;
    }

    public void setProductQuantityReturn(Integer productQuantityReturn) {
        this.productQuantityReturn = productQuantityReturn;
    }

    public Integer getProductQuantityRefunded() {
        return productQuantityRefunded;
    }

    public void setProductQuantityRefunded(Integer productQuantityRefunded) {
        this.productQuantityRefunded = productQuantityRefunded;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(BigDecimal reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public BigDecimal getReductionAmountTaxIncl() {
        return reductionAmountTaxIncl;
    }

    public void setReductionAmountTaxIncl(BigDecimal reductionAmountTaxIncl) {
        this.reductionAmountTaxIncl = reductionAmountTaxIncl;
    }

    public BigDecimal getReductionAmountTaxExcl() {
        return reductionAmountTaxExcl;
    }

    public void setReductionAmountTaxExcl(BigDecimal reductionAmountTaxExcl) {
        this.reductionAmountTaxExcl = reductionAmountTaxExcl;
    }

    public BigDecimal getProductQuantityDiscount() {
        return productQuantityDiscount;
    }

    public void setProductQuantityDiscount(BigDecimal productQuantityDiscount) {
        this.productQuantityDiscount = productQuantityDiscount;
    }

    public String getProductEan13() {
        return productEan13;
    }

    public void setProductEan13(String productEan13) {
        this.productEan13 = productEan13;
    }

    public String getProductIsbn() {
        return productIsbn;
    }

    public void setProductIsbn(String productIsbn) {
        this.productIsbn = productIsbn;
    }

    public String getProductUpc() {
        return productUpc;
    }

    public void setProductUpc(String productUpc) {
        this.productUpc = productUpc;
    }

    public String getProductMpn() {
        return productMpn;
    }

    public void setProductMpn(String productMpn) {
        this.productMpn = productMpn;
    }

    public String getProductReference() {
        return productReference;
    }

    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    public Integer getTaxComputationMethod() {
        return taxComputationMethod;
    }

    public void setTaxComputationMethod(Integer taxComputationMethod) {
        this.taxComputationMethod = taxComputationMethod;
    }

    public Integer getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }

    public BigDecimal getEcotaxTaxRate() {
        return ecotaxTaxRate;
    }

    public void setEcotaxTaxRate(BigDecimal ecotaxTaxRate) {
        this.ecotaxTaxRate = ecotaxTaxRate;
    }

    public Integer getDownloadNb() {
        return downloadNb;
    }

    public void setDownloadNb(Integer downloadNb) {
        this.downloadNb = downloadNb;
    }

    public BigDecimal getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    public void setUnitPriceTaxIncl(BigDecimal unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }

    public BigDecimal getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    public void setUnitPriceTaxExcl(BigDecimal unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

    public BigDecimal getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }

    public void setTotalPriceTaxIncl(BigDecimal totalPriceTaxIncl) {
        this.totalPriceTaxIncl = totalPriceTaxIncl;
    }

    public BigDecimal getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }

    public void setTotalPriceTaxExcl(BigDecimal totalPriceTaxExcl) {
        this.totalPriceTaxExcl = totalPriceTaxExcl;
    }

    public BigDecimal getTotalShippingPriceTaxExcl() {
        return totalShippingPriceTaxExcl;
    }

    public void setTotalShippingPriceTaxExcl(BigDecimal totalShippingPriceTaxExcl) {
        this.totalShippingPriceTaxExcl = totalShippingPriceTaxExcl;
    }

    public BigDecimal getTotalShippingPriceTaxIncl() {
        return totalShippingPriceTaxIncl;
    }

    public void setTotalShippingPriceTaxIncl(BigDecimal totalShippingPriceTaxIncl) {
        this.totalShippingPriceTaxIncl = totalShippingPriceTaxIncl;
    }

    public BigDecimal getPurchaseSupplierPrice() {
        return purchaseSupplierPrice;
    }

    public void setPurchaseSupplierPrice(BigDecimal purchaseSupplierPrice) {
        this.purchaseSupplierPrice = purchaseSupplierPrice;
    }

    public BigDecimal getOriginalProductPrice() {
        return originalProductPrice;
    }

    public void setOriginalProductPrice(BigDecimal originalProductPrice) {
        this.originalProductPrice = originalProductPrice;
    }

    public BigDecimal getOriginalWholesalePrice() {
        return originalWholesalePrice;
    }

    public void setOriginalWholesalePrice(BigDecimal originalWholesalePrice) {
        this.originalWholesalePrice = originalWholesalePrice;
    }

    public BigDecimal getTotalRefundedTaxExcl() {
        return totalRefundedTaxExcl;
    }

    public void setTotalRefundedTaxExcl(BigDecimal totalRefundedTaxExcl) {
        this.totalRefundedTaxExcl = totalRefundedTaxExcl;
    }

    public BigDecimal getTotalRefundedTaxIncl() {
        return totalRefundedTaxIncl;
    }

    public void setTotalRefundedTaxIncl(BigDecimal totalRefundedTaxIncl) {
        this.totalRefundedTaxIncl = totalRefundedTaxIncl;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // === Inner static classes ===

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {
        @XmlElementWrapper(name = "taxes")
        @XmlElement(name = "tax")
        private List<Tax> taxes;

        public List<Tax> getTaxes() {
            return taxes;
        }

        public void setTaxes(List<Tax> taxes) {
            this.taxes = taxes;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class Tax {
            @XmlElement(name = "id")
            private Integer id;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }
        }
    }
}
