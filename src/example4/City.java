package example4;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlRootElement
public class City {
    @XmlValue
    private String name;
    @XmlAttribute
    private String size;

    public City() {
    }

    public City(String name, String size) {
        this.name = name;
        this.size = size;
    }
}
