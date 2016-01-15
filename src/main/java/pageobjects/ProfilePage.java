package pageobjects;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.TutorialPage;
import static setup.SeleniumDriver.getDriver;

public class ProfilePage extends MainPage<ProfilePage> {

	@FindBy(xpath = "//a[@href='#mijn-klussen']")
	WebElement myTutorials;

	public void openMyTutorials() {
		myTutorials.click();
	}

	public void verifyCreatedTutorial() {
		assertTrue(isTextPresent(TutorialPage.TITLE_NAME));
	}

	protected boolean isTextPresent(String text) {
		try {
			boolean b = getDriver().getPageSource().contains(text);
			return b;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String getPageUrl() {
		return "profiel/xyz";
	}

}
