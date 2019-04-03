package MailAutomationTest.MailRu;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import MailAutomationTest.UserMailRu.SingletonWebDriver;
import MailAutomationTest.UserMailRu.User;
import MailAutomationTest.UserMailRu.UserBuilder;

public abstract class MailCommon {
	private static final Logger logger = Logger.getLogger(MailCommon.class);
	private static WebDriver instance;
	private MailRuPage mailRuPage;
	
	public void onMainScreen() {
		instance = SingletonWebDriver.getInstance();
		mailRuPage = new MailRuPage(instance);
		boolean result = mailRuPage.isLogoFieldPresent();
		if (result == false) {
			logger.error("Logo field should be displyed.");
		} else {
			logger.info("Logo field dispalyed correct.");
		}
		Assert.assertTrue(result);
	}
	
	public void doLogin() {
		UserBuilder userBuilder = new UserBuilder();
		User user = userBuilder.buildUser();
		enterText(mailRuPage.getLoginField(), user.getLogin());
		enterText(mailRuPage.getPasswordField(), user.getPassword());
		mailRuPage.getClickIncommingUser();
		mailRuPage.getLoginButton().click();
		
		//new WebDriverWait(instance, 20).until(ExpectedConditions.visibilityOf(mailRuPage.getLogoutButton()));
		new WebDriverWait(instance, 30).until(ExpectedConditions.elementToBeClickable(mailRuPage.getLogoutButton()));
		boolean result = mailRuPage.getLogoutButton().isDisplayed();
		if (result == false) {
			logger.error("Logo field should be displyed.");
		} else {
			logger.info("Logo field dispalyed correct.");
		}
		Assert.assertTrue(result);
	}
	
	public abstract void executeCustomLogic();
	
	public void executeAll() {
		onMainScreen();
		doLogin();
		executeCustomLogic();
	}
	
	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

}
