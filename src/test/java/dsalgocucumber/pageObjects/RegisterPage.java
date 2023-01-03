package dsalgocucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password1")
	WebElement password;

	@FindBy(xpath = "//input[@name='password2']\n")
	WebElement confirmpasword;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement registerbutton;

	@FindBy(linkText = "Sign in")
	WebElement signInButton;


	public void enterusername(String name) {
		username.sendKeys(name);
	}

	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}

	public void confirmpasword(String pass) {
		confirmpasword.sendKeys(pass);

	}

	public void clickregisterbutton() {

		registerbutton.click();

	}

	public void clickSignIn() {
		// TODO Auto-generated method stub
		signInButton.click();
		
	}

}
