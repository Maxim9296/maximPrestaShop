package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

    @XmlElement(name = "id_default_group")
    private Long idDefaultGroup;

    @XmlElement(name = "id_lang")
    private Long idLang;

    @XmlElement(name = "newsletter_date_add")
    private String newsletterDateAdd;

    @XmlElement(name = "ip_registration_newsletter")
    private String ipRegistrationNewsletter;

    @XmlElement(name = "last_passwd_gen")
    private String lastPasswdGen;

    @XmlElement(name = "secure_key")
    private String secureKey;

    @XmlElement(name = "deleted")
    private String deleted;

    @XmlElement(name = "passwd", required = true)
    private String passwd;

    @XmlElement(name = "lastname", required = true)
    private String lastname;

    @XmlElement(name = "firstname", required = true)
    private String firstname;

    @XmlElement(name = "email", required = true)
    private String email;

    @XmlElement(name = "id_gender")
    private Long idGender;

    @XmlElement(name = "birthday")
    private String birthday;

    @XmlElement(name = "newsletter")
    private String newsletter;

    @XmlElement(name = "optin")
    private String optin;

    @XmlElement(name = "website")
    private String website;

    @XmlElement(name = "company")
    private String company;

    @XmlElement(name = "siret")
    private String siret;

    @XmlElement(name = "ape")
    private String ape;

    @XmlElement(name = "outstanding_allow_amount")
    private Double outstandingAllowAmount;

    @XmlElement(name = "show_public_prices")
    private String showPublicPrices;

    @XmlElement(name = "id_risk")
    private Integer idRisk;

    @XmlElement(name = "max_payment_days")
    private Integer maxPaymentDays;

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "note")
    private String note;

    @XmlElement(name = "is_guest")
    private String isGuest;

    @XmlElement(name = "id_shop")
    private Long idShop;

    @XmlElement(name = "id_shop_group")
    private Long idShopGroup;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")//<date_add><![CDATA[2025-07-02 15:25:55]]></date_add>
    private String dateUpd;

    @XmlElement(name = "reset_password_token")
    private String resetPasswordToken;

    @XmlElement(name = "reset_password_validity")
    private String resetPasswordValidity;

    @XmlElement(name = "associations")
    private Associations associations;

    // --- Getters and setters ---

    public Long getIdDefaultGroup() {
        return idDefaultGroup;
    }

    public void setIdDefaultGroup(Long idDefaultGroup) {
        this.idDefaultGroup = idDefaultGroup;
    }

    public Long getIdLang() {
        return idLang;
    }

    public void setIdLang(Long idLang) {
        this.idLang = idLang;
    }

    public String getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    public void setNewsletterDateAdd(String newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }

    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    public void setIpRegistrationNewsletter(String ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }

    public String getLastPasswdGen() {
        return lastPasswdGen;
    }

    public void setLastPasswdGen(String lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdGender() {
        return idGender;
    }

    public void setIdGender(Long idGender) {
        this.idGender = idGender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public String getOptin() {
        return optin;
    }

    public void setOptin(String optin) {
        this.optin = optin;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public Double getOutstandingAllowAmount() {
        return outstandingAllowAmount;
    }

    public void setOutstandingAllowAmount(Double outstandingAllowAmount) {
        this.outstandingAllowAmount = outstandingAllowAmount;
    }

    public String getShowPublicPrices() {
        return showPublicPrices;
    }

    public void setShowPublicPrices(String showPublicPrices) {
        this.showPublicPrices = showPublicPrices;
    }

    public Integer getIdRisk() {
        return idRisk;
    }

    public void setIdRisk(Integer idRisk) {
        this.idRisk = idRisk;
    }

    public Integer getMaxPaymentDays() {
        return maxPaymentDays;
    }

    public void setMaxPaymentDays(Integer maxPaymentDays) {
        this.maxPaymentDays = maxPaymentDays;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIsGuest() {
        return isGuest;
    }

    public void setIsGuest(String isGuest) {
        this.isGuest = isGuest;
    }

    public Long getIdShop() {
        return idShop;
    }

    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }

    public Long getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Long idShopGroup) {
        this.idShopGroup = idShopGroup;
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

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public String getResetPasswordValidity() {
        return resetPasswordValidity;
    }

    public void setResetPasswordValidity(String resetPasswordValidity) {
        this.resetPasswordValidity = resetPasswordValidity;
    }

    public Associations getAssociations() {
        return associations;
    }

    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    // --- Inner classes ---

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Associations {

        @XmlElement(name = "groups")
        private Groups groups;

        public Groups getGroups() {
            return groups;
        }

        public void setGroups(Groups groups) {
            this.groups = groups;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Groups {

        @XmlElement(name = "group")
        private List<Group> group;

        public List<Group> getGroup() {
            return group;
        }

        public void setGroup(List<Group> group) {
            this.group = group;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Group {

        @XmlElement(name = "id")
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
