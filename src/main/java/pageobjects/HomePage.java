package pageobjects;

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
	
	public ProfilePage goToProfilePage () {
		return new ProfilePage ().openPage(ProfilePage .class);
	}

	@Override
	public String getPageUrl() {
		return "";
	}
	
}
