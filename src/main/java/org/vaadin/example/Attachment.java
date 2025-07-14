package org.vaadin.example;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "attachment")
public class Attachment {

    @XmlElement(name = "file", required = true)
    private String file;

    @XmlElement(name = "file_name")
    private String fileName;

    @XmlElement(name = "file_size")
    private Long fileSize;

    @XmlElement(name = "mime", required = true)
    private String mime;

    @XmlElementWrapper(name = "name")
    @XmlElement(name = "language")
    private List<Language> name;

    @XmlElementWrapper(name = "description")
    @XmlElement(name = "language")
    private List<Language> description;

    @XmlElement(name = "associations")
    private Associations associations;

    // Getters e setters

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }

    public List<Language> getDescription() {
        return description;
    }

    public void setDescription(List<Language> description) {
        this.description = description;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // Classe interna per associations
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElement(name = "products")
        private Products products;

        public Products getProducts() {
            return products;
        }

        public void setProducts(Products products) {
            this.products = products;
        }
    }

    // Classe interna per products
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Products {

        @XmlElement(name = "product")
        private List<Product> product;

        public List<Product> getProduct() {
            return product;
        }

        public void setProduct(List<Product> product) {
            this.product = product;
        }
    }

    // Classe interna per product
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Product {

        @XmlElement(name = "id", required = true)
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
