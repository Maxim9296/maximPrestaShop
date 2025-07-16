package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "weight_range")
@XmlAccessorType(XmlAccessType.FIELD)
public class WeightRange {

    @XmlElement(name = "id_carrier", required = true)
    private Integer idCarrier;

    @XmlElement(name = "delimiter1", required = true)
    private Float delimiter1;

    @XmlElement(name = "delimiter2", required = true)
    private Float delimiter2;

    // Getters e setters

    public Integer getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }

    public Float getDelimiter1() {
        return delimiter1;
    }

    public void setDelimiter1(Float delimiter1) {
        this.delimiter1 = delimiter1;
    }

    public Float getDelimiter2() {
        return delimiter2;
    }

    public void setDelimiter2(Float delimiter2) {
        this.delimiter2 = delimiter2;
    }
}
