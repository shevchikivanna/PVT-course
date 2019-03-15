package hometask;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailRuAvtomationTest {

	private WebDriver driver;
	private MailRuAvtomation mailRuAvtomation;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		mailRuAvtomation = new MailRuAvtomation(driver);
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}

	@Test
	public void testMailToSpam() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mail.ru/");
		mailRuAvtomation.enterData("kasjawiza", "kot");
		mailRuAvtomation.clickEnterButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(mailRuAvtomation.isLogoutDisplayed(driver));
		mailRuAvtomation.clickCheckboxForIncoming();
		mailRuAvtomation.clickSpamButton();
		assertTrue(mailRuAvtomation.isOKNotifyMessageDisplayed(driver));
	}

	@Test
	public void testMailFromSpam() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mail.ru/");
		mailRuAvtomation.enterData("kasjawiza", "kot");
		mailRuAvtomation.clickEnterButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(mailRuAvtomation.isLogoutDisplayed(driver));
		mailRuAvtomation.clickSpamFolder();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Спам"));
		assertTrue(mailRuAvtomation.isLogoutDisplayed(driver));
		mailRuAvtomation.clickCheckboxForSpam();
		mailRuAvtomation.clickNoSpamButton();
		assertTrue(mailRuAvtomation.isOKNotifyMessageDisplayed(driver));
	}

	@Test
	public void testFlag() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mail.ru/");
		mailRuAvtomation.enterData("kasjawiza", "kot");
		mailRuAvtomation.clickEnterButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(mailRuAvtomation.isLogoutDisplayed(driver));
		mailRuAvtomation.clickFlag();
	}

	@Test
	public void testCancelFlag() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mail.ru/");
		mailRuAvtomation.enterData("kasjawiza", "kot");
		mailRuAvtomation.clickEnterButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(mailRuAvtomation.isLogoutDisplayed(driver));
		mailRuAvtomation.clickFlaggedButton();
		mailRuAvtomation.clickCheckboxAllMark();
		mailRuAvtomation.clickMoreButton();
		mailRuAvtomation.clickCancelFlag();
	}

	@Test
	public void testSendMessageToGroupOfUsers() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mail.ru/");
		mailRuAvtomation.enterData("kasjawiza", "kot");
		mailRuAvtomation.clickEnterButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(mailRuAvtomation.isLogoutDisplayed(driver));
		mailRuAvtomation.clickNewEmailButton();
		mailRuAvtomation.enterDataToSendToField("test");
		mailRuAvtomation.enterDataToTemaField("AvtomationTest");
		(new WebDriverWait(driver, 5))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mailRuAvtomation.iframe));
		mailRuAvtomation.enterDataToEmailBody("Hello, Ulya!!!");
		driver.switchTo().defaultContent();
		mailRuAvtomation.clickSendButton();

	}

}
