package sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import Lesson26.Hometask26.Countrie;

public class SaxParserHandler extends DefaultHandler{

	 private List<Countrie> countries;
	    private Countrie countrie;
	    boolean bCode = false;
	    boolean bName = false;
	    boolean bDescription = false;
	   
	    public List<Countrie> getCountries()
	    {
	        return countries;
	    }

	    @Override
	    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
	    {

	        if (qName.equalsIgnoreCase("Country"))
	        {
	            String id = attributes.getValue("id");
	            countrie = new Countrie();
	            countrie.setId(Integer.parseInt(id));
	            if (countries == null)
	            {
	            	countries = new ArrayList<>();
	            }
	        }
	        else if (qName.equalsIgnoreCase("code"))
	        {
	            bCode = true;
	        }
	        else if (qName.equalsIgnoreCase("name"))
	        {
	            bName = true;
	        }
	        else if (qName.equalsIgnoreCase("description"))
	        {
	            bDescription = true;
	        }      
	    }

	    @Override
	    public void endElement(String uri, String localName, String qName) throws SAXException
	    {
	        if (qName.equalsIgnoreCase("Country"))
	        {
	        	countries.add(countrie);
	        }
	    }

	    @Override
	    public void characters(char ch[], int start, int length) throws SAXException
	    {

	        if (bName)
	        {
	        	countrie.setName(new String(ch, start, length));
	            bName = false;
	        }
	        else if (bDescription)
	        {
	        	countrie.setDescription(new String(ch, start, length));
	            bDescription = false;
	        } else if (bCode) {
	        	countrie.setCode(new String(ch, start, length));
	        	bCode = false;
	        }
	       
	       
	    }
}
