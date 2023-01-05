package dsalgocucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USignOutPage {
	
	public WebDriver edriver;

	public USignOutPage(WebDriver edgedriver){

		edriver = edgedriver;
		
		PageFactory.initElements(edgedriver, this);
	}

	
	@FindBy(xpath = "//a[@href=\"/logout\"]")
	WebElement btn_logout;
	
	public void SignOut() {
		btn_logout.click();
	}
	
	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]")
	WebElement txt_loggedout;
	
	public String msgLoggedOut() {
		String msg = txt_loggedout.getText();
		System.out.println("**** LoggedOut msg is: " + msg);
		return msg;
	}
}
