package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TutorialPage extends MainPage<TutorialPage>{

	public static final String TITLE_NAME = "Some text is here";
	private static final String RELEVANT_KEY = "Rock";
	private static final String COST = "10";
	private static final String HOURS = "10";
	private static final String MINUTES = "10";
	private static final String SECONDS = "10";
	private static final String STEP1_DESCRIPTION = "Some text";
	private static final String STEP2_DESCRIPTION = "Some text";
	private static final String STEP3_DESCRIPTION = "Some text";
	
	@FindBy(css = ".icon-camera-1")
	WebElement uploadPicture;
	
	@FindBy(name = "title")
	WebElement titleName;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement relevantKeywordsField;
	
	@FindBy(name = "cost")
	WebElement costField;
	
	@FindBy(name = "hours")
	WebElement hoursField;
	
	@FindBy(name = "minutes")
	WebElement minutesField;
	
	@FindBy(name = "seconds")
	WebElement secondsField;
	
	@FindBy(name = "step-1")
	WebElement step1;
	
	@FindBy(name = "step-2")
	WebElement step2;
	
	@FindBy(name = "step-3")
	WebElement step3;
	
	@FindBy(css = ".add-step")
	WebElement addStep;
	
	@FindBy(xpath = "//button[text()='Opslaan']")
	WebElement submitButton;
		
	public void uploadPicture(){
		uploadPicture.click();
		uploadPicture.sendKeys("C:'\'Users'\'Korsar'\'Desktop'\'1.png");
	}
	
	public void fillRelevantKeysField(){
		relevantKeywordsField.sendKeys(RELEVANT_KEY);
		relevantKeywordsField.sendKeys(Keys.ENTER);
	}
	
	public void fillCostField(){
		costField.sendKeys(COST);
	}
	
	public void fillDurationField(){
		hoursField.sendKeys(HOURS);
		minutesField.sendKeys(MINUTES);
		secondsField.sendKeys(SECONDS);
	}
	
	public void fillAndAddNextStep(){
		step1.sendKeys(STEP1_DESCRIPTION);
		addStep.click();
		step2.sendKeys(STEP2_DESCRIPTION);
		addStep.click();
		step3.sendKeys(STEP3_DESCRIPTION);
	}
		
	public void createNewTitle(){
		uploadPicture();
		titleName.sendKeys(TITLE_NAME);
		fillRelevantKeysField();
		fillCostField();
		fillDurationField();
		fillAndAddNextStep();
		submitButton.click();
	}
	
	@Override
	public String getPageUrl() {
		return "klusadvies/new";
	}

}
