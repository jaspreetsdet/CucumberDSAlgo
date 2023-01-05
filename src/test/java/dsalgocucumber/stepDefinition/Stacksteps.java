package dsalgocucumber.stepDefinition;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import dsalgocucumber.baseclass.BaseClass;
import dsalgocucumber.pageObjects.StackPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;

public class Stacksteps extends BaseClass {

	@Given("user should be in homepage logged in url {string}")
	public void user_should_be_in_homepage_logged_in_url(String string) {
		stack = new StackPage(edriver);
		edriver.manage().window().maximize();
		
	}

	@When("user clicks on {string} button under stack")
	public void user_clicks_on_button_under_stack(String string) {
	    stack.getStarted();
	}

	@Then("user should be in stack page")
	public void user_should_be_in_stack_page() {
	   System.out.println("****The title of the page is: " + edriver.getTitle());
	}

	@When("user clicks on the link {string}")
	public void user_clicks_on(String string) {
		
	    edriver.findElement(By.partialLinkText(string)).click();;
	    
	    	}
	
	@Then("user able to navigate back")
	public void user_able_to_navigate_back() {
	    edriver.navigate().back();
	}
	
	@Then("user should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String string) {
		if (edriver.getPageSource().contains(string)) {
		System.out.println("****YOU ARE IN RIGHT PAGE*****" );
	}
		else {
			System.out.println("****ATTENTION: YOU ARE IN WRONG PAGE****");
		}
	
	}	
	
	@Then("user should be able to navigate back")
	public void user_should_be_able_to_navigate_back() throws InterruptedException {
	    edriver.navigate().back();
	    Thread.sleep(1000);
	}
	
	@When("user clicks Practice Questions")
	public void user_clicks() {
	    stack.Questions();
	}


	@Then("user should be able to see {string} button")
	public void user_should_be_able_to_see_button(String string) {
		stack.tryTxt();
					
	}

	@When("user clicks on {string} button")
	public void user_clicks_on_button(String string) throws InterruptedException { 
		
	    stack.tryHere();
	    System.out.println("*******$$$$ I am clicking text editor*****");
	}

	@Then("user should be able to see text box")
	public void user_should_be_able_to_see_text_box() {
		System.out.println("***Current url is:  " + edriver.getCurrentUrl());
	}
	
////	@When("user gives input print\\({string})")
////	public void user_gives_input_print(String string) throws InterruptedException {
	//((JavascriptExecutor)edriver).executeScript("arguments[0].scrollIntoView(true);", string);
////		System.out.println("*******$$$$ I am typing text editor*****");
//////		JavascriptExecutor jse = (JavascriptExecutor) edriver;
//////		jse.executeScript("arguments[0].click()");
////		stack.enterPyCode(string);
////	    System.out.println("*******$$$$ I am typed text editor*****");
////	    Thread.sleep(1000);
////	}
//	
	@When("^user gives input as pycode")
	public void user_gives_input_as_pycode(DataTable pycode){
				
		List<List<String>> data = pycode.cells();
		stack.enterPyCode(data.get(0).get(0));
		
	    
	}


	@When("hit run")
	public void hit_run() throws InterruptedException {
	    stack.Run();
	    Thread.sleep(1000);
	}

	@Then("user should be able to see that in the output")
	public void user_should_be_able_to_see_that_in_the_output() {
	    stack.OutPut();
	    Allure.addAttachment("Python Output", new ByteArrayInputStream(((TakesScreenshot)edriver).getScreenshotAs(OutputType.BYTES)));
	    
	}
	
	@Then("user should be able to navigate back to home page")
	public void user_able_to_navigate_back_to_home_page() {
		JavascriptExecutor jse = (JavascriptExecutor)edriver;
	     jse.executeScript("window.history.go(-5)");
	}
  }
