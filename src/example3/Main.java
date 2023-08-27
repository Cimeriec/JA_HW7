package example3;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        File file = new File("D:\\Java\\1\\JA_HW7\\src\\example3\\address.xml");
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream(file));

        writer.writeStartDocument();

            writer.writeStartElement("addresses");

                writer.writeStartElement("city");
                    writer.writeAttribute("size", "big");
                    writer.writeCharacters("Kiev");
                writer.writeEndElement();
                writer.writeStartElement("street");
                    writer.writeCharacters("Shevchenko");
                writer.writeEndElement();
                writer.writeStartElement("house");
                    writer.writeCharacters("10");
                writer.writeEndElement();



                writer.writeStartElement("city");
                    writer.writeAttribute("size", "big");
                    writer.writeCharacters("Dnipro");
                writer.writeEndElement();
                writer.writeStartElement("street");
                    writer.writeCharacters("Shmidta");
                writer.writeEndElement();
                writer.writeStartElement("house");
                    writer.writeCharacters("16");
                writer.writeEndElement();

            writer.writeEndElement();

        writer.writeEndDocument();
    }
}
