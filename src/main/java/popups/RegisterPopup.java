package popups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageobjects.MainPage;


public class RegisterPopup extends MainPage<RegisterPopup>{
	
	@FindBy(name = "login")
	WebElement loginField;
	
	@FindBy(name = "first_name")
	WebElement firstName;
	
	@FindBy(name = "last_name")
	WebElement lastName;
	
	@FindBy(name = "email")
	WebElement emailField;
	
	@FindBy(name = "password")
	WebElement passField;
	
	@FindBy(name = "password_confirmation")
	WebElement passConfirmField;

	
	
	@Override
	public String getPageUrl() {
		return "";
	}
}
