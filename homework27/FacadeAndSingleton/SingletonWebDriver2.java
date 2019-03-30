package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SingletonWebDriver2 {

	private static WebDriver instance = new ChromeDriver();

	private SingletonWebDriver2() {

	}

	public static WebDriver getInstance() {
		return instance;
	}
}
