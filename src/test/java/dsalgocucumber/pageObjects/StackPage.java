package dsalgocucumber.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {

	public WebDriver edriver;

	public StackPage(WebDriver edgedriver){

		edriver = edgedriver;
		PageFactory.initElements(edgedriver, this);
	}


	@FindBy(xpath = "//a[@href=\"stack\"]")
	WebElement btn_stackGetStarted;

	public void getStarted() {
		btn_stackGetStarted.click();
	}



	@FindBy(xpath = "//a[@href = \"/tryEditor\"]")
	WebElement link_tryHere;

	public void tryTxt() {
		
	 link_tryHere.isDisplayed();
	   		
	}

	public void tryHere() {
		
		((JavascriptExecutor)edriver).executeScript("arguments[0].scrollIntoView(true);", link_tryHere);
		link_tryHere.click();
	}

	@FindBy(xpath = "//form[@id = 'answer_form']/div/div/div[1]/textarea")
	WebElement input_box;

	public void enterPyCode(String code) {
		input_box.isEnabled();{
			if(true) {
				System.out.println( "******INPUT BOX enabled");
			}
		}
	    input_box.sendKeys(code);
	}

	@FindBy(xpath = "//button")
	WebElement btn_run;

	public void Run() {
		btn_run.click();
	}

	@FindBy(xpath = "//div[@align=\"left\"]")
	WebElement txt_output;

	public void OutPut() {
		txt_output.isDisplayed();
		if(true) {
		System.out.println("*****The out put message is:  "+ txt_output.getText());
	}
	}

	@FindBy(xpath = "//a[@class=\"list-group-item list-group-item-light text-info\"]")
	WebElement link_questions;

	public void Questions() {
		link_questions.click();
	}


}
