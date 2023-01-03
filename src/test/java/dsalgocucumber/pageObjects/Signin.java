package dsalgocucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {

	

	WebDriver driver;

	public Signin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	
	WebElement password;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	
	WebElement loginbutton;
	
	public void enterusername(String name) {
		
		username.sendKeys(name);
		
		
	}
	
	
	public void enetrpassword(String pass) {
	
	password.sendKeys(pass);
	
}
	
	public void clicklogin() {
	
	loginbutton.click();
	
	
	}
}