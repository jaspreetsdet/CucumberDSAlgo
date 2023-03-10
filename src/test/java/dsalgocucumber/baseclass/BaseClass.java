package dsalgocucumber.baseclass;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dsalgocucumber.pageObjects.DsAlgoPage;
import dsalgocucumber.pageObjects.Graph;
import dsalgocucumber.pageObjects.LinkedListPage;
import dsalgocucumber.pageObjects.RegisterPage;
import dsalgocucumber.pageObjects.StackPage;
import dsalgocucumber.pageObjects.TQueuePage;
import dsalgocucumber.pageObjects.USignOutPage;
import dsalgocucumber.pageObjects.signInPage;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static DsAlgoPage da;
	public static RegisterPage rp;
	public static signInPage sp;
	public static WebDriver edriver;
	public static StackPage stack;
	public static TQueuePage queue;
	public static USignOutPage signout;
	public static Graph graph;
	public static LinkedListPage LL;
	public static Logger log;
	static {
		edriver = DriverManager.getDriver();
	}
	
	public BaseClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
