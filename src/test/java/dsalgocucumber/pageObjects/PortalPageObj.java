package dsalgocucumber.pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PortalPageObj {
	
public WebDriver ldriver;
	
	public PortalPageObj(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By txtTitle= By.xpath("//div//h1");
	By txtTitle2= By.xpath("//div//p");
	By button= By.xpath("//button[text()='Get Started']");
	By pageTitle=By.xpath("//div//a[text()='NumpyNinja']");
	
	public void checkTexts()
	{
		 String s=ldriver.findElement(txtTitle).getText();
		 System.out.println(s);
		 String s1=ldriver.findElement(txtTitle2).getText();
		 System.out.println(s1);

	}
	
	public void clickButton()
	{
		ldriver.findElement(button).click();
	}
	
	public void CheckHomePageTitle()
	{
		ldriver.findElement(pageTitle);
	}
		

}



