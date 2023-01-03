package dsalgocucumber.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queueoperations {
	

	WebDriver driver;

	public Queueoperations(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(text(),\"Queue Operations\")]")
	WebElement queueoperations;
	
	public void validatequeueoperations() {
		Assert.assertTrue(queueoperations.isDisplayed());

		
		
	}

}
