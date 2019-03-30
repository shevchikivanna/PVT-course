package core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import core.BookingFacade;

public class TestHometask21 {

	private static BookingFacade bookingFacade;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bookingFacade = new BookingFacade();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		// instance.quit();
	}

	@Test
	public void testIsHotelsDisplayed() {
		bookingFacade.hotelsDisplayed();
		Assert.assertTrue(bookingFacade.isHotelsDisplayed());
	}

	@Test
	public void testRatingOfHotel() {
		bookingFacade.ratingOfHotel();
		Assert.assertTrue(bookingFacade.ratingComparison() >= 9);
	}

}
