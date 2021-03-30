package org.jaganHotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
static	WebDriver driver;
static WebElement element;
	public void browserLanch() {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void launchURL(String URL) {
		driver.get(URL);

	}
	public void fillTextBox(WebElement e, String value) {
		e.sendKeys(value);			

	}
	public void ButtonClick(WebElement e) {
		e.click();
		

	}

}
