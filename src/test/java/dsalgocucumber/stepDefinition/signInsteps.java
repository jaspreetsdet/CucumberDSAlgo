package dsalgocucumber.stepDefinition;

import java.util.List;

import dsalgocucumber.baseclass.BaseClass;
import dsalgocucumber.pageObjects.signInPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class signInsteps extends BaseClass {


	@When("^the user enter username as (.*)$")
	public void the_user_enter_username_as_username(String username) {
		sp = new signInPage(edriver);
		edriver.manage().window().maximize();
		sp.Uname(username);
	}

	@When("^password as (.*)")
	public void password_as_password(String password) {
		sp.pWord(password);
	}


	@When("click on login button")
	public void click_on_login_button() {
		sp.Submit();;
	}

	@SuppressWarnings("deprecation")
	@Then("It should display an error {string}")
	public void it_should_display_an_error_invalid_username_and_password(String string) {
		Assert.assertEquals(string, sp.errorAlert());
	}
	
	
	@When("^the user enter username as")
	public void the_user_enter_username_as(DataTable dataTable) {
		List<List<String>> data = dataTable.cells();
		sp.Uname(data.get(0).get(0));

	}

	@When("^password as")
	public void password_as(DataTable dataTable) {
		List<List<String>> data = dataTable.cells();
		sp.pWord(data.get(0).get(0));
	}

	@Then("user should be able to see error {string}")
	public void user_should_be_able_to_see_error(String string) {
		sp.fillOutMsg(string);
	}


	@Then("the user should be able to see {string} and username on the top righthand side")
	public void the_user_should_be_able_to_see_and_username_on_the_top_righthand_side(String string) {
		sp.alertMsg();

	}


}
