package pageobjects;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static setup.SeleniumDriver.getDriver;

public class ProfilePage extends MainPage<ProfilePage> {

	@FindBy(xpath = "//a[@href='#mijn-klussen']")
	WebElement myTutorials;

	public ProfilePage openMyTutorials() {
		myTutorials.click();
		return new ProfilePage();
	}

	public void verifyCreatedTutorial() {
		assertTrue(isTextPresent("Some text is here"));
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
