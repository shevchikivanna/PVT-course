package hometask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailRuAvtomation {

	@FindBy(xpath = "//input [@ id = \"mailbox:login\"]")
	private WebElement loginField;

	@FindBy(xpath = "//input [@ id = \"mailbox:password\"]")
	private WebElement passswordField;

	@FindBy(xpath = "//input [@ class= \"o-control\"]")
	private WebElement loginButton;

	@FindBy(xpath = "//a[@ id= \"PH_logoutLink\"]")
	private WebElement logout;

	@FindBy(xpath = "(//div[@class = \"b-checkbox__box\"])[3]")
	private WebElement checkboxForIncoming;

	@FindBy(xpath = "//div[@data-name = \"spam\"]")
	private WebElement spamButton;

	@FindBy(xpath = "//div[@class = \"js-ok notify-message\"]")
	private WebElement okNotifyMessage;

	@FindBy(xpath = "//div[@data-id = \"950\"]")
	private WebElement spamFolder;

	@FindBy(xpath = "(//div[@class = \"b-checkbox__box\"])[40]")
	private WebElement checkboxForSpam;

	@FindBy(xpath = "//div[@data-name = \"noSpam\"]")
	private WebElement noSpamButton;

	@FindBy(xpath = "//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a/span")
	private WebElement newEmailButton;

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

	@FindBy(xpath = "(//div[@data-act = \"flag\"])[6]")
	private WebElement flag1;

	@FindBy(xpath = "(//div[@data-act = \"flag\"])[7]")
	private WebElement flag2;

	@FindBy(xpath = "(//div[@data-act = \"flag\"])[8]")
	private WebElement flag3;

	@FindBy(xpath = "//*[@id=\"b-toolbar__right\"]/div[2]/div/div[1]/div[2]/div/div[2]")
	private WebElement flaggedButton;

	@FindBy(xpath = "(//div[@class = \"b-checkbox__box\"])[1]")
	private WebElement checkboxAllMark;

	@FindBy(xpath = "(//span[text() = \"Åù¸\"])[2]")
	private WebElement moreButton;

	@FindBy(xpath = "(//a[@data-num = \"4\"])[2]")
	private WebElement cancelFlag;

	public MailRuAvtomation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterData(String login, String password) {
		enterText(loginField, login);
		enterText(passswordField, password);
	}

	public void clickEnterButton() {
		loginButton.click();
	}

	public boolean isLogoutDisplayed(WebDriver driver) {

		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(logout));
		return logout.isDisplayed();
	}

	public void clickCheckboxForIncoming() {
		checkboxForIncoming.click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public boolean isOKNotifyMessageDisplayed(WebDriver driver) {

		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(okNotifyMessage));
		return okNotifyMessage.isDisplayed();
	}

	public void clickSpamFolder() {
		spamFolder.click();
	}

	public boolean isNoSpamDisplayed(WebDriver driver) {

		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(noSpamButton));
		return noSpamButton.isDisplayed();
	}

	public void clickCheckboxForSpam() {
		checkboxForSpam.click();
	}

	public void clickNoSpamButton() {
		noSpamButton.click();
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

	public void enterDataToEmailBody(String information) {
		enterText(emailBody, information);
	}

	public void clickSendButton() {
		sendButton.click();
	}

	public void clickFlag() {
		flag1.click();
		flag2.click();
		flag3.click();
	}

	public void clickFlaggedButton() {
		flaggedButton.click();
	}

	public void clickCheckboxAllMark() {
		checkboxAllMark.click();
	}

	public void clickMoreButton() {
		moreButton.click();
	}

	public void clickCancelFlag() {
		cancelFlag.click();
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}
}
