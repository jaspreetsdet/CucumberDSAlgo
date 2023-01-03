package dsalgocucumber.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void setup() {
	// Do something before each scenario
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().window().maximize();
	}

}
