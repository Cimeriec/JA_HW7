package example4;

import java.io.File;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Main {
    public static void main(String[] args) throws JAXBException {
        File file = new File("D:\\Java\\1\\JA_HW7\\src\\example4\\address.xml");
        Address address = new Address(new City("Kiev", "big"), "Sevchenko", 5);

            JAXBContext context = JAXBContext.newInstance(Address.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(address, file);

    }
}
