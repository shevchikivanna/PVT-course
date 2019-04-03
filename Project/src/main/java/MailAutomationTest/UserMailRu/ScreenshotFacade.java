package MailAutomationTest.UserMailRu;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotFacade {
	
	private WebDriver instance = SingletonWebDriver.getInstance();
	
	public void makeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) instance).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\Users\\User-PC\\Desktop\\Screenshot\\screenshot_" + Math.random() + ".png"));
	}

}
