package com.examly.springapp;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;

public class SpringApplicationTests {

    ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	}

	@Test
	public void flipkart() throws InterruptedException 
   {      
	   driver.navigate().to("https://www.flipkart.com/");	
        driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']")).click();
		WebElement mobile = driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input"));
		mobile.sendKeys("6301907683");
		driver.findElement(By.xpath("//div[@class='_1k3JO2']/button")).click();
	}

		
	@AfterTest
	public void afterTest() {
		driver.quit();
	}


}