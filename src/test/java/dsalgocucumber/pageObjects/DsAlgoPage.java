package dsalgocucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoPage{

	public WebDriver edriver;

	public DsAlgoPage(WebDriver edgedriver){

		edriver = edgedriver;
		PageFactory.initElements(edgedriver, this);
	}

	@FindBy(xpath = "//button[@class =\"btn\"]")
	WebElement btnStart;

	public void getStarted() {
		btnStart.click();
	}
	public void dataPanels() {
		int typesOfDatastruc = edriver.findElements(By.xpath("//div[@class=\"col\"]")).size();
		for (int i=1; i<=typesOfDatastruc; i++ ) {
			String dataName = edriver.findElement(By.xpath("//div[@class =\"col\"]["+i+"]")).getText();
			System.out.println("/////DATA STRUCTURE NAME: //////%%%% " + dataName +" %%%//////");
		}
	}


	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	WebElement dDown;

	public void dropDown() {
		dDown.click();
	}

	public void ddSize() {

		int ddMenuSize = edriver.findElements(By.xpath("//a[@class=\"dropdown-item\"]")).size();
		for (int i=1; i<=ddMenuSize; i++ ) {
			String itemName = edriver.findElement(By.xpath("//a[@class=\"dropdown-item\"]["+i+ "]")).getText();
			System.out.println("*******DATA STRUCTURE NAME: ********$$$ " + itemName + "$$$");
		}
	}

	

	@FindBy(xpath = "//a[@href = \"data-structures-introduction\"]")
	WebElement btnDataStruc;

	public void dataStruc() {
		btnDataStruc.click();
	}

	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]")
	WebElement txtMsg;

	public String alertMsg() {
		return txtMsg.getText();
	}

	@FindBy(xpath = "//a[@class=\"dropdown-item\"][text() =\"Arrays\"]")
	WebElement ddMenuItem;

	public void ddItem() {
		ddMenuItem.click();
	}

	
	@FindBy(xpath = "//a[@href=\"/register\"]")
	WebElement linkRegister;

	public void register() {
		linkRegister.click();
	}
}
