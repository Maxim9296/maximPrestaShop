package org.vaadin.example;



import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "contact")
public class Contact {

    @XmlElement(name = "email")
    private String email;

    @XmlElement(name = "customer_service")
    private String customerService;

    @XmlElementWrapper(name = "name")
    @XmlElement(name = "language")
    private List<Language> name;

    @XmlElementWrapper(name = "description")
    @XmlElement(name = "language")
    private List<Language> description;

    // Getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerService() {
        return customerService;
    }

    public void setCustomerService(String customerService) {
        this.customerService = customerService;
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
}

