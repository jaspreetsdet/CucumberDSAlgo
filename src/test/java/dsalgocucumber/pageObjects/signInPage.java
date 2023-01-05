package dsalgocucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage {

	public WebDriver edriver;

	public signInPage(WebDriver edgedriver){

		edriver = edgedriver;
		
		PageFactory.initElements(edgedriver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement txtUname;

	public void Uname(String username) {

		txtUname.sendKeys(username);
	}

	@FindBy(xpath = "//input[@name=\"password\"]" )
	WebElement txtpWord;

	public void pWord(String password) {
		txtpWord.sendKeys(password);
	}

	@FindBy(xpath = "//input[@type=\"submit\"]" )
	WebElement btnSubmit;

	public void Submit() {
		btnSubmit.click();
	}
	@FindBy(xpath = "//div[@role=\"alert\"]")
	WebElement txtError;
	public String errorAlert() {
	     System.out.println("***The error Message is: " + txtError.getText()+"***");
	     return txtError.getText();
	}
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement pmsg;
	@FindBy(xpath = "//input[@id=\"id_username\"]")
	WebElement umsg;

	public void fillOutMsg(String txt) {

		System.out.println("****Message shown: "+ pmsg.getAttribute("ValidationMessage"));
		//System.out.println("*****Message shown:  " + umsg.getAttribute("ValidationMessage"));
	}

	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]" )
	WebElement txtMsg;

	@FindBy(xpath = "//a[@href=\"\"]")
	WebElement txtName;
	public void alertMsg() {
		System.out.println("****The message displayed is: " +txtMsg.getText()+ "****");
		System.out.println("****The name displayed is: " +txtName.getText()+ "****");
	}
	
	
}
