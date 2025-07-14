package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "guest")
public class Guest {

    @XmlElement(name = "id_customer")
    private Integer idCustomer;

    @XmlElement(name = "id_operating_system")
    private Integer idOperatingSystem;

    @XmlElement(name = "id_web_browser")
    private Integer idWebBrowser;

    @XmlElement(name = "javascript")
    private Boolean javascript;

    @XmlElement(name = "screen_resolution_x")
    private Integer screenResolutionX;

    @XmlElement(name = "screen_resolution_y")
    private Integer screenResolutionY;

    @XmlElement(name = "screen_color")
    private Integer screenColor;

    @XmlElement(name = "sun_java")
    private Boolean sunJava;

    @XmlElement(name = "adobe_flash")
    private Boolean adobeFlash;

    @XmlElement(name = "adobe_director")
    private Boolean adobeDirector;

    @XmlElement(name = "apple_quicktime")
    private Boolean appleQuicktime;

    @XmlElement(name = "real_player")
    private Boolean realPlayer;

    @XmlElement(name = "windows_media")
    private Boolean windowsMedia;

    @XmlElement(name = "accept_language")
    private String acceptLanguage;

    @XmlElement(name = "mobile_theme")
    private Boolean mobileTheme;

    // === Getters and setters ===

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdOperatingSystem() {
        return idOperatingSystem;
    }

    public void setIdOperatingSystem(Integer idOperatingSystem) {
        this.idOperatingSystem = idOperatingSystem;
    }

    public Integer getIdWebBrowser() {
        return idWebBrowser;
    }

    public void setIdWebBrowser(Integer idWebBrowser) {
        this.idWebBrowser = idWebBrowser;
    }

    public Boolean getJavascript() {
        return javascript;
    }

    public void setJavascript(Boolean javascript) {
        this.javascript = javascript;
    }

    public Integer getScreenResolutionX() {
        return screenResolutionX;
    }

    public void setScreenResolutionX(Integer screenResolutionX) {
        this.screenResolutionX = screenResolutionX;
    }

    public Integer getScreenResolutionY() {
        return screenResolutionY;
    }

    public void setScreenResolutionY(Integer screenResolutionY) {
        this.screenResolutionY = screenResolutionY;
    }

    public Integer getScreenColor() {
        return screenColor;
    }

    public void setScreenColor(Integer screenColor) {
        this.screenColor = screenColor;
    }

    public Boolean getSunJava() {
        return sunJava;
    }

    public void setSunJava(Boolean sunJava) {
        this.sunJava = sunJava;
    }

    public Boolean getAdobeFlash() {
        return adobeFlash;
    }

    public void setAdobeFlash(Boolean adobeFlash) {
        this.adobeFlash = adobeFlash;
    }

    public Boolean getAdobeDirector() {
        return adobeDirector;
    }

    public void setAdobeDirector(Boolean adobeDirector) {
        this.adobeDirector = adobeDirector;
    }

    public Boolean getAppleQuicktime() {
        return appleQuicktime;
    }

    public void setAppleQuicktime(Boolean appleQuicktime) {
        this.appleQuicktime = appleQuicktime;
    }

    public Boolean getRealPlayer() {
        return realPlayer;
    }

    public void setRealPlayer(Boolean realPlayer) {
        this.realPlayer = realPlayer;
    }

    public Boolean getWindowsMedia() {
        return windowsMedia;
    }

    public void setWindowsMedia(Boolean windowsMedia) {
        this.windowsMedia = windowsMedia;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public Boolean getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(Boolean mobileTheme) {
        this.mobileTheme = mobileTheme;
    }
}
