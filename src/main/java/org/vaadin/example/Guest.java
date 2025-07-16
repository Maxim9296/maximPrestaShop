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
    private String javascript;

    @XmlElement(name = "screen_resolution_x")
    private Integer screenResolutionX;

    @XmlElement(name = "screen_resolution_y")
    private Integer screenResolutionY;

    @XmlElement(name = "screen_color")
    private Integer screenColor;

    @XmlElement(name = "sun_java")
    private String sunJava;

    @XmlElement(name = "adobe_flash")
    private String adobeFlash;

    @XmlElement(name = "adobe_director")
    private String adobeDirector;

    @XmlElement(name = "apple_quicktime")
    private String appleQuicktime;

    @XmlElement(name = "real_player")
    private String realPlayer;

    @XmlElement(name = "windows_media")
    private String windowsMedia;

    @XmlElement(name = "accept_language")
    private String acceptLanguage;

    @XmlElement(name = "mobile_theme")
    private String mobileTheme;

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

    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
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

    public String getSunJava() {
        return sunJava;
    }

    public void setSunJava(String sunJava) {
        this.sunJava = sunJava;
    }

    public String getAdobeFlash() {
        return adobeFlash;
    }

    public void setAdobeFlash(String adobeFlash) {
        this.adobeFlash = adobeFlash;
    }

    public String getAdobeDirector() {
        return adobeDirector;
    }

    public void setAdobeDirector(String adobeDirector) {
        this.adobeDirector = adobeDirector;
    }

    public String getAppleQuicktime() {
        return appleQuicktime;
    }

    public void setAppleQuicktime(String appleQuicktime) {
        this.appleQuicktime = appleQuicktime;
    }

    public String getRealPlayer() {
        return realPlayer;
    }

    public void setRealPlayer(String realPlayer) {
        this.realPlayer = realPlayer;
    }

    public String getWindowsMedia() {
        return windowsMedia;
    }

    public void setWindowsMedia(String windowsMedia) {
        this.windowsMedia = windowsMedia;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public String getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(String mobileTheme) {
        this.mobileTheme = mobileTheme;
    }
}
