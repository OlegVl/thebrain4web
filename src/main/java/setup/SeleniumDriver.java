package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Selenium driver
 *
 * @author OlegVl
 */
public class SeleniumDriver {

	static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
