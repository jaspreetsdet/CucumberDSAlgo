package dsalgocucumber.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queueimplementationofpython {

	WebDriver driver;

	public Queueimplementationofpython(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'Implementation of Queue in Python')]")
	WebElement Queueinpython;

	@FindBy(xpath = "//a[@href=\"/tryEditor\"]")
	WebElement trybutton;

	public void validatepage() {

		Assert.assertTrue(Queueinpython.isDisplayed());

	}

	public void clicktrybutton() {

		trybutton.click();

	}

}
