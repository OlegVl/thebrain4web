package popups;

import static org.junit.Assert.assertEquals;
import static setup.SeleniumDriver.getDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.HomePage;
import pageobjects.MainPage;

public class LoginPopup extends MainPage<LoginPopup>{
	
	private static final String EMAIL = "demotest.y@yandex.ru";
	private static final String PASSWORD = "qweqwe";
	
//	WebDriverWait wait = new WebDriverWait(getDriver(), 40);
//	WebElement element = wait.until(ExpectedConditions.);
	
	@FindBy(name = "email")
	WebElement emailField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@value='Inloggen']")
	WebElement loginButton;
		
	@FindBy(name = "remember")
	WebElement rememberCheckbox;
	
	@FindBy(xpath = ".//*[@href='/registeren']")
	WebElement registerLink;
	
	@Override
	public String getPageUrl() {
		return "inloggen";
	}
	
	public HomePage login() throws InterruptedException{
		emailField.sendKeys(EMAIL);
		passwordField.sendKeys(PASSWORD);
		loginButton.click();
		
//		Thread.sleep(1000);
		return new HomePage();
	}
	
}
