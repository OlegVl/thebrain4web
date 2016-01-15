package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import static setup.SeleniumDriver.getDriver;

public abstract class MainPage<T> {

	private static final String BASE_URL = "http://maak.staging.thebrain4web.com/";
	private static final int IMPLICITLY_TIMEOUT = 10;
	
	public T openPage(Class<T> clazz) {
		T page = PageFactory.initElements(getDriver(), clazz);
		getDriver().get(BASE_URL + getPageUrl());
		getDriver().manage().timeouts().implicitlyWait(IMPLICITLY_TIMEOUT, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		return page;
	}
	   
	public abstract String getPageUrl();
}

