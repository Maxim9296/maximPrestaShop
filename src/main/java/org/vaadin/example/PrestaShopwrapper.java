package org.vaadin.example;



import javax.xml.bind.annotation.*;

@XmlRootElement(name = "prestashop")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrestaShopwrapper {

    // tutte le risorse in forma SINGOLARE

    private Address address;
    private Attachment attachment;
    private Carrier carrier;
    private CartRule cartRule;
    private Cart cart;
    private Category category;
    private Combination combination;
    private Configuration configuration;
    private Contact contact;
    private Content contentManagementSystem;
    private Country country;
    private Currency currency;
    private CustomerMessage customerMessage;
    private CustomerThread customerThread;
    private Customer customer;
    private Customization customization;
    private Delivery delivery;
    private Employee employee;
    private Group group;
    private Guest guest;
    private ImageType imageType;
    private Image image;
    private Language language;
    private Manufacturer manufacturer;
    private Message message;
    private OrderCarrier orderCarrier;
    private OrderCartRule orderCartRule;
    private OrderDetail orderDetail;
    private OrderHistory orderHistory;
    private OrderInvoice orderInvoice;
    private OrderPayment orderPayment;
    private OrderSlip orderSlip;
    private OrderState orderState;
    private Order order;
    private PriceRange priceRange;
    private ProductCustomizationField productCustomizationField;
    private ProductFeatureValue productFeatureValue;
    private ProductFeature productFeature;
    private ProductOptionValue productOptionValue;
    private ProductOption productOption;
    private ProductSupplier productSupplier;
    private Product product;
    private ShopGroup shopGroup;
    private ShopUrl shopUrl;
    private Shop shop;
    private SpecificPriceRule specificPriceRule;
    private SpecificPrice specificPrice;
    private State state;
    private StockAvailable stockAvailable;
    private StockMovementReason stockMovementReason;
    private StockMovement stockMovement;
    private Stock stock;
    private Store store;
    private Supplier supplier;
    private Tag tag;
    private TaxRuleGroup taxRuleGroup;
    private TaxRule taxRule;
    private Tax tax;
    private TranslatedConfiguration translatedConfiguration;

    private Warehouse warehouse;
    private WeightRange weightRange;
    private Zone zone;

    // Getters & Setters

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public Attachment getAttachment() { return attachment; }
    public void setAttachment(Attachment attachment) { this.attachment = attachment; }

    public Carrier getCarrier() { return carrier; }
    public void setCarrier(Carrier carrier) { this.carrier = carrier; }

    public CartRule getCartRule() { return cartRule; }
    public void setCartRule(CartRule cartRule) { this.cartRule = cartRule; }

    public Cart getCart() { return cart; }
    public void setCart(Cart cart) { this.cart = cart; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public Combination getCombination() { return combination; }
    public void setCombination(Combination combination) { this.combination = combination; }

    public Configuration getConfiguration() { return configuration; }
    public void setConfiguration(Configuration configuration) { this.configuration = configuration; }

    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }

    public Content getContentManagementSystem() { return contentManagementSystem; }
    public void setContentManagementSystem(Content contentManagementSystem) { this.contentManagementSystem = contentManagementSystem; }

    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }

    public Currency getCurrency() { return currency; }
    public void setCurrency(Currency currency) { this.currency = currency; }

    public CustomerMessage getCustomerMessage() { return customerMessage; }
    public void setCustomerMessage(CustomerMessage customerMessage) { this.customerMessage = customerMessage; }

    public CustomerThread getCustomerThread() { return customerThread; }
    public void setCustomerThread(CustomerThread customerThread) { this.customerThread = customerThread; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Customization getCustomization() { return customization; }
    public void setCustomization(Customization customization) { this.customization = customization; }

    public Delivery getDelivery() { return delivery; }
    public void setDelivery(Delivery delivery) { this.delivery = delivery; }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public Group getGroup() { return group; }
    public void setGroup(Group group) { this.group = group; }

    public Guest getGuest() { return guest; }
    public void setGuest(Guest guest) { this.guest = guest; }

    public ImageType getImageType() { return imageType; }
    public void setImageType(ImageType imageType) { this.imageType = imageType; }

    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }

    public Language getLanguage() { return language; }
    public void setLanguage(Language language) { this.language = language; }

    public Manufacturer getManufacturer() { return manufacturer; }
    public void setManufacturer(Manufacturer manufacturer) { this.manufacturer = manufacturer; }

    public Message getMessage() { return message; }
    public void setMessage(Message message) { this.message = message; }

    public OrderCarrier getOrderCarrier() { return orderCarrier; }
    public void setOrderCarrier(OrderCarrier orderCarrier) { this.orderCarrier = orderCarrier; }

    public OrderCartRule getOrderCartRule() { return orderCartRule; }
    public void setOrderCartRule(OrderCartRule orderCartRule) { this.orderCartRule = orderCartRule; }

    public OrderDetail getOrderDetail() { return orderDetail; }
    public void setOrderDetail(OrderDetail orderDetail) { this.orderDetail = orderDetail; }

    public OrderHistory getOrderHistory() { return orderHistory; }
    public void setOrderHistory(OrderHistory orderHistory) { this.orderHistory = orderHistory; }

    public OrderInvoice getOrderInvoice() { return orderInvoice; }
    public void setOrderInvoice(OrderInvoice orderInvoice) { this.orderInvoice = orderInvoice; }

    public OrderPayment getOrderPayment() { return orderPayment; }
    public void setOrderPayment(OrderPayment orderPayment) { this.orderPayment = orderPayment; }

    public OrderSlip getOrderSlip() { return orderSlip; }
    public void setOrderSlip(OrderSlip orderSlip) { this.orderSlip = orderSlip; }

    public OrderState getOrderState() { return orderState; }
    public void setOrderState(OrderState orderState) { this.orderState = orderState; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }

    public PriceRange getPriceRange() { return priceRange; }
    public void setPriceRange(PriceRange priceRange) { this.priceRange = priceRange; }

    public ProductCustomizationField getProductCustomizationField() { return productCustomizationField; }
    public void setProductCustomizationField(ProductCustomizationField productCustomizationField) { this.productCustomizationField = productCustomizationField; }

    public ProductFeatureValue getProductFeatureValue() { return productFeatureValue; }
    public void setProductFeatureValue(ProductFeatureValue productFeatureValue) { this.productFeatureValue = productFeatureValue; }

    public ProductFeature getProductFeature() { return productFeature; }
    public void setProductFeature(ProductFeature productFeature) { this.productFeature = productFeature; }

    public ProductOptionValue getProductOptionValue() { return productOptionValue; }
    public void setProductOptionValue(ProductOptionValue productOptionValue) { this.productOptionValue = productOptionValue; }

    public ProductOption getProductOption() { return productOption; }
    public void setProductOption(ProductOption productOption) { this.productOption = productOption; }

    public ProductSupplier getProductSupplier() { return productSupplier; }
    public void setProductSupplier(ProductSupplier productSupplier) { this.productSupplier = productSupplier; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public ShopGroup getShopGroup() { return shopGroup; }
    public void setShopGroup(ShopGroup shopGroup) { this.shopGroup = shopGroup; }

    public ShopUrl getShopUrl() { return shopUrl; }
    public void setShopUrl(ShopUrl shopUrl) { this.shopUrl = shopUrl; }

    public Shop getShop() { return shop; }
    public void setShop(Shop shop) { this.shop = shop; }

    public SpecificPriceRule getSpecificPriceRule() { return specificPriceRule; }
    public void setSpecificPriceRule(SpecificPriceRule specificPriceRule) { this.specificPriceRule = specificPriceRule; }

    public SpecificPrice getSpecificPrice() { return specificPrice; }
    public void setSpecificPrice(SpecificPrice specificPrice) { this.specificPrice = specificPrice; }

    public State getState() { return state; }
    public void setState(State state) { this.state = state; }

    public StockAvailable getStockAvailable() { return stockAvailable; }
    public void setStockAvailable(StockAvailable stockAvailable) { this.stockAvailable = stockAvailable; }

    public StockMovementReason getStockMovementReason() { return stockMovementReason; }
    public void setStockMovementReason(StockMovementReason stockMovementReason) { this.stockMovementReason = stockMovementReason; }

    public StockMovement getStockMovement() { return stockMovement; }
    public void setStockMovement(StockMovement stockMovement) { this.stockMovement = stockMovement; }

    public Stock getStock() { return stock; }
    public void setStock(Stock stock) { this.stock = stock; }

    public Store getStore() { return store; }
    public void setStore(Store store) { this.store = store; }

    public Supplier getSupplier() { return supplier; }
    public void setSupplier(Supplier supplier) { this.supplier = supplier; }


    public Tag getTag() { return tag; }
    public void setTag(Tag tag) { this.tag = tag; }

    public TaxRuleGroup getTaxRuleGroup() { return taxRuleGroup; }
    public void setTaxRuleGroup(TaxRuleGroup taxRuleGroup) { this.taxRuleGroup = taxRuleGroup; }

    public TaxRule getTaxRule() { return taxRule; }
    public void setTaxRule(TaxRule taxRule) { this.taxRule = taxRule; }

    public Tax getTax() { return tax; }
    public void setTax(Tax tax) { this.tax = tax; }

    public TranslatedConfiguration getTranslatedConfiguration() { return translatedConfiguration; }
    public void setTranslatedConfiguration(TranslatedConfiguration translatedConfiguration) { this.translatedConfiguration = translatedConfiguration; }


    public Warehouse getWarehouse() { return warehouse; }
    public void setWarehouse(Warehouse warehouse) { this.warehouse = warehouse; }

    public WeightRange getWeightRange() { return weightRange; }
    public void setWeightRange(WeightRange weightRange) { this.weightRange = weightRange; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }

}
