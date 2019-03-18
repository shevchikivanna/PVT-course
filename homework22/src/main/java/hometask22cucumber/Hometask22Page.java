package hometask22cucumber;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hometask22Page
{
    private static final int LINK_PRESENSE_TIMEOUT = 10;

	private WebDriver driver;

	@FindBy(xpath = "//*[@id=\"ss\"]")
	private WebElement searchField;

	@FindBy(xpath = "(//b[@class = \"search_hl_name\"])[1]")
	private WebElement enterSearchField;

	@FindBy(xpath = "(//div[@class = \"sb-date-field__display\"])[1]")
	private WebElement dateFirst;

	@FindBy(xpath = "(//td[@data-id = \"1553212800000\"])[1]")
	private WebElement dateFirstValue;

	@FindBy(xpath = "(//div[@class = \"sb-date-field__display\"])[2]")
	private WebElement dateEnd;

	@FindBy(xpath = "(//td[@data-id = \"1553817600000\"])[2]")
	private WebElement dateEndValue;

	@FindBy(xpath = "//select[@name = \"group_adults\"]")
	private WebElement adult;

	@FindBy(xpath = "//select[@name= \"no_rooms\"]")
	private WebElement room;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[5]/div[2]/button")
	private WebElement submitButton;

	@FindBy(xpath = "//div[@id = \"hotellist_inner\"]")
	private WebElement hotels;

	@FindBy(xpath = "//a[@data-category = \"review_score_and_price\"]")
	private WebElement sortButton;

	@FindBy(xpath = "//div[@class = \"hotellist sr_double_search\"]")
	private WebElement listOfHotel;

	@FindBy(xpath = "(//div[@class = \"bui-review-score__badge\"])[1]")
	private WebElement rating;

    public Hometask22Page(WebDriver webdriver)
    {
        PageFactory.initElements(webdriver, this);
        this.driver = webdriver;
    }

    public void enterData(String city) {
		enterText(searchField, city);
	}

	public void clickEnterSearchField() {
		enterSearchField.click();
	}

	public void clickDateFirst() {
		dateFirst.click();
	}

	public void clickDateFirstValue() {
		dateFirstValue.click();
	}

	public void clickDateEnd() {
		dateEnd.click();
	}

	public void clickDateEndValue() {
		dateEndValue.click();
	}

	public void clickAdult() {
		adult.click();
	}

	public void chooseAdultField(int count) {
		Select adultField = new Select(adult);
		adultField.selectByIndex(count);
	}

	public void clickRoom() {
		room.click();
	}

	public void chooseRoomField(int count) {
		Select roomField = new Select(room);
		roomField.selectByIndex(count);
	}

	public void clickSubmitButton() {
		submitButton.click();
	}

	public boolean isHotelsDisplayed(WebDriver driver) {

		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(hotels));
		return hotels.isDisplayed();
	}

	public void clickSortButton() {
		sortButton.click();
	}

	public boolean isHotelSorted(WebDriver driver) {

		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(listOfHotel));
		return listOfHotel.isDisplayed();
	}

	public int ratingComparison() {
		Integer ratingInt = Integer.parseInt(rating.getText());
		System.out.println(ratingInt);
		return ratingInt;
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

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
