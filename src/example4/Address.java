package example4;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "address")
public class Address {
    @XmlElement
    private City city;
    @XmlElement
    private String street;
    @XmlElement
    private int house;


       public Address() {
    }
    public Address(City city, String street, int house) {

        this.city = city;
        this.street = street;
        this.house = house;
    }


    @Override
    public String toString() {
        return "Addresses{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}
