package dsalgocucumber.stepDefinition;

import dsalgocucumber.baseclass.BaseClass;
import dsalgocucumber.pageObjects.USignOutPage;
import io.cucumber.java.en.*;

public class USignOutstep extends BaseClass {
	


	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
		signout= new USignOutPage(edriver);
		edriver.manage().window().maximize();
		signout.SignOut();
	}

	@Then("user should be able to see {string}")
	public void user_should_be_able_to_see(String string) {
	    signout.msgLoggedOut();
	}

}
