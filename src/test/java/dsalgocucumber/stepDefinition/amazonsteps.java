package dsalgocucumber.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonsteps {

	WebDriver driver;

	@Given("amazon is open")
	public void amazon_is_open() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println(" Open amazon.com");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

	}

	@When("i click on amazon basics")
	public void i_click_on_amazon_basics() {
		
		WebElement basic = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_amazonbasics']"));
		basic.click();
		
		
	}

	@Then("amzon basic page should open")
	public void amzon_basic_page_should_open() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(" amazon basics is opened");

		
		WebElement basicIsDisplayed = driver.findElement(By.linkText("Amazon Basics"));
		System.out.println(basicIsDisplayed.isDisplayed());
		Assert.assertTrue(basicIsDisplayed.isDisplayed());
		
	}

}
