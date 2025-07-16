package org.vaadin.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "store")
@XmlAccessorType(XmlAccessType.FIELD)
public class Store {

    @XmlElement(name = "id_country")
    private String idCountry;

    @XmlElement(name = "id_state")
    private String idState;

    // hours -> contains one or more <language>
    @XmlElementWrapper(name = "hours")
    @XmlElement(name = "language")
    private List<Language> hours;

    @XmlElement(name = "postcode")
    private String postcode;

    @XmlElement(name = "city")
    private String city;

    @XmlElement(name = "latitude")
    private String latitude;

    @XmlElement(name = "longitude")
    private String longitude;

    @XmlElement(name = "phone")
    private String phone;

    @XmlElement(name = "fax")
    private String fax;

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "active")
    private String active;

    @XmlElement(name = "date_add")
    private String dateAdd;

    @XmlElement(name = "date_upd")
    private String dateUpd;

    // name -> contains one or more <language>
    @XmlElementWrapper(name = "name")
    @XmlElement(name = "language")
    private List<Language> name;

    // address1 -> contains one or more <language>
    @XmlElementWrapper(name = "address1")
    @XmlElement(name = "language")
    private List<Language> address1;

    // address2 -> contains one or more <language>
    @XmlElementWrapper(name = "address2")
    @XmlElement(name = "language")
    private List<Language> address2;

    // note -> contains one or more <language>
    @XmlElementWrapper(name = "note")
    @XmlElement(name = "language")
    private List<Language> note;

    // GETTERS & SETTERS

    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    public String getIdState() {
        return idState;
    }

    public void setIdState(String idState) {
        this.idState = idState;
    }

    public List<Language> getHours() {
        return hours;
    }

    public void setHours(List<Language> hours) {
        this.hours = hours;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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

    public List<Language> getName() {
        return name;
    }

    public void setName(List<Language> name) {
        this.name = name;
    }

    public List<Language> getAddress1() {
        return address1;
    }

    public void setAddress1(List<Language> address1) {
        this.address1 = address1;
    }

    public List<Language> getAddress2() {
        return address2;
    }

    public void setAddress2(List<Language> address2) {
        this.address2 = address2;
    }

    public List<Language> getNote() {
        return note;
    }

    public void setNote(List<Language> note) {
        this.note = note;
    }
}
