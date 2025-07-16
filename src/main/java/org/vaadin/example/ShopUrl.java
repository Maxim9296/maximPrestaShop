package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "shop_url")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopUrl {

    @XmlElement(name = "id_shop", required = true)
    private Integer idShop;

    @XmlElement
    private String active;

    @XmlElement
    private String main;

    @XmlElement(required = true)
    private String domain;

    @XmlElement(name = "domain_ssl")
    private String domainSsl;

    @XmlElement(name = "physical_uri")
    private String physicalUri;

    @XmlElement(name = "virtual_uri")
    private String virtualUri;

    // ----- GETTER e SETTER -----

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public String isActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String isMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomainSsl() {
        return domainSsl;
    }

    public void setDomainSsl(String domainSsl) {
        this.domainSsl = domainSsl;
    }

    public String getPhysicalUri() {
        return physicalUri;
    }

    public void setPhysicalUri(String physicalUri) {
        this.physicalUri = physicalUri;
    }

    public String getVirtualUri() {
        return virtualUri;
    }

    public void setVirtualUri(String virtualUri) {
        this.virtualUri = virtualUri;
    }
}
