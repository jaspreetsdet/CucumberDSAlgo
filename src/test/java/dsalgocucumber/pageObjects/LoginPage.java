package dsalgocucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By usertxt= By.name("username");
	By passwordtxt= By.name("password");
	By loginBtn= By.xpath("//input[@type='submit']");
	
	
	public void txtusername(String name)
	{
		ldriver.findElement(usertxt).sendKeys(name);
	}
	
	public void txtpassword(String password)
	{
		
		ldriver.findElement(passwordtxt).sendKeys(password);
	}
	
	public void clickloginbtn()
	{
		ldriver.findElement(loginBtn).click();
	}


}
