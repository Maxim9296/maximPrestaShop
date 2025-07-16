package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "image_types")
@XmlAccessorType(XmlAccessType.FIELD)
public class Image {

    @XmlElement
    private ImageType general;

    @XmlElement
    private ImageType products;

    @XmlElement
    private ImageType categories;

    @XmlElement
    private ImageType manufacturers;

    @XmlElement
    private ImageType suppliers;

    @XmlElement
    private ImageType stores;

    @XmlElement
    private ImageType customizations;

    // Getter e Setter

    public ImageType getGeneral() {
        return general;
    }

    public void setGeneral(ImageType general) {
        this.general = general;
    }

    public ImageType getProducts() {
        return products;
    }

    public void setProducts(ImageType products) {
        this.products = products;
    }

    public ImageType getCategories() {
        return categories;
    }

    public void setCategories(ImageType categories) {
        this.categories = categories;
    }

    public ImageType getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(ImageType manufacturers) {
        this.manufacturers = manufacturers;
    }

    public ImageType getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(ImageType suppliers) {
        this.suppliers = suppliers;
    }

    public ImageType getStores() {
        return stores;
    }

    public void setStores(ImageType stores) {
        this.stores = stores;
    }

    public ImageType getCustomizations() {
        return customizations;
    }

    public void setCustomizations(ImageType customizations) {
        this.customizations = customizations;
    }

    /**
     * Classe interna per mappare ogni elemento (general, products, ecc.)
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ImageType {

        @XmlAttribute(name = "xlink:href")
        private String href;

        @XmlAttribute
        private String get;

        @XmlAttribute
        private String put;

        @XmlAttribute
        private String post;

        @XmlAttribute
        private String patch;

        @XmlAttribute
        private String delete;

        @XmlAttribute
        private String head;

        @XmlAttribute(name = "upload_allowed_mimetypes")
        private String uploadAllowedMimetypes;

        // Getter e Setter

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String isGet() {
            return get;
        }

        public void setGet(String get) {
            this.get = get;
        }

        public String isPut() {
            return put;
        }

        public void setPut(String put) {
            this.put = put;
        }

        public String isPost() {
            return post;
        }

        public void setPost(String post) {
            this.post = post;
        }

        public String isPatch() {
            return patch;
        }

        public void setPatch(String patch) {
            this.patch = patch;
        }

        public String isDelete() {
            return delete;
        }

        public void setDelete(String delete) {
            this.delete = delete;
        }

        public String isHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public String getUploadAllowedMimetypes() {
            return uploadAllowedMimetypes;
        }

        public void setUploadAllowedMimetypes(String uploadAllowedMimetypes) {
            this.uploadAllowedMimetypes = uploadAllowedMimetypes;
        }
    }
}
