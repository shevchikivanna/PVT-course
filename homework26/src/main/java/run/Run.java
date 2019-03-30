package run;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import Lesson26.Hometask26.Countrie;
import stax.StaxParser;
import dom.DomParser;
import sax.SaxParserHandler;

public class Run
{

    private static final String COUNTRYES_XML = "countryes.xml";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException,
            XMLStreamException
    {
        System.out.println(" ========================= SAX parser ==============================");
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        SaxParserHandler saxParserHandler = new SaxParserHandler();
        saxParser.parse(new File(COUNTRYES_XML), saxParserHandler);
        List<Countrie> countries = saxParserHandler.getCountries();
        countries.forEach(countrie -> System.out.println(countrie));

        System.out.println(" ============================== STAX parser =========================");
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(COUNTRYES_XML));
        countries = new StaxParser().parse(xmlEventReader);
        countries.forEach(countrie -> System.out.println(countrie));

        System.out.println(" ============================== DOM parser =========================");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document = dBuilder.parse(COUNTRYES_XML);
        countries = new DomParser().parse(document);
        countries.forEach(countrie -> System.out.println(countrie));
    }

}
