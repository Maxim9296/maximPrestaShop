package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employee")
public class Employee {

    @XmlElement(name = "id_lang")
    private Integer idLang;

    @XmlElement(name = "last_passwd_gen")
    private String lastPasswdGen;

    @XmlElement(name = "stats_date_from")
    private String statsDateFrom;

    @XmlElement(name = "stats_date_to")
    private String statsDateTo;

    @XmlElement(name = "stats_compare_from")
    private String statsCompareFrom;

    @XmlElement(name = "stats_compare_to")
    private String statsCompareTo;

    @XmlElement(name = "passwd")
    private String passwd;

    @XmlElement(name = "lastname")
    private String lastname;

    @XmlElement(name = "firstname")
    private String firstname;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "active")
    private Boolean active;

    @XmlElement(name = "id_profile")
    private Integer idProfile;

    @XmlElement(name = "bo_color")
    private String boColor;

    @XmlElement(name = "default_tab")
    private Integer defaultTab;

    @XmlElement(name = "bo_theme")
    private String boTheme;

    @XmlElement(name = "bo_css")
    private String boCss;

    @XmlElement(name = "bo_width")
    private Integer boWidth;

    @XmlElement(name = "bo_menu")
    private Boolean boMenu;

    @XmlElement(name = "stats_compare_option")
    private Integer statsCompareOption;

    @XmlElement(name = "preselect_date_range")
    private String preselectDateRange;

    @XmlElement(name = "id_last_order")
    private Integer idLastOrder;

    @XmlElement(name = "id_last_customer_message")
    private Integer idLastCustomerMessage;

    @XmlElement(name = "id_last_customer")
    private Integer idLastCustomer;

    @XmlElement(name = "reset_password_token")
    private String resetPasswordToken;

    @XmlElement(name = "reset_password_validity")
    private String resetPasswordValidity;

    @XmlElement(name = "has_enabled_gravatar")
    private Boolean hasEnabledGravatar;

    // === Getters and Setters ===

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public String getLastPasswdGen() {
        return lastPasswdGen;
    }

    public void setLastPasswdGen(String lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
    }

    public String getStatsDateFrom() {
        return statsDateFrom;
    }

    public void setStatsDateFrom(String statsDateFrom) {
        this.statsDateFrom = statsDateFrom;
    }

    public String getStatsDateTo() {
        return statsDateTo;
    }

    public void setStatsDateTo(String statsDateTo) {
        this.statsDateTo = statsDateTo;
    }

    public String getStatsCompareFrom() {
        return statsCompareFrom;
    }

    public void setStatsCompareFrom(String statsCompareFrom) {
        this.statsCompareFrom = statsCompareFrom;
    }

    public String getStatsCompareTo() {
        return statsCompareTo;
    }

    public void setStatsCompareTo(String statsCompareTo) {
        this.statsCompareTo = statsCompareTo;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Integer idProfile) {
        this.idProfile = idProfile;
    }

    public String getBoColor() {
        return boColor;
    }

    public void setBoColor(String boColor) {
        this.boColor = boColor;
    }

    public Integer getDefaultTab() {
        return defaultTab;
    }

    public void setDefaultTab(Integer defaultTab) {
        this.defaultTab = defaultTab;
    }

    public String getBoTheme() {
        return boTheme;
    }

    public void setBoTheme(String boTheme) {
        this.boTheme = boTheme;
    }

    public String getBoCss() {
        return boCss;
    }

    public void setBoCss(String boCss) {
        this.boCss = boCss;
    }

    public Integer getBoWidth() {
        return boWidth;
    }

    public void setBoWidth(Integer boWidth) {
        this.boWidth = boWidth;
    }

    public Boolean getBoMenu() {
        return boMenu;
    }

    public void setBoMenu(Boolean boMenu) {
        this.boMenu = boMenu;
    }

    public Integer getStatsCompareOption() {
        return statsCompareOption;
    }

    public void setStatsCompareOption(Integer statsCompareOption) {
        this.statsCompareOption = statsCompareOption;
    }

    public String getPreselectDateRange() {
        return preselectDateRange;
    }

    public void setPreselectDateRange(String preselectDateRange) {
        this.preselectDateRange = preselectDateRange;
    }

    public Integer getIdLastOrder() {
        return idLastOrder;
    }

    public void setIdLastOrder(Integer idLastOrder) {
        this.idLastOrder = idLastOrder;
    }

    public Integer getIdLastCustomerMessage() {
        return idLastCustomerMessage;
    }

    public void setIdLastCustomerMessage(Integer idLastCustomerMessage) {
        this.idLastCustomerMessage = idLastCustomerMessage;
    }

    public Integer getIdLastCustomer() {
        return idLastCustomer;
    }

    public void setIdLastCustomer(Integer idLastCustomer) {
        this.idLastCustomer = idLastCustomer;
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

    public Boolean getHasEnabledGravatar() {
        return hasEnabledGravatar;
    }

    public void setHasEnabledGravatar(Boolean hasEnabledGravatar) {
        this.hasEnabledGravatar = hasEnabledGravatar;
    }
}
