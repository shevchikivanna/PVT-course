package MailAutomationTest.UserMailRu;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class MailInfoParser {
	private static final Logger logger = Logger.getLogger(MailInfoParser.class);
	
	private List<String> recipients = new ArrayList<>();
	private String subject;
	private String body;
	
	public MailInfoParser() {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        Document document = dBuilder.parse("InfoForSendingEmail.xml");
	        NodeList recipientsList = document.getElementsByTagName("Recipient");
	        
	        for (int i = 0; i < recipientsList.getLength(); i++) {
	        	this.recipients.add(recipientsList.item(i).getTextContent());
	        }
	        this.subject = document.getElementsByTagName("Subject").item(0).getTextContent();
	        this.body = document.getElementsByTagName("Body").item(0).getTextContent();
		} catch(Exception err) {
			logger.error(err);
		}
		
	}
	
	public List<String> getRecipients() {
		return recipients;
	}

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}
	
}

