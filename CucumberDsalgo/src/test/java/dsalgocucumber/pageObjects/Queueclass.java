package dsalgocucumber.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queueclass {

	WebDriver driver;

	public Queueclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Implementation of Queue in Python")
	WebElement queueinpython;

	public void clickQueueinPython() {

		queueinpython.click();

	}

	@FindBy(xpath = "//a[@href='implementation-collections']")
	WebElement implementaioncollections;

	public void clickimplementationcollections() throws InterruptedException {

		implementaioncollections.click();

	}

	@FindBy(xpath = "//a[@href='Implementation-array']")
	WebElement implementationarray;

	public void clickImplementationofarraypage() throws InterruptedException {
		Thread.sleep(2000);

		implementationarray.click();

	}

	@FindBy(xpath = "//a[@href=\"QueueOp\"]")
	WebElement Queueoperations;

	public void clickQueueoperations() {

		Queueoperations.click();

	}
	
	
	
	@FindBy(xpath="//a[contains(text(),\"Practice Questions\")]")
	
	WebElement PracticeQuestions;
	public void clickPracticeQuestions() {
		PracticeQuestions.click();
		
		
		
		
	}
	
}
	
	