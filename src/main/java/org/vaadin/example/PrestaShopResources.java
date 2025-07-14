package org.vaadin.example;

public enum PrestaShopResources {

    ADDRESSES("addresses", "address", "Indirizzi"),
    ATTACHMENTS("attachments", "attachment", "Allegati"),
    ATTACHMENTS_FILE("attachments/file", "attachment", "File Allegati"),
    CARRIERS("carriers", "carrier", "Corrieri"),
    CART_RULES("cart_rules", "cart_rule", "Regole carrello"),
    CARTS("carts", "cart", "Carrelli"),
    CATEGORIES("categories", "category", "Categorie"),
    COMBINATIONS("combinations", "combination", "Combinazioni prodotto"),
    CONFIGURATIONS("configurations", "configuration", "Configurazioni"),
    CONTACTS("contacts", "contact", "Contatti"),
    CMS("content_management_system", "content", "Pagine CMS"),
    COUNTRIES("countries", "country", "Paesi"),
    CURRENCIES("currencies", "currency", "Valute"),
    CUSTOMER_MESSAGES("customer_messages", "customer_message", "Messaggi cliente"),
    CUSTOMER_THREADS("customer_threads", "customer_thread", "Conversazioni cliente"),
    CUSTOMERS("customers", "customer", "Clienti"),
    CUSTOMIZATIONS("customizations", "customization", "Personalizzazioni"),
    DELIVERIES("deliveries", "delivery", "Spedizioni"),
    EMPLOYEES("employees", "employee", "Dipendenti"),
    GROUPS("groups", "group", "Gruppi clienti"),
    GUESTS("guests", "guest", "Ospiti"),
    IMAGE_TYPES("image_types", "image_type", "Tipi immagine"),
    IMAGES("images", "image", "Immagini"),
    IMAGES_GENERAL_HEADER("images/general/header", "image", "Logo header"),
    IMAGES_GENERAL_MAIL("images/general/mail", "image", "Logo email"),
    IMAGES_GENERAL_INVOICE("images/general/invoice", "image", "Logo fattura"),
    IMAGES_GENERAL_STORE_ICON("images/general/store_icon", "image", "Favicon"),
    IMAGES_PRODUCTS("images/products", "image", "Immagini prodotti"),
    IMAGES_CATEGORIES("images/categories", "image", "Immagini categorie"),
    IMAGES_MANUFACTURERS("images/manufacturers", "image", "Immagini produttori"),
    IMAGES_SUPPLIERS("images/suppliers", "image", "Immagini fornitori"),
    IMAGES_STORES("images/stores", "image", "Immagini negozi"),
    IMAGES_CUSTOMIZATIONS("images/customizations", "image", "Immagini personalizzazioni"),
    LANGUAGES("languages", "language", "Lingue"),
    MANUFACTURERS("manufacturers", "manufacturer", "Produttori"),
    MESSAGES("messages", "message", "Messaggi"),
    ORDER_CARRIERS("order_carriers", "order_carrier", "Corrieri ordine"),
    ORDER_DETAILS("order_details", "order_detail", "Dettagli ordine"),
    ORDER_HISTORIES("order_histories", "order_history", "Storico ordini"),
    ORDER_INVOICES("order_invoices", "order_invoice", "Fatture ordine"),
    ORDER_PAYMENTS("order_payments", "order_payment", "Pagamenti ordine"),
    ORDER_SLIP("order_slip", "order_slip", "Note di credito"),
    ORDER_STATES("order_states", "order_state", "Stati ordine"),
    ORDERS("orders", "order", "Ordini"),
    PRICE_RANGES("price_ranges", "price_range", "Fasce di prezzo"),
    PRODUCT_CUSTOMIZATION_FIELDS("product_customization_fields", "product_customization_field", "Campi personalizzazione"),
    PRODUCT_FEATURE_VALUES("product_feature_values", "product_feature_value", "Valori caratteristiche prodotto"),
    PRODUCT_FEATURES("product_features", "product_feature", "Caratteristiche prodotto"),
    PRODUCT_OPTION_VALUES("product_option_values", "product_option_value", "Valori opzione prodotto"),
    PRODUCT_OPTIONS("product_options", "product_option", "Opzioni prodotto"),
    PRODUCT_SUPPLIERS("product_suppliers", "product_supplier", "Fornitori prodotto"),
    PRODUCTS("products", "product", "Prodotti"),
    SEARCH("search", "search", "Ricerca"),
    SHOP_GROUPS("shop_groups", "shop_group", "Gruppi negozi"),
    SHOP_URLS("shop_urls", "shop_url", "URL negozi"),
    SHOPS("shops", "shop", "Negozi"),
    SPECIFIC_PRICE_RULES("specific_price_rules", "specific_price_rule", "Regole prezzi specifici"),
    SPECIFIC_PRICES("specific_prices", "specific_price", "Prezzi specifici"),
    STATES("states", "state", "Stati (province)"),
    STOCK_AVAILABLES("stock_availables", "stock_available", "Disponibilità magazzino"),
    STOCK_MOVEMENT_REASONS("stock_movement_reasons", "stock_movement_reason", "Motivi movimentazione stock"),
    STOCK_MOVEMENTS("stock_movements", "stock_movement", "Movimenti stock"),
    STOCKS("stocks", "stock", "Magazzino"),
    STORES("stores", "store", "Negozi fisici"),
    SUPPLIERS("suppliers", "supplier", "Fornitori"),
    SUPPLY_ORDER_DETAILS("supply_order_details", "supply_order_detail", "Dettagli ordine fornitura"),
    SUPPLY_ORDER_HISTORIES("supply_order_histories", "supply_order_history", "Storico ordini fornitura"),
    SUPPLY_ORDER_RECEIPT_HISTORIES("supply_order_receipt_histories", "supply_order_receipt_history", "Storico ricezioni fornitura"),
    SUPPLY_ORDER_STATES("supply_order_states", "supply_order_state", "Stati ordine fornitura"),
    SUPPLY_ORDERS("supply_orders", "supply_order", "Ordini fornitura"),
    TAGS("tags", "tag", "Tag prodotto"),
    TAX_RULE_GROUPS("tax_rule_groups", "tax_rule_group", "Gruppi regole fiscali"),
    TAX_RULES("tax_rules", "tax_rule", "Regole fiscali"),
    TAXES("taxes", "tax", "Tasse"),
    TRANSLATED_CONFIGURATIONS("translated_configurations", "translated_configuration", "Configurazioni tradotte"),
    WAREHOUSE_PRODUCT_LOCATIONS("warehouse_product_locations", "warehouse_product_location", "Posizioni magazzino prodotti"),
    WAREHOUSES("warehouses", "warehouse", "Magazzini"),
    WEIGHT_RANGES("weight_ranges", "weight_range", "Fasce peso"),
    ZONES("zones", "zone", "Zone");

    private final String endpoint;
    private final String singularName;
    private final String displayName;

    PrestaShopResources(String endpoint, String singularName, String displayName) {
        this.endpoint = endpoint;
        this.singularName = singularName;
        this.displayName = displayName;
    }

    public String getEndpoint() {
        return endpoint;
    }

   public String getSingularName() {
        return singularName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
