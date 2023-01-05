package dsalgocucumber.stepDefinition;

import org.junit.Assert;

import dsalgocucumber.baseclass.BaseClass;
import dsalgocucumber.pageObjects.DsAlgoPage;
import io.cucumber.java.en.*;

public class DsAlgosteps extends BaseClass{
	
	@Given("The user enter url {string}")
	public void the_user_enter_url(String url) {
		da = new DsAlgoPage(edriver);
	    edriver .get(url);
	    edriver.manage().window().maximize();
	}

	@When("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() {
	   	  
	   System.out.println("I am in home page");
	
		}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	   da.getStarted();
	}

	@Then("The user should be in homepage")
	public void the_user_should_be_redirected_to_homepage() {
		 String actualTitle = edriver.getTitle();
	   
	    String expectedTitle = "NumpyNinja";
	    if(actualTitle.equalsIgnoreCase(expectedTitle))
	    	System.out.println("Title Matched");
	    else
	    	System.out.println("Title did not match");
	}
	
	@Then("The user should see {int} panels with different data structures")
	public void the_user_should_see_panels_with_different_data_structures(Integer int1) {
	    da.dataPanels();
	}

	@When("The user clicks {string} drop down")
	public void the_user_clicks_drop_down(String string) {
	    da.dropDown();
	}

	@Then("The user should see {int} different data structure entries in that dropdown")
	public void the_user_should_see_different_data_structure_entries_in_that_dropdown(Integer int1) {
	    da.ddSize();
	}

	@When("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) {
	    da.dataStruc();
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) {
	    Assert.assertEquals(string, da.alertMsg());
	}

	@When("The user selects any data structures item from the drop down without Sign in")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
	    da.dropDown();
		da.ddItem();
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
		
	    da.register();
	}

	
	@Then("The user should be in Register form")
	public void the_user_should_be_redirected_to_register_form() throws InterruptedException {
	   System.out.println("***Current URL: " + edriver.getCurrentUrl());
	   Thread.sleep(1000);
	}


}


