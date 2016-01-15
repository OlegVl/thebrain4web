package seleniumtest;

import static setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.Test;

import pageobjects.HomePage;

public class RegistrationTest {
	
	@Test
	public void registerTest() {
	}

	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}

}
