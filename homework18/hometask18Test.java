package core;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hometask18Test {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(
				"https://www.booking.com/searchresults.ru.html?aid=376376&label=bookings-name-x9XjJRNqhtTGZ30YXWfPUQS267724389816%3Apl%3Ata%3Ap1%3Ap22%2C246%2C000%3Aac%3Aap1t1%3Aneg%3Afi%3Atiaud-297601667435%3Akwd-65526620%3Alp1001493%3Ali%3Adec%3Adm&sid=c3b0983d7d1e1d1b1b4a84590a95600e&sb=1&src=index&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Findex.ru.html%3Faid%3D376376%3Blabel%3Dbookings-name-x9XjJRNqhtTGZ30YXWfPUQS267724389816%253Apl%253Ata%253Ap1%253Ap22%252C246%252C000%253Aac%253Aap1t1%253Aneg%253Afi%253Atiaud-297601667435%253Akwd-65526620%253Alp1001493%253Ali%253Adec%253Adm%3Bsid%3Dc3b0983d7d1e1d1b1b4a84590a95600e%3Bsb_price_type%3Dtotal%26%3B&ss=+D0+9C+D0+BE+D1+81+D0+BA+D0+B2+D0+B0+2C+20+D0+A0+D0+BE+D1+81+D1+81+D0+B8+D1+8F&is_ski_area=0&ssne=+D0+9C+D0+BE+D1+81+D0+BA+D0+B2+D0+B0+2C+20+D0+A0+D0+BE+D1+81+D1+81+D0+B8+D1+8F&ssne_untouched=+D0+9C+D0+BE+D1+81+D0+BA+D0+B2+D0+B0+2C+20+D0+A0+D0+BE+D1+81+D1+81+D0+B8+D1+8F&checkin_year=2019&checkin_month=3&checkin_monthday=10&checkout_year=2019&checkout_month=3&checkout_monthday=13&no_rooms=1&group_adults=2&group_children=0&b_h4u_keep_filters=&from_sf=1");
		WebElement searchField = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchField.clear();
		searchField.sendKeys("Москва");
		WebElement enterSearchField = driver.findElement(By.xpath("(//b[@class = \"search_hl_name\"])[1]"));
		enterSearchField.click();

		WebElement dateFirst = driver.findElement(By.xpath("(//div[@class = \"sb-date-field__display\"])[1]"));
		dateFirst.click();
		WebElement dateFirstValue = driver.findElement(By.xpath("(//td[@data-id = \"1551744000000\"])[1]"));
		dateFirstValue.click();

		WebElement dateEnd = driver.findElement(By.xpath("(//div[@class = \"sb-date-field__display\"])[2]"));
		dateEnd.click();
		WebElement dateEndValue = driver.findElement(By.xpath("(//td[@data-id = \"1552521600000\"])[2]"));
		dateEndValue.click();

		WebElement adult = driver.findElement(By.xpath("//select[@name = \"group_adults\"]"));
		Select adultField = new Select(adult);
		adultField.selectByIndex(1);

		WebElement room = driver.findElement(By.xpath("//select[@name= \"no_rooms\"]"));
		Select roomField = new Select(room);
		roomField.selectByIndex(0);

		WebElement submitButton = driver
				.findElement(By.xpath("//div[@class = \"sb-searchbox-submit-col -submit-button \"]"));
		submitButton.click();

		WebElement hotels = driver.findElement(By.id("hotellist_inner"));
		assertTrue(hotels.isDisplayed());
	}

}
