package hometask;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	private Massive massive;

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethd");
	}

	@DataProvider(name = "dataForSumElement")
	public Object[][] getSumElement() {
		return new Object[][] { { 5, 2, 3 }, { 0, 0, 0 }, { -5, -2, -3 }, };
	}

	@Test(dataProvider = "dataForSumElement")
	public void sumElementTest(int expected, int a, int b) {
		Assert.assertEquals(this.massive.sumElement(a, b), expected);
	}

	@Test
	public void sumElementTest2() {
		Assert.assertNotEquals(massive, null);
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		this.massive = new Massive();
	}

	@Test
	public void squareElementTest() {
		Assert.assertEquals(4, this.massive.squareElement(2));
	}

	@Test
	public void squareElementTest2() {
		Assert.assertEquals(massive.squareElement(10), 100);
	}

	@Test
	public void squareElementTest3() {
		Assert.assertNotEquals(90, massive.squareElement(10));
	}

	@Test
	public void devisionElementTest() {
		Assert.assertEquals(5.0, this.massive.divisionElement(10, 2));
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void devisionElementTest3() {
		massive.divisionElement(2, null);
	}

	@Test
	public void devisionElementTest2() {
		Assert.assertEquals(massive.divisionElement(2, 1), 2.0);
	}

	@Test
	public void multiplyElementTest() {
		Assert.assertEquals(10, this.massive.multiplyElement(5, 2));
	}

	@Test
	public void multiplyElementTest2() {
		Assert.assertNotEquals(2, massive.multiplyElement(3, 1));
	}

	@Test
	public void multiplyElementTest3() {
		Assert.assertFalse(massive.multiplyElement(2, 1) == 0);
	}

	@Test
	public void deductionElementTest() {
		Assert.assertEquals(3, this.massive.deductionElement(5, 2));
	}

	@Test
	public void deductionElementTest2() {
		Assert.assertFalse(massive.deductionElement(20, 1) == 10);
	}

	@Test
	public void deductionElementTest3() {
		Assert.assertNotEquals(2, massive.deductionElement(2, 1));
	}

	@Test
	public void valueIntFromDevisionElementTest() {
		Assert.assertEquals(1, this.massive.valueIntFromDevisionElement(5, 2));
	}

	@Test
	public void valueIntFromDevisionElementTest2() {
		Assert.assertFalse(massive.deductionElement(20, 3) == 3);
	}

	@Test
	public void valueIntFromDevisionElementTest3() {
		Assert.assertNotEquals(2, massive.deductionElement(7, 2));
	}

	@Test
	public void lessOrMoreTest() {
		Assert.assertTrue(massive.lessOrMore(5, 2));
	}

	@Test
	public void lessOrMoreTest2() {
		Assert.assertFalse(massive.lessOrMore(2, 5));
	}

	@Test
	public void isZeroTest() {
		Assert.assertFalse(massive.isZero(5));
	}

	@Test
	public void isZeroTest1() {
		Assert.assertTrue(massive.isZero(0));
	}

	@Ignore
	@Test
	public void moreZeroTest() {
		Assert.assertFalse(massive.moreZero(-2));
	}

	@Test
	public void moreZeroTest1() {
		Assert.assertTrue(massive.moreZero(5));
	}

	@Ignore
	@Test
	public void isNullTest() {
		Assert.assertFalse(massive.isNull(5));
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void isNullTest1() {
		massive.isNull(null);
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
