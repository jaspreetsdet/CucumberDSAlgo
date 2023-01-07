package dsalgocucumber.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import dsalgocucumber.pageObjects.HomePage;
import dsalgocucumber.pageObjects.RegisterPage;
import dsalgocucumber.pageObjects.Signin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtilities {
	
//	static WebDriver driver;

//	public static  WebDriver setup() {
//
//		WebDriverManager.chromedriver().setup();
//      WebDriver   driver=new ChromeDriver();
//        driver.get("https://dsportalapp.herokuapp.com/home");
//		driver.manage().window().maximize();
//		return driver;
//
//	}

	public static void signIn(WebDriver driver) {

		HomePage hp = new HomePage(driver); 
		hp.clicregister();
		RegisterPage rp = new RegisterPage(driver);
		rp.enterusername("MyUserName2");
		rp.enterpassword("Abcd@123");
		rp.confirmpasword("Abcd@123");
		rp.clickregisterbutton();
		rp.clickSignIn();
		Signin si = new Signin(driver);

		si.enterusername("MyUserName2");
		si.enetrpassword("Abcd@123");
		si.clicklogin();
		hp.clickgetstarted();

	}

}
