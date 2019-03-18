package hometask22cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hometask22Steps {
	private static final String MAIN_URL = "https://www.booking.com/searchresults.ru.html?aid=376376&label=bookings-name-x9XjJRNqhtTGZ30YXWfPUQS267724389816%3Apl%3Ata%3Ap1%3Ap22%2C246%2C000%3Aac%3Aap1t1%3Aneg%3Afi%3Atiaud-297601667435%3Akwd-65526620%3Alp1001493%3Ali%3Adec%3Adm&sid=c3b0983d7d1e1d1b1b4a84590a95600e&sb=1&src=index&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Findex.ru.html%3Faid%3D376376%3Blabel%3Dbookings-name-x9XjJRNqhtTGZ30YXWfPUQS267724389816%253Apl%253Ata%253Ap1%253Ap22%252C246%252C000%253Aac%253Aap1t1%253Aneg%253Afi%253Atiaud-297601667435%253Akwd-65526620%253Alp1001493%253Ali%253Adec%253Adm%3Bsid%3Dc3b0983d7d1e1d1b1b4a84590a95600e%3Bsb_price_type%3Dtotal%26%3B&ss=+D0+9C+D0+BE+D1+81+D0+BA+D0+B2+D0+B0+2C+20+D0+A0+D0+BE+D1+81+D1+81+D0+B8+D1+8F&is_ski_area=0&ssne=+D0+9C+D0+BE+D1+81+D0+BA+D0+B2+D0+B0+2C+20+D0+A0+D0+BE+D1+81+D1+81+D0+B8+D1+8F&ssne_untouched=+D0+9C+D0+BE+D1+81+D0+BA+D0+B2+D0+B0+2C+20+D0+A0+D0+BE+D1+81+D1+81+D0+B8+D1+8F&checkin_year=2019&checkin_month=3&checkin_monthday=10&checkout_year=2019&checkout_month=3&checkout_monthday=13&no_rooms=1&group_adults=2&group_children=0&b_h4u_keep_filters=&from_sf=1";
	private static final String city = "Москва";
	private static final Integer countAdult = 2;
	private static final Integer countRoom = 1;

	private Hometask22Page hometask22Page;
	private WebDriver webDriver;

	public Hometask22Steps() {
		webDriver = new ChromeDriver();
		hometask22Page = new Hometask22Page(webDriver);

	}

	@Given("^I am on main application page$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^I enter city name$")
	public void enterCitylName() {
		hometask22Page.enterData(city);
		hometask22Page.clickEnterSearchField();
	}

	@When("^I enter first date$")
	public void enterFirstDate() {
		hometask22Page.clickDateFirst();
		hometask22Page.clickDateFirstValue();
	}

	@When("^I enter end date$")
	public void enterEndDate() {
		hometask22Page.clickDateEnd();
		hometask22Page.clickDateEndValue();
	}

	@When("^I enter adult$")
	public void enterCountOfAdult() {
		hometask22Page.clickAdult();
		hometask22Page.chooseAdultField(countAdult);
	}

	@When("^I enter room$")
	public void enterCountOfRoom() {
		hometask22Page.clickRoom();
		hometask22Page.chooseRoomField(countRoom);
		hometask22Page.clickSubmitButton();
	}
	
	@When("^I sort hotel$")
	public void sortHotel() {
		hometask22Page.clickSortButton();
	//	hometask22Page.isHotelSorted(webDriver);
		hometask22Page.waitForJSandJQueryToLoad();
	}

	@Then("I see list of hotels")
	public void seeLogoutLink() {
		Assert.assertTrue(hometask22Page.isHotelsDisplayed(webDriver));
	}
	
	@Then("I see and check the rating of hotel")
	public void checkRatingOfHotel() {
		Assert.assertTrue(hometask22Page.ratingComparison() >= 9);
	}
	
	@After
	public void afterClass() {
		webDriver.quit();
	}
}
