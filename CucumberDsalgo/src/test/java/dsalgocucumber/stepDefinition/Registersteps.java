package dsalgocucumber.stepDefinition;

import org.openqa.selenium.WebDriver;
import dsalgocucumber.pageObjects.HomePage;
import dsalgocucumber.pageObjects.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registersteps  {
	
	WebDriver driver;
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page1() {

//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
//
//		WebElement reg = driver.findElement(By.xpath("//*[contains(text(),'Register')]"));
//		reg.click();
		
		
		HomePage hp = new HomePage(driver);
		hp.clicregister();

	}

	@When("The user enters correct credentials")
	public void the_user_opens_register_page() throws InterruptedException {

		String pass = "Abcd@123";
//		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("MyUserName1");
//		driver.findElement(By.xpath("//input[@name=\"password1\"]")).sendKeys(pass);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@name=\"password2\"]")).sendKeys(pass);
//
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.enterusername("MyUserName2");
		rp.enterpassword(pass);
		Thread.sleep(1000);
		rp.confirmpasword(pass);
		rp.clickregisterbutton();
		
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {

	}

}