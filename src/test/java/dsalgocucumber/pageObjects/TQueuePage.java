package dsalgocucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TQueuePage {
	
	public WebDriver edriver;

	public TQueuePage(WebDriver edgedriver){

		edriver = edgedriver;
		PageFactory.initElements(edgedriver, this);
	}
	
	@FindBy(xpath = "//a[@href=\"queue\"]")
	WebElement btn_stackGetStarted;

	public void getStarted() {
		btn_stackGetStarted.click();
	}
	
	@FindBy(xpath = "//a[@href=\"implementation-lists\"]")
	WebElement link_implilist;
	
	public void click_implementationList() {
		link_implilist.click();
	}

}
