package MailAutomationTest.MailRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MailAutomationTest.UserMailRu.SingletonWebDriver;

public class MailRuPage {
	
	private WebDriver instance = SingletonWebDriver.getInstance();
	
	@FindBy	(xpath = "//div[@id = \"logo\"]")
	private WebElement logo;
	
	@FindBy(xpath = "//input [@ id = \"mailbox:login\"]")
	private WebElement loginField;

	@FindBy(xpath = "//input [@ id = \"mailbox:password\"]")
	private WebElement passwordField;

	@FindBy(xpath = "//input [@ class= \"o-control\"]")
	private WebElement loginButton;
	
	@FindBy(xpath = "//input[@id= \"mailbox:saveauth\"]")
	private WebElement clickToSaveIncommingUser;

	@FindBy(xpath = "//a[@ id= \"PH_logoutLink\"]")
	private WebElement logout;
	
	@FindBy(xpath = "(//div[@class = \"b-checkbox__box\"])[3]")
	private WebElement checkboxForIncoming;

	@FindBy(xpath = "//div[@data-name = \"spam\"]")
	private WebElement spamButton;

	@FindBy(xpath = "//div[@class = \"js-ok notify-message\"]")
	private WebElement okNotifyMessage;
	
	@FindBy(xpath = "//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a/span")
	public WebElement newEmailButton;

	@FindBy(xpath = "//*[contains(@id,'_ifr')]")
	public WebElement iframe;

	@FindBy(id = "tinymce")
	public WebElement emailBody;

	@FindBy(xpath = "(//textarea[@class = \"js-input compose__labels__input\"])")
	private WebElement sendToField;

	@FindBy(xpath = "(//div[@data-group = 'test'])")
	private WebElement divSendToGroupTest;

	@FindBy(xpath = "//input[@tabindex = \"7\"]")
	private WebElement temaField;

	@FindBy(xpath = "(//div[@data-name = \"send\"])[1]")
	private WebElement sendButton;
	
	@FindBy(xpath = "//input[@id = \"q\"]")
	private WebElement searchField;
	
	@FindBy(xpath = "//*[@id=\"search:submit\"]")
	private WebElement submitButton;
			
	@FindBy(xpath = "//a[@id = \"signup\"]")
	private WebElement sungUpButton;
	
	//@FindBy(xpath = "(//span[@class = \"b-email__name\"])[1]")
	@FindBy(xpath = "//input[@data-blockid = \"email_name\"]")
	private WebElement emailAdress;
	
	@FindBy(xpath = "(//div[text() = 'Ящик с таким именем уже существует'])[2]")
	private WebElement infoExistingEmailAdress;
	
	@FindBy(xpath = "//button[@data-bem = \"btn\"]")
	private WebElement registration;
	
	public MailRuPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.instance = webdriver;
	}
	
	public boolean isLogoFieldPresent() {
		return logo.isDisplayed();
	}
	
	public WebElement getLoginField() {
		return loginField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}
	
	public WebElement getClickIncommingUser() {
		return clickToSaveIncommingUser;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getLogoutButton() {
		return logout;
	}
	
	public void clickLogoutButton() {
		logout.click();
	}
	
	public void clickCheckboxForIncoming() {
		checkboxForIncoming.click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}
	
	public void clickNewEmailButton() {
		newEmailButton.click();
	}

	public void enterDataToSendToField(String nameOfGroup) {
		enterText(sendToField, nameOfGroup);
		divSendToGroupTest.click();
	}

	public void enterDataToTemaField(String tema) {
		enterText(temaField, tema);
	}

	public void enterDataSearch(String information) {
		enterText(searchField, "news");
	}

	public void clickSearchField() {
		searchField.click();
	}
	
	public void enterDataToEmailBody(String information) {
		enterText(emailBody, information);
	}
	
	public void clickSubmitButton() {
		submitButton.click();
	}
	
	public void clickSingUpButton() {
		sungUpButton.click();
	}
	
	public void clickEmailAdressButton() {
		emailAdress.click();
	}
	
	public boolean checkErrorInfo() {
		return infoExistingEmailAdress.isDisplayed();
	}
	
	public void clickSendButton() {
		sendButton.click();
	}
	
	public void clickRegistrationButton() {
		registration.click();
	}
	 
	public boolean isOKNotifyMessageDisplayed(WebDriver driver) {

		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(okNotifyMessage));
		return okNotifyMessage.isDisplayed();
	}
	
	public void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

	public WebElement getEmailAdress() {
		return emailAdress;
	}
	

}
