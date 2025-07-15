package org.vaadin.example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "order_history")
public class OrderHistory {

    @XmlElement(name = "id_employee")
    private Integer idEmployee;

    @XmlElement(name = "id_order_state", required = true)
    private Integer idOrderState;

    @XmlElement(name = "id_order", required = true)
    private Integer idOrder;

    @XmlElement(name = "date_add")
    private String dateAdd;

    // Getter e Setter

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Integer getIdOrderState() {
        return idOrderState;
    }

    public void setIdOrderState(Integer idOrderState) {
        this.idOrderState = idOrderState;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
}
