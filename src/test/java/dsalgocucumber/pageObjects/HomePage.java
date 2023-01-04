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

	@FindBy(xpath = "//a[@href='array']")
	WebElement arraypage;

	@FindBy(linkText = "Sign in")
	WebElement signInButton;

	@FindBy(xpath = "//a[@href=\"queue\"]")
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

	@FindBy(xpath = "//button[@class='btn']")
	WebElement getStart;
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement existuser;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement existpassword;
	@FindBy(xpath = "//a[text()='Sign in']")
	WebElement signin;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;

	public void getStart() {
		getStart.click();

	}

	public void signin() {
		signin.click();
	}

	public void existUser() {
		existuser.sendKeys("Ghirija");
		existpassword.sendKeys("algo1234");
	}

	public void login() {
		login.click();
	}

}
