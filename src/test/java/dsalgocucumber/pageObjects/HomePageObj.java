package dsalgocucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageObj {
	
private static final String string = null;
public WebDriver ldriver;
	
	public HomePageObj(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By dropButton= By.xpath("//a[@class='nav-link dropdown-toggle']");
	By selectDropMenu=By.linkText("Arrays");
    By regLink= By.linkText("Register");
	By signinLink=By.xpath("//a[text()='Sign in']");
	By msg= By.xpath("//div[@role='alert']");
	By arrayGetButton=By.xpath("//div[2]//a[text()='Get Started']");
	By datastruGetButton=By.xpath("//div[1]//a[text()='Get Started']");
	By signout=By.xpath("//a[text()='Sign out']");
	By getstartbutton=By.xpath("//a//button[@class='btn']");
	
	public void selectDrop() throws InterruptedException
	{
		
		 ldriver.findElement(dropButton).click();
	}
	

	public void selectDropMenu() throws InterruptedException
	{
		
		 ldriver.findElement(selectDropMenu).click();
	}
		 
	
	
	public void clickRegister()
	{
		ldriver.findElement(regLink).click();
		
	}
	
	public void clickSignIn()
	{
		ldriver.findElement(signinLink).click();
	}

	public void getMsg()
	{
		ldriver.findElement(msg).getText();
		
	}
  
	
	public void ClickArrayGetBtn()
	{
		ldriver.findElement(arrayGetButton).click();
		
	}
	
	public void Clicksignout()
	{
		ldriver.findElement(signout).click();
		
	}


	public void clickGetButton() {
		
		ldriver.findElement(getstartbutton).click();
	}
	
    public void clickdatastruGetButton() {
		
		ldriver.findElement(datastruGetButton).click();
	}
	
	}


	
	
	
		
		

	


