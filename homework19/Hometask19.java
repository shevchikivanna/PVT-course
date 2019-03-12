package core;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hometask19 {

	WebDriver driver = new ChromeDriver();

	public void openBooking() {
		driver.get("http://www.booking.com/");

	}

	public void selectCity(String city) {
		WebElement element = driver.findElement(By.id("ss"));
		element.clear();
		element.sendKeys(city);
		WebElement enterSearchField = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//b[@class = \"search_hl_name\"])[1]")));
		enterSearchField.click();

	}

	public void selectStartEndDate() {
		LocalDate currentDate = LocalDate.now();
		LocalDate startDate = currentDate.plusDays(3);
		LocalDate endDate = startDate.plusDays(7);
		driver.findElement(By.xpath(".//td[@data-date=\"" + startDate + "\"]")).click();
		driver.findElement(By.xpath(".//td[@data-date=\"" + endDate + "\"]")).click();
		driver.findElement(By.className("sb-searchbox__button  ")).click();

	}

	public void selectAdultAndRooms(int adultNumber, int roomNumber) {
		WebElement adult = driver.findElement(By.xpath("//select[@name = \"group_adults\"]"));
		Select adultField = new Select(adult);
		adultField.selectByIndex(adultNumber);

		WebElement room = driver.findElement(By.xpath("//select[@name= \"no_rooms\"]"));
		Select roomField = new Select(room);
		roomField.selectByIndex(roomNumber);

	}

	public void selectCheaperHotel() {
		WebElement cheaperHotel = driver.findElement(By.xpath("//a[@data-id = \"pri-1\"]"));
		cheaperHotel.click();
		waitForJSandJQueryToLoad();

	}

	public void selectMostExpensiveHotel() {
		WebElement expensiveHotel = driver.findElement(By.xpath("//a[@data-id = \"pri-5\"]"));
		expensiveHotel.click();
		waitForJSandJQueryToLoad();

	}

	public List<WebElement> listOfHotels() {
		List<WebElement> hotels = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
						By.xpath(".//div[normalize-space(@data-et-view) = \"eWHJbWPNZWEHXT:5\"]")));

		return hotels;
	}

	public void selectHotelWithHigherRating() {

		WebElement hotelDropdown = (new WebDriverWait(driver, 10)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"sortbar_dropdown_container\"]")));
		hotelDropdown.click();
		WebElement hotelsWithHigherRating = (new WebDriverWait(driver, 10)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"sortbar_dropdown_options\"]/li[3]/a")));
		hotelsWithHigherRating.click();
		waitForJSandJQueryToLoad();

	}

	public boolean compareMaxPrise(int maxPrise) {
		WebElement priseWeb = driver.findElement(
				By.xpath("//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong/b"));
		String[] arrayPrise = priseWeb.getText().split(" ");
		String prise = "";
		for (int i = 1; i < arrayPrise.length; i++) {
			prise = prise + arrayPrise[i];
		}
		int priseValue = Integer.parseInt(prise);
		System.out.println(priseValue);
		return priseValue <= maxPrise;

	}

	public void closeBrowser() {
		driver.quit();
	}

	public void selectCheaperHotelFromExpensive() {

		WebElement sortBySmallPrise = driver.findElement(By.xpath("(.//a[@class = \"sort_option \"])[2]"));
		sortBySmallPrise.click();
		waitForJSandJQueryToLoad();

	}

	public boolean compareMinPrise(int minPrise) {
		WebElement priseWeb = driver.findElement(
				By.xpath("//*[@id=\"hotellist_inner\"]/div[2]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong/b"));
		String[] arrayPrise = priseWeb.getText().split(" ");
		String prise = "";
		for (int i = 1; i < arrayPrise.length; i++) {
			prise = prise + arrayPrise[i];
		}
		int priseValue = Integer.parseInt(prise);
		System.out.println(priseValue);
		return priseValue >= minPrise;
	}

	public void bookingHotel() {

		driver.findElement(By.xpath("(.//div[@class = \"sr-cta-button-row\"])[1]")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}

		driver.findElement(By.xpath("(.//button[@id = \"hp_book_now_button\"])[1]")).click();
		waitForJSandJQueryToLoad();
		driver.findElement(By.xpath("//div[@class = \"hprt-reservation-cta\"]")).click();
	}

	public void usersInformation(String lastname, String email) {

		WebElement lastnameField = driver.findElement(By.xpath("//input[@id = \"lastname\"]"));
		lastnameField.clear();
		lastnameField.sendKeys(lastname);

		WebElement emailField = driver.findElement(By.xpath(".//input[@id = \"email\"]"));
		emailField.clear();
		emailField.sendKeys(email);

		WebElement email_confirmField = driver.findElement(By.xpath(".//input[@id = \"email_confirm\"]"));
		email_confirmField.clear();
		email_confirmField.sendKeys(email);
		waitForJSandJQueryToLoad();

		driver.findElement(By.cssSelector("button[name='book']")).click();
		waitForJSandJQueryToLoad();
	}

	public void userMoreInformation(String phone, String numberOfCC, String cvcCode) {

		WebElement phoneField = driver.findElement(By.cssSelector("input[id = \"phone\"]"));
		phoneField.sendKeys(phone);

		Select typeOfCC = new Select(driver.findElement(By.xpath("//select[@id = \"cc_type\"]")));
		typeOfCC.selectByIndex(2);

		WebElement numberOfCCField = driver.findElement(By.cssSelector("input[id = \"cc_number\"]"));
		typeInElementSymbolBySymbol(numberOfCCField, numberOfCC);

		Select date = new Select(driver.findElement(By.xpath("//select[@id = \"cc_month\"]")));
		date.selectByIndex(3);
		Select year = new Select(driver.findElement(By.xpath("//select[@id = \"ccYear\"]")));
		year.selectByIndex(3);

		WebElement cvcCodeField = driver.findElement(By.cssSelector("input[id = \"cc_cvc\"]"));
		cvcCodeField.sendKeys(cvcCode);
		waitForJSandJQueryToLoad();

		driver.findElement(By.xpath("//button[normalize-space(@class) = \"submit_holder_button\"]")).submit();
	}

	private void typeInElementSymbolBySymbol(WebElement element, String value) {
		for (int i = 0; i < value.length(); i++) {
			char symbol = value.charAt(i);
			element.sendKeys(String.valueOf(symbol));
		}
	}

	public boolean waitForJSandJQueryToLoad() {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		// wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
				} catch (Exception e) {
					// no jQuery present
					return true;
				}
			}
		};

		// wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};

		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}
}
