package org.vaadin.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "price_range")
public class PriceRange {
    private Integer idCarrier;
    private Float delimiter1;
    private Float delimiter2;

    @XmlElement(name = "id_carrier")
    public Integer getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }

    @XmlElement(name = "delimiter1")
    public Float getDelimiter1() {
        return delimiter1;
    }

    public void setDelimiter1(Float delimiter1) {
        this.delimiter1 = delimiter1;
    }

    @XmlElement(name = "delimiter2")
    public Float getDelimiter2() {
        return delimiter2;
    }

    public void setDelimiter2(Float delimiter2) {
        this.delimiter2 = delimiter2;
    }


}
