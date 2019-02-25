package core;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
	private MathOperations mathOperations;
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		 System.out.println("AfterMethd");
	}
	
	@DataProvider(name = "dataForSumElement")
	public Object [][] getSumElement(){
		return new Object[][] { 
			{ 5, 2, 3},
			{ 0, 0, 0}, 
			{-5, -2, -3},
			};
	}
	
	@Test (dataProvider = "dataForSumElement")
	public void sumElementTest(int expected, int a, int b) {
		Assert.assertEquals(this.mathOperations.sumElement(a, b), expected);
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
		this.mathOperations = new MathOperations();
	}
	
	@Test
	public void squareElementTest() {
		Assert.assertEquals(4, this.mathOperations.squareElement(2));
	}
	
	@Test
	public void devisionElementTest() {
		Assert.assertEquals(5.0, this.mathOperations.divisionElement(10, 2));
	}

	@Parameters({"paramIntA", "paramIntB"})
	@Test
	public void multiplyElementTest(int a, int b) {
		Assert.assertEquals(10, this.mathOperations.multiplyElement(5, 2));
	}

	@Test
	public void deductionElementTest() {
		Assert.assertEquals(3, this.mathOperations.deductionElement(5, 2));
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
