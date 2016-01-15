package seleniumtest;

import static setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.Test;

import pageobjects.HomePage;
import pageobjects.ProfilePage;
import pageobjects.TutorialPage;
import popups.LoginPopup;

public class VerifyNewTutorialRecords {

	@Test
	public void verifyNewTitleTest() throws InterruptedException {
		LoginPopup loginPopup = new HomePage().open().goToLoginPopup();
		ProfilePage profilelPage = loginPopup.login().goToProfilePage();
		profilelPage.openMyTutorials();
	}
	

	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}
	
}
