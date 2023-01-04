package dsalgocucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Linked_list {

	@FindBy(xpath = " //a[@href='linked-list']")
	WebElement LinkedlistStart;

	@FindBy(xpath = " //a[text()='Introduction']")
	WebElement Introduction;
	@FindBy(xpath = " //a[text()='Creating Linked LIst']")
	WebElement Creating_Linked_LIst;
	@FindBy(xpath = " //a[text()='Types of Linked List']")
	WebElement Types_of_LinkedList;
	@FindBy(xpath = " //a[text()='Implement Linked List in Python']")
	WebElement Implement_LinkedListinPython;
	@FindBy(xpath = " //a[text()='Traversal']")
	WebElement Traversal;
	@FindBy(xpath = " //a[text()='Insertion']")
	WebElement Insertion;
	@FindBy(xpath = " //a[text()='Deletion']")
	WebElement Deletion;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement Tryhere;

	protected WebDriver driver;

	public Linked_list(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LinkedlistStart() {
		LinkedlistStart.click();

	}

	public void Introduction() {
		Introduction.click();
		Tryhere.click();

	}

	public void Creating_Linked_LIst() {
		Creating_Linked_LIst.click();
		Tryhere.click();

	}

	public void Types_of_LinkedList() {
		Types_of_LinkedList.click();
		Tryhere.click();

	}

	public void Implement_LinkedListinPython() {
		Implement_LinkedListinPython.click();
		Tryhere.click();

	}

	public void Traversal() {
		Traversal.click();
		Tryhere.click();

	}

	public void Insertion() {
		Insertion.click();
		Tryhere.click();

	}

	public void Deletion() {
		Deletion.click();
		Tryhere.click();

	}
}
