package MailAutomationTest.MailRu;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MailAutomationTest.UserMailRu.MailInfoParser;
import MailAutomationTest.UserMailRu.SingletonWebDriver;

public class CreateAndSendEmail extends MailCommon {
	
	private static WebDriver instance;
	private MailRuPage mailRuPage;
	private static final Logger logger = Logger.getLogger(MailCommon.class);
	
	@Override
	public void executeCustomLogic() {
		instance = SingletonWebDriver.getInstance();
		mailRuPage = new MailRuPage(instance);
		
		new WebDriverWait(instance, 30).until(ExpectedConditions.visibilityOf(mailRuPage.newEmailButton));
		mailRuPage.clickNewEmailButton();
		MailInfoParser parser = new MailInfoParser();
		(new WebDriverWait(instance, 30))
		.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mailRuPage.iframe));
		mailRuPage.enterDataToEmailBody(parser.getBody());
		
		instance.switchTo().defaultContent();
		mailRuPage.enterDataToTemaField(parser.getSubject());
		mailRuPage.enterDataToSendToField(parser.getRecipients().get(0));
		mailRuPage.clickSendButton();
		
		new WebDriverWait(instance, 30).until(ExpectedConditions.titleIs("Письмо отправлено - Почта Mail.Ru"));
		assertTrue(instance.getTitle().equals("Письмо отправлено - Почта Mail.Ru"));
		if (instance.getTitle().equals("Письмо отправлено - Почта Mail.Ru") == true) {
			logger.info("Email was sent");
		} else {
			logger.error("Email was not send");
		}
	}

}
