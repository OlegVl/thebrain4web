package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static setup.SeleniumDriver.getDriver;

public class WaitConditions {

	WebDriverWait wait = new WebDriverWait(getDriver(), 15);

	public void wait(WebElement locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) locator));
	}

}
