package MailAutomationTest.MailRu;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import MailAutomationTest.UserMailRu.SingletonWebDriver;

public class RemoveToSpam extends MailCommon{

	private static WebDriver instance;
	private MailRuPage mailRuPage;
	private static final Logger logger = Logger.getLogger(MailCommon.class);
	
	@Override
	public void executeCustomLogic() {
		// TODO Auto-generated method stub
		instance = SingletonWebDriver.getInstance();
		mailRuPage = new MailRuPage(instance);
		mailRuPage.clickCheckboxForIncoming();
		mailRuPage.clickSpamButton();
		boolean result = mailRuPage.isOKNotifyMessageDisplayed(instance);
		if (result == false) {
			logger.error("Logo field should be displyed.");
		} else {
			logger.info("Logo field dispalyed correct.");
		}
		assertTrue(result);
	}

}
