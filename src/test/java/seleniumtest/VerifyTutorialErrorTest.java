package seleniumtest;

import static setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.Test;

import pageobjects.HomePage;
import pageobjects.TutorialPage;
import popups.LoginPopup;

public class VerifyTutorialErrorTest {
	@Test
	public void createNewTitleAndCheckErrorMessageTest() throws InterruptedException {
		LoginPopup loginPopup = new HomePage().open().goToLoginPopup();
		TutorialPage tutorialpage = loginPopup.login().goToTutorialPage();
		tutorialpage.createNewTitleWithoutPicture();
		tutorialpage.verifyPopupError();
	}
	
	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}
}
