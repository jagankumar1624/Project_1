package org.jaganHotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage  extends Baseclass{
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath= "//input[@id='email']")    WebElement username;
@FindBy(xpath= "//input[@id='pass']")  WebElement password;
@FindBy(xpath= "//button[@name='login']")  WebElement Click;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getClick() {
	return Click;
}
	
	
}
 