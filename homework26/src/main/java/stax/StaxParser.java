package stax;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import Lesson26.Hometask26.Countrie;

public class StaxParser {

	private static final String CODE = "Code";
	private static final String NAME = "Name";
	private static final String DESCRIPTION = "Description";
	private static final String ID = "id";
	private static final String COUNTRY = "Country";

	private Countrie countrie;
	List<Countrie> countries = new ArrayList<>();

	public List<Countrie> parse(XMLEventReader xmlEventReader) throws FileNotFoundException, XMLStreamException {
		while (xmlEventReader.hasNext()) {
			XMLEvent xmlEvent = xmlEventReader.nextEvent();
			proceedStartElement(xmlEvent, xmlEventReader);
			proceedEndElement(xmlEvent);
		}
		return countries;
	}

	private void proceedStartElement(XMLEvent xmlEvent, XMLEventReader xmlEventReader) throws XMLStreamException {
		if (xmlEvent.isStartElement()) {
			StartElement startElement = xmlEvent.asStartElement();
			if (isTagNameEqual(startElement, COUNTRY)) {
				countrie = new Countrie();
				Attribute attribute = startElement.getAttributeByName(new QName(ID));
				if (attribute != null) {
					countrie.setId(Integer.parseInt(attribute.getValue()));
				}
			}
			// set the other varibles from xml elements
			else if (isTagNameEqual(startElement, CODE)) {
				countrie.setCode(xmlEventReader.nextEvent().asCharacters().getData());
			} else if (isTagNameEqual(startElement, NAME)) {
				countrie.setName(xmlEventReader.nextEvent().asCharacters().getData());
			} else if (isTagNameEqual(startElement, DESCRIPTION)) {
				countrie.setDescription(xmlEventReader.nextEvent().asCharacters().getData());
			}

		}
	}

	private void proceedEndElement(XMLEvent xmlEvent) {
		if (xmlEvent.isEndElement()) {
			EndElement endElement = xmlEvent.asEndElement();
			if (endElement.getName().getLocalPart().equals(COUNTRY)) {
				countries.add(countrie);
			}
		}
	}

	private boolean isTagNameEqual(StartElement startElement, String tagName) {
		return startElement.getName().getLocalPart().equals(tagName);
	}
}
