package dsalgocucumber.pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ArraysPageObj {
	public WebDriver ldriver;
			
    public ArraysPageObj(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
			}

			
			By arraytopicsloop= By.xpath("//div//ul//a[@class='list-group-item']");
			By practiceQuestions=By.xpath("//a[text()='Practice Questions']");
			By PracticeQuestionsLink=By.xpath("//a[@class='list-group-item']");
			By tryHereBtn=By.xpath("/html/body/div[2]/div/div[2]/a");
			By searchthearray= By.xpath("//a[text()='Search the array']");
			By macconsecutive= By.xpath("//a[text()='Max Consecutive Ones']");
			By findnowithevennumbers= By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
			By squaresofsortedarray= By.xpath("//a[text()='Squares of  a Sorted Array']");
			

           public void clickpracticeQuestions()
			{
				
				 ldriver.findElement(practiceQuestions).click();
				 //ldriver.navigate().back();
				
			}
			public void clicktryHereBtn() throws InterruptedException
			{
				
				 ldriver.findElement(tryHereBtn).click();
				 Thread.sleep(2000);
				 ldriver.navigate().back();
				
			}
			
			public void clickpracticeQuestionforcheck() throws InterruptedException
			{
				
				 ldriver.findElement(practiceQuestions).click();
				 Thread.sleep(2000);
			}
			
			
			public void clickarraytopicsloop(String string) throws InterruptedException
			{
				List<WebElement> topics=ldriver.findElements(arraytopicsloop);
				
				int li=topics.size();
				
				 for(int i=0;i<topics.size();i++)
			    {
				  
				  topics.get(i).click();
				  Thread.sleep(2000);
				  ldriver.findElement(tryHereBtn).click();
		          ldriver.navigate().back();
		          Thread.sleep(2000);
				  ldriver.findElement(practiceQuestions).click();
				  Thread.sleep(2000);
				  ldriver.findElement(searchthearray).click();
				  ldriver.navigate().back();
				  Thread.sleep(2000);
				  ldriver.findElement(macconsecutive).click();
				  ldriver.navigate().back();
				  Thread.sleep(2000);
				  ldriver.findElement(findnowithevennumbers).click();
				  ldriver.navigate().back();
				  Thread.sleep(2000);
				  ldriver.findElement(squaresofsortedarray).click();
				  ldriver.navigate().back();
				  Thread.sleep(2000);
				  ldriver.navigate().back();
				  ldriver.navigate().back();
                  topics=ldriver.findElements(arraytopicsloop);
			    }
				 
				  
 }
			}
			
			

				
			


                 
                  
                  
                  
				  
			    
			
			
			
			
			
			
			
			
			


