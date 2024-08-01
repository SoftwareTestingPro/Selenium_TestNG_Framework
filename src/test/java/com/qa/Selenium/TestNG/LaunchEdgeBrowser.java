package com.qa.Selenium.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchEdgeBrowser {

	@Test
	public void launchChromeBrowser() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.microsoft.com");
		driver.quit();
	}
}
