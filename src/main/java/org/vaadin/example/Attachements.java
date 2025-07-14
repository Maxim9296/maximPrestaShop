package org.vaadin.example;

public class Attachements {
    public class file {
        public boolean required;
        public int maxSize;
        public String format;
    }

    public class file_name {
        public int maxSize;
        public String format;
    }

    public class file_size {
        public String format;
    }

    public class mime {
        public boolean required;
        public int maxSize;
        public String format;
    }

    public class language {
        public int id;
        public String href;
        public String format;
    }

    public class name {
        public language language;
        public boolean required;
        public int maxSize;
        public String format;
    }

    public class description {
        public language language;
        public int maxSize;
        public String format;
    }

    public class id {
        public boolean required;
    }

    public class product {
        public id id;
    }

    public class products {
        public product product;
        public String nodeType;
        public String api;
    }

    public class associations {
        public products products;
    }

    public class attachment {
        public file file;
        public file_name file_name;
        public file_size file_size;
        public mime mime;
        public name name;
        public description description;
        public associations associations;
    }

    public class prestashop {
        public attachment attachment;
        public String xlink;
    }


}
