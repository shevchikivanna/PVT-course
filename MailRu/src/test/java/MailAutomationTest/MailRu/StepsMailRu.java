package MailAutomationTest.MailRu;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import MailAutomationTest.UserMailRu.ScreenshotFacade;
import MailAutomationTest.UserMailRu.SingletonWebDriver;
import MailAutomationTest.UserMailRu.User;
import MailAutomationTest.UserMailRu.UserBuilder;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepsMailRu {
	private static final Logger logger = Logger.getLogger(StepsMailRu.class);
	private static final String url = "http://www.mail.ru";
	
	private static WebDriver instance;
	private ScreenshotFacade screenshotFacade;
	private MailCommon mailCommon;
	private RemoveToSpam removeToSpam;
	private MailRuPage mailRuPage;
	private CreateAndSendEmail createAndSendEmail;
	private User user;
	
	public StepsMailRu() {
		instance = SingletonWebDriver.getInstance();
		screenshotFacade = new ScreenshotFacade();
		mailCommon = new MainMailRu();
		removeToSpam = new RemoveToSpam();
		mailRuPage = new MailRuPage(instance);
		createAndSendEmail = new CreateAndSendEmail();
		UserBuilder userBuilder = new UserBuilder();
		this.user = userBuilder.buildUser();
	}

	@Given("^I am on main application page$")
	public void loudPageWithUrl() {
		instance.get(url);
	}

	@And("I see mail logo")
	public void seeMailLogo() {
		mailCommon.onMainScreen();
	}
	
	@And("I enter login data")
	public void enterLogin() {
		mailCommon.doLogin();
	}
	
	@And("I remove email to spam")
	public void removeToSpam() {
		removeToSpam.executeAll();
	}
	
	@And("I create email and send email")
	public void createAndSendEmail() {
		createAndSendEmail.executeAll();
	}
	
	@And("I am on search field")
	public void searchField() {
		mailRuPage.clickSearchField();
	}
	
	@And("I enter the data")
	public void enterSearchData() {
		mailRuPage.enterDataSearch("news");
	}

	@And("I click submit")
	public void submitSearch() {
		mailRuPage.clickSubmitButton();
	}
	
	@And("I see page with news")
	public void founddPage() {
		boolean result = instance.getTitle().contains("news");
		if (result == false) {
			logger.error("Logo field should be displyed.");
		} else {
			logger.info("Logo field dispalyed correct.");
		}
		Assert.assertTrue(result);
	}
		
	@And("I click on sing up")
	public void sungUpButtonTest() {
		mailRuPage.clickSingUpButton();
	}
	
	@And("I enter email")
	public void trayToSingUp() {
		for (String handle: instance.getWindowHandles()) {
			instance.switchTo().window(handle);
		}
		mailRuPage.getEmailAdress().click();
		mailRuPage.enterText(mailRuPage.getEmailAdress(), this.user.getLogin().split("@")[0]);
	}
	
	@And("I click registration")
	public void registrationClick() {
		mailRuPage.clickRegistrationButton();
	}
	
	@And("I see error info about existing")
	public void checkErrorInfoRegistration() {
		boolean result = mailRuPage.checkErrorInfo();
		if (result == false) {
			logger.error("Logo field should be displyed.");
		} else {
			logger.info("Logo field dispalyed correct.");
		}
		Assert.assertTrue(result);
	}
		   		
	@Then("I make screenshot")
	public void makeScreenshot() throws IOException {
		screenshotFacade.makeScreenshot();
	}

	@And("I log out")
	public void afterClass() {
		mailRuPage.clickLogoutButton();
	}

}
