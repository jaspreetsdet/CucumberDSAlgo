package dsalgocucumber.stepDefinition;

import org.junit.Assert;

import dsalgocucumber.baseclass.BaseClass;
import dsalgocucumber.pageObjects.RegisterPage;
import io.cucumber.java.en.*;


public class Registersteps_sreeja extends BaseClass {




	@Given("The user opens browser and enter url {string}")
	public void the_user_opens_browser_and_enter_url(String url) {
		rp = new RegisterPage(edriver);
		edriver.manage().window().maximize();
		edriver.get(url);
	}


	@When("^user type username as (.*)$")
	public void user_enter_username_as_username(String username) {
	    rp.rUName(username);
	}


	@When("^type password as (.*)$")
	public void password_as(String password) {

		rp.rPWord(password);
	}

	@When("^confirmpassword as (.*)$")
	public void confirmpassword_as_confirmpassword(String confirmpassword) {
	    rp.confirmPassword(confirmpassword);
	}

	@When("user click on register button")
	public void user_click_on_register_botton() throws InterruptedException {
		Thread.sleep(1000);
		rp.regSubmit();
	}

	@Then("user should be able to see message {string}")
	public void user_should_be_able_to_see_message(String string) {
		Assert.assertEquals(string, rp.alertMsg());

	}

	@When("user clicks on login instead link")
	public void user_clicks_on_login_instead_link() {
		rp.Login();
	}

	@Then("user should be redirected to login page")
	public void user_should_be_redirected_to_login_page() {

		System.out.println("****Current url is:  " + edriver.getCurrentUrl());
	}



}
