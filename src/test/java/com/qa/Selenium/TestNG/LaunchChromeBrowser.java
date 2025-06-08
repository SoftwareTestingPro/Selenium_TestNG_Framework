package com.qa.Selenium.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChromeBrowser {

	@Test
	public void launchChromeBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingpro.github.io/index.html");
		driver.quit();
	}
}
