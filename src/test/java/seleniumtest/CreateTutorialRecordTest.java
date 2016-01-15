package seleniumtest;

import static setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.Test;

import pageobjects.HomePage;
import pageobjects.TutorialPage;
import popups.LoginPopup;


public class CreateTutorialRecordTest {
	
	@Test
	public void yahooLogin() throws InterruptedException {
		LoginPopup loginPopup = new HomePage().open().goToLoginPopup();
		loginPopup.login().goToTutorialPage();
	}
	
	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}
}
