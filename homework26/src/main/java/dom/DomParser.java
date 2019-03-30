package dom;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import Lesson26.Hometask26.Countrie;

public class DomParser {
	public List<Countrie> parse(Document document) throws FileNotFoundException, XMLStreamException {
		NodeList nodeList = document.getElementsByTagName("Country");
		List<Countrie> countries = new ArrayList<Countrie>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			countries.add(getCountry(nodeList.item(i)));
		}
		return countries;
	}

	private static Countrie getCountry(Node node) {
		Countrie countries = new Countrie();
		Element element = (Element) node;
		countries.setId(Integer.valueOf(element.getAttribute("id")));
		countries.setCode(getTagValue("Code", element));
		countries.setName(getTagValue("Name", element));
		countries.setDescription(getTagValue("Description", element));

		return countries;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
}
