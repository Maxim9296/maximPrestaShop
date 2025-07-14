package org.vaadin.example;

public class Addresses {
    public class id_customer {
        public String format;
    }

    public class id_manufacturer {
        public String format;
    }

    public class id_supplier {
        public String format;
    }

    public class id_country {
        public boolean required;
        public String format;
    }

    public class id_state {
        public String format;
    }

    public class id_warehouse {
        public String format;
    }

    public class alias {
        public boolean required;
        public int maxSize;
        public String format;
    }

    public class company {
        public int maxSize;
        public String format;
    }

    public class lastname {
        public boolean required;
        public int maxSize;
        public String format;
    }

    public class firstname {
        public boolean required;
        public int maxSize;
        public String format;
    }

    public class vat_number {
        public int maxSize;
        public String format;
    }

    public class address1 {
        public boolean required;
        public int maxSize;
        public String format;
    }

    public class address2 {
        public int maxSize;
        public String format;
    }

    public class postcode {
        public int maxSize;
        public String format;
    }

    public class city {
        public boolean required;
        public int maxSize;
        public String format;
    }

    public class other {
        public int maxSize;
        public String format;
    }

    public class phone {
        public int maxSize;
        public String format;
    }

    public class phone_mobile {
        public int maxSize;
        public String format;
    }

    public class dni {
        public int maxSize;
        public String format;
    }

    public class deleted {
        public String format;
    }

    public class date_add {
        public String format;
    }

    public class date_upd {
        public String format;
    }

    public class address {
        public id_customer id_customer;
        public id_manufacturer id_manufacturer;
        public id_supplier id_supplier;
        public id_country id_country;
        public id_state id_state;
        public id_warehouse id_warehouse;
        public alias alias;
        public company company;
        public lastname lastname;
        public firstname firstname;
        public vat_number vat_number;
        public address1 address1;
        public address2 address2;
        public postcode postcode;
        public city city;
        public other other;
        public phone phone;
        public phone_mobile phone_mobile;
        public dni dni;
        public deleted deleted;
        public date_add date_add;
        public date_upd date_upd;
    }

    public class prestashop {
        public address address;
        public String xlink;
    }


}
