package dsalgocucumber.pageObjects;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DataStructurePage {
	
	public WebDriver ldriver;

    public DataStructurePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	By timeComplexity= By.xpath("//ul//a[@class='list-group-item']");
	By tryhere=By.xpath("//a[text()='Try here>>>']");
	By PracticeQuestLink=By.xpath("//a[text()='Practice Questions']");
	
    public void clicktimeComplexity() throws InterruptedException
		{
			
			 ldriver.findElement(timeComplexity).click();
			 Thread.sleep(2000);
			 //ldriver.navigate().back();
		}
    
    public void clicktryHere() throws InterruptedException
	{
		
		 ldriver.findElement(tryhere).click();
		 Thread.sleep(2000);
		 ldriver.navigate().back();
		
	}
    
    public void clickPracticeQuestLink() throws InterruptedException
   	{
    	
         ldriver.findElement(PracticeQuestLink).click();
         
     		if (ldriver.getPageSource().contains("Questions")) {
     			System.out.println(" Title Found" );
     		}else
     		{
     			System.out.println(" Title Not Found" );
     		}
     		
         ldriver.navigate().back();
       
        
         
   		
   	}

	
}


