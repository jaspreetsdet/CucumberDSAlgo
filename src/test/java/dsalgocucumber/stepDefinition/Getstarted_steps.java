package dsalgocucumber.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dsalgocucumber.baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Getstarted_steps extends BaseClass{


	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {

		driver.get("https://dsportalapp.herokuapp.com");

	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {

		WebElement start = driver.findElement(By.linkText("Get Started"));
		start.click();

	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {

		String currentURL = driver.getCurrentUrl();

		Assert.assertEquals("https://dsportalapp.herokuapp.com/home", currentURL);

	}

	@Then("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() throws InterruptedException {

		Thread.sleep(2000);
		WebElement portalpg = driver.findElement(By.linkText("Preparing for the Interviews"));

		Assert.assertTrue(portalpg.isDisplayed());

	}

	
	

}
