package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TutorialPage extends MainPage<TutorialPage>{

	@FindBy(name = "title")
	WebElement titleName;
	
	public void createNewTitle(){
		titleName.sendKeys("some text");
	}
		
	@Override
	public String getPageUrl() {
		return "klusadvies/new";
	}

}
