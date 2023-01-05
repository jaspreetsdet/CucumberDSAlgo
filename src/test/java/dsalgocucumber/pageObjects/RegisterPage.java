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
	
	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]")
	WebElement textMsg;
	public String alertMsg() {
	System.out.println("**** Alert msg is : " +textMsg.getText()+ "****");
	return textMsg.getText();
	}
	
	@FindBy(xpath = "//div/a[@href =\"/login\"]")
	WebElement link_login;
	
	public void Login() {
		link_login.click();
	}
	
	
	@FindBy(xpath= "//input[@id=\"id_username\"]")
	WebElement inputUName;
	public void rUName(String username) {
		inputUName.sendKeys(username);
		
	}
	
	@FindBy(xpath = "//input[@value=\"Register\"]")
	WebElement regBtn;
	public void regSubmit() {
		regBtn.click();
	}
	
	@FindBy(xpath = "//input[@id=\"id_password1\"]")
	WebElement inputPW;
	public void rPWord(String password) {
		inputPW.sendKeys(password);
	}
	
	@FindBy(xpath = "//input[@id=\"id_password2\"]")
	WebElement inputConfirmPW;
	public void confirmPassword(String confirmpassword) {
		inputConfirmPW.sendKeys(confirmpassword);
	}
	

	

}
