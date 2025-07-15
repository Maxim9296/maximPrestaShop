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
        private boolean get;

        @XmlAttribute
        private boolean put;

        @XmlAttribute
        private boolean post;

        @XmlAttribute
        private boolean patch;

        @XmlAttribute
        private boolean delete;

        @XmlAttribute
        private boolean head;

        @XmlAttribute(name = "upload_allowed_mimetypes")
        private String uploadAllowedMimetypes;

        // Getter e Setter

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public boolean isGet() {
            return get;
        }

        public void setGet(boolean get) {
            this.get = get;
        }

        public boolean isPut() {
            return put;
        }

        public void setPut(boolean put) {
            this.put = put;
        }

        public boolean isPost() {
            return post;
        }

        public void setPost(boolean post) {
            this.post = post;
        }

        public boolean isPatch() {
            return patch;
        }

        public void setPatch(boolean patch) {
            this.patch = patch;
        }

        public boolean isDelete() {
            return delete;
        }

        public void setDelete(boolean delete) {
            this.delete = delete;
        }

        public boolean isHead() {
            return head;
        }

        public void setHead(boolean head) {
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
