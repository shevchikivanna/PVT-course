package hometask;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MassiveTest {

	private Massive massive = new Massive();

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
	public void testSumElement() {
		assertTrue(massive.sumElement(1, 5, 4) == 10);
	}

	@Test
	public void testSumElement2() {
		assertNotEquals(massive, null);
	}

	@Test
	public void testDecreaseElement() {
		assertFalse(massive.decreaseElement(20, 1, -3) == 10);
	}

	@Test
	public void testDecreaseElement2() {
		assertNotEquals(massive.decreaseElement(2, 1, 1), 3);
	}

	@Test
	public void testMultiplayElement() {
		assertFalse(massive.multiplayElement(2, 1, 1) == 0);
	}

	@Ignore
	@Test
	public void testMultiplayElement2() {
		assertNotEquals(massive.multiplayElement(3, 1, 1), 2);
	}

	@Test
	public void testSquareElement() {
		assertTrue(massive.squareElement(10) == 100);
	}

	@Ignore("It's OK")
	@Test
	public void testSquareElement2() {
		assertNotEquals(massive.squareElement(10), 90);
	}

	@Test(expected = NullPointerException.class)
	public void testDivisionElement() {
		assertFalse(massive.divisionElement(2, null) == 0);
	}

	@Test
	public void testDivisionElement2() {
		assertTrue(massive.divisionElement(2, 1) == 2);
	}
}
