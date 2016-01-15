package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import popups.LoginPopup;

public class HomePage extends MainPage<HomePage>{

	public HomePage open() {
		return new HomePage().openPage(HomePage.class);
	}
	
	public LoginPopup goToLoginPopup() {
		return new LoginPopup().openPage(LoginPopup.class);
	}
	
	public TutorialPage goToTutorialPage() {
		return new TutorialPage().openPage(TutorialPage.class);
	}

	@Override
	public String getPageUrl() {
		return "";
	}
	
}
