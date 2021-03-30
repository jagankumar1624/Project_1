package org.jaganHotel;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class jaganIsLoging  extends Baseclass{
	@BeforeClass
	public void beforeClass () {
		
		browserLanch();
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AterClass");
	}
	@BeforeMethod
	public void beforeMethod() {	
		System.out.println("Test strat....."+ new Date());
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("Test ends....."+ new Date());
		System.out.println("AfterMethod");
	}
	@Test
	private void test1() {
		System.out.println("Started");
		launchURL("https://www.facebook.com/");
		SoftAssert sf = new SoftAssert();
		
		Loginpage l =new Loginpage();
		fillTextBox(l.getUsername(), "8754417547");
		fillTextBox(l.getPassword(), "jaganshalini");
		ButtonClick(l.getClick());
		sf.assertAll();
	}
	

}
