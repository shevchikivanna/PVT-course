package MailAutomationTest.UserMailRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class SingletonWebDriver {
	
	private static WebDriver instance = new ChromeDriver();

	private  SingletonWebDriver() {

	}

	public static WebDriver getInstance() {
		return instance;
	}

}
