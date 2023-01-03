package dsalgocucumber.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Implementationusingcollections_dqueue {

	WebDriver driver;

	public Implementationusingcollections_dqueue(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Implementation using collections.deque")
	WebElement implementationcollections;

	@FindBy(xpath = "//a[@class =\"btn btn-info\"])")
	WebElement tryherebutton;

	public void validateImplementationCollectionPage() {

		Assert.assertTrue(implementationcollections.isDisplayed());

	}

	public void tryherebutton() {
		tryherebutton.click();

	}

}