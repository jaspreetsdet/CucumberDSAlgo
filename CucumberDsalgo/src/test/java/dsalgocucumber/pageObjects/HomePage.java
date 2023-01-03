package dsalgocucumber.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(linkText = "Register")
	WebElement register;

	@FindBy(linkText = "Sign out")
	WebElement signOut;

	@FindBy(linkText = "You are logged in")
	WebElement loggedInMessage;

	@FindBy(xpath="//a[@href='array']")
	WebElement arraypage;

	@FindBy(linkText = "Sign in")
	WebElement signInButton;

	@FindBy(xpath="//a[@href=\"queue\"]")
	WebElement queue;
	
	public void clicregister() {
		register.click();
	}

	public void isUserSignedIn() throws InterruptedException {
		Assert.assertTrue(signOut.isDisplayed());
		Thread.sleep(5000);
		Assert.assertTrue(loggedInMessage.isDisplayed());

	}
	
	public void signOutUser() throws InterruptedException {
		signOut.click();

	}

	public void clickarray() {
		arraypage.click();
	}
	
	public void clickLogin() {
		// TODO Auto-generated method stub
		signInButton.click();
		
	}
	
	public void clickgetstarted() {
		queue.click();
		
		
	}
	
	
	

}




