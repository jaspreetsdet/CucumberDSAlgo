package dsalgocucumber.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Implementationofarraypage {
	WebDriver driver;

	public Implementationofarraypage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),\"Implementation using array\")]")
	WebElement Implementationarray;

	public void validatepage() {

		Implementationarray.isDisplayed();
		Assert.assertTrue(Implementationarray.isDisplayed());

	}

	@FindBy(xpath = "//a[@href=\"/tryEditor\"]")
	WebElement Trybutton;

	public void clicktrybutton() {

		Trybutton.click();

	}

}