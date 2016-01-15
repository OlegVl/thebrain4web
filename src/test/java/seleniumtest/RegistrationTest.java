package seleniumtest;

import static setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.Test;

import pageobjects.HomePage;

public class RegistrationTest {
	@Test
	public void yahooLogin() {

	}
	
	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}

}
