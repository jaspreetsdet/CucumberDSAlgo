package dsalgocucumber.stepDefinition;

import dsalgocucumber.baseclass.BaseClass;
import io.cucumber.java.After;

public class Hooks extends BaseClass {
	
	

	
	@After
	public static void closeBrowser() {
		driver.close();
	}
	

}
