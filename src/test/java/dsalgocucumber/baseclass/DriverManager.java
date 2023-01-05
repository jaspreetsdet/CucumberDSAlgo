package dsalgocucumber.baseclass;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;

public class DriverManager {
	
	public static WebDriver edriver_init;
	
	@BeforeAll
	public static void beforeAll() {
		
		WebDriverManager.edgedriver().setup();
		edriver_init = new EdgeDriver();
		
	}
	
	public static WebDriver getDriver() {
		return edriver_init;
	}
	
	@AfterAll
	public static void afterAll() {
		edriver_init.quit();
	}
	
	@After
	public void TearDown(Scenario scenario) {
		if(scenario.isFailed()) {
		byte[] screenshot = ((TakesScreenshot)edriver_init).getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Failed ScreenShot", new ByteArrayInputStream(screenshot));
	}
	}
}