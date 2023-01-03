package dsalgocucumber.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tryandrun {

	WebDriver driver;

	public Tryandrun(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"/tryEditor\"]")
	WebElement trybutton;

	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement runbutton;

	@FindBy(className = "CodeMirror-scroll")
	WebElement tryeditor;

	public void clicktrybutton() {

		trybutton.click();

	}

	public void validatetryeditor() {

		Assert.assertTrue(tryeditor.isDisplayed());

	}
public void validaterunbutton() {
	
	Assert.assertTrue(runbutton.isDisplayed());

	
	
	
	
}
	
	
	
	
	
	
}
