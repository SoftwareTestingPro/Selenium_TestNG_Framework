package com.qa.Selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighlightElement {

	@Test
	public void TestChrome() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement InputField = driver.findElement(By.xpath("//textarea[@title='Search']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.border='2px solid orange'", InputField); 
		InputField.sendKeys("Hello");
		Thread.sleep(5000);
		driver.quit();
	}
}