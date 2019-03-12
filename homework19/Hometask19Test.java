package core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Hometask19Test {

	Hometask19 hometask19 = new Hometask19();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheaperHotel() {
		hometask19.openBooking();
		hometask19.selectCity("moscow");
		hometask19.selectStartEndDate();
		hometask19.selectAdultAndRooms(1, 0);
		hometask19.selectCheaperHotel();
		Assert.assertFalse("There is no any hotel!", hometask19.listOfHotels().isEmpty());
		hometask19.selectHotelWithHigherRating();
		Assert.assertTrue(hometask19.compareMaxPrise(200));
		hometask19.closeBrowser();
	}

	@Test
	public void testTheMostExpensiveHotel() {
		hometask19.openBooking();
		hometask19.selectCity("Париж");
		hometask19.selectStartEndDate();
		hometask19.selectAdultAndRooms(3, 1);
		hometask19.selectMostExpensiveHotel();
		Assert.assertFalse("There is no any hotel!", hometask19.listOfHotels().isEmpty());
		hometask19.selectCheaperHotelFromExpensive();
		Assert.assertTrue(hometask19.compareMinPrise(3000));
		hometask19.closeBrowser();
	}

	@Test
	public void testErrorBooking() {
		hometask19.openBooking();
		hometask19.selectCity("Париж");
		hometask19.selectStartEndDate();
		hometask19.selectAdultAndRooms(3, 1);
		hometask19.selectMostExpensiveHotel();
		Assert.assertFalse("There is no any hotel!", hometask19.listOfHotels().isEmpty());
		hometask19.selectCheaperHotelFromExpensive();
		hometask19.bookingHotel();
		hometask19.usersInformation("Ivanov", "kasjawiza@mail.ru");
		hometask19.userMoreInformation("8888888", "4242 4242 4242 4242", "111");
	}

}
