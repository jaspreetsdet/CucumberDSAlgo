package dsalgocucumber.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dsalgocucumber.pageObjects.ArraysPageObj;
import dsalgocucumber.pageObjects.DataStructurePage;
import dsalgocucumber.pageObjects.HomePageObj;
import dsalgocucumber.pageObjects.LoginPage;
import dsalgocucumber.pageObjects.PortalPageObj;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DS_AlgoStepDefinitions {
	
	public WebDriver driver;
	public PortalPageObj pp;
	public HomePageObj hp;
	public LoginPage lp;
	public ArraysPageObj app;
	public DataStructurePage ds;
	
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    pp= new PortalPageObj(driver);
	    lp=new LoginPage(driver);
	    app=new ArraysPageObj(driver);
	    hp=new HomePageObj(driver);
	    ds=new DataStructurePage(driver);
	    
	}

	@When("The User enter the url {string}")
	public void the_user_enter_the_url(String url) throws InterruptedException {
		
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}


	@Then("User sees the Text message and {string} button")
	public void user_sees_the_text_message_and_button(String string) {
	    System.out.println("User can see messages");
	}
	

	@When("The User clicks {string} button")
	public void the_user_clicks_button(String string) throws InterruptedException {
	    pp.clickButton();
	    Thread.sleep(2000);
	}


	@When("User clicks Signin button")
	public void user_clicks_signin_button() {
	    
		hp.clickSignIn();
	}


	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) throws InterruptedException {
	    
		lp.txtusername(string);
		Thread.sleep(2000);
	    lp.txtpassword(string2);
	}
	
	
	    
	@When("clicks {string} button")
	public void clicks_button(String string) throws InterruptedException {
	   lp.clickloginbtn();
	   Thread.sleep(2000);
	}
	
	@Then("The user should successfully logged in to the HomePage")
	public void the_user_should_successfully_logged_in_to_the_home_page() {
		
	   System.out.println("User logged into the HomePage");
	}


	
	
	
	@When("The User clicks the {string} button On Arrays")
    public void the_user_clicks_the_button_on_arrays(String string) throws InterruptedException {
		
		hp.ClickArrayGetBtn();
    
    }

	@Then("The user should be redirected to Arrays Page")
	public void the_user_should_be_redirected_to_arrays_page() {
	   
		 System.out.println("User navigated to Arrays Page");
	}
	
	//ArraysLinks Steps

	@When("The user clicking {string} link")
	public void the_user_clicking_link(String string) throws InterruptedException {
	   
		app.clickarraytopicsloop(string);
		
	}
		
		
	@Then("The user should be redirected to {string} page")
		public void the_user_should_be_redirected_to_page(String string) {
		   
			System.out.println("User can Redirected to page");
		}
		
	
	@When("The User clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		
		System.out.println("User can click tryButton");
	    
	}
	
	@Then("The user should be redirected to tryEditor page")
	public void the_user_should_be_redirected_to_try_editorpage() {
	   
		System.out.println("User can redirected to TryEditorpage");
	}

	
	@Then("The User should navigated back to Arrays In Python Page")
	public void the_user_should_navigated_back_to_arrays_in_python_page() {
		
		System.out.println("User should Navigated Back to Array In python Page");
	    
	}
	

	@Then("The User should navigated back to Array Page")
	public void the_user_should_navigated_back_to_Array_Page() {
		System.out.println("User should Navigated Back to ArrayPage");
	}
	
	@When("user clicks on the {string} link")
	public void user_clicks_on_the_link(String string) {
		
		System.out.println("User can click the link");

	}
	
	
	//DataStructure Steps
	
	@When("The User clicks the {string} On DataStructures")
	public void the_user_clicks_the_on_data_structures(String string) {
		hp.clickdatastruGetButton();
	}

	
	@Then("The user should navigated to {string} Page")
	public void the_user_should_navigated_to_page(String string) {
		System.out.println("User should Navigated to page");
	}

	

	@Then("The user should navigated to tryditor page")
	public void the_user_should_navigated_to_tryditor_page() {
		System.out.println("User should Navigated Back to tryeditor");
	}

	@Then("The user navigated back to Time Compexity page")
	public void the_user_navigated_back_to_time_compexity_page() {

		System.out.println("User should Navigated Back to compexity page");
	}

	@Then("The user should navigated to practice page")
	public void the_user_should_navigated_to_practice_page() {

		System.out.println("User should Navigated Back to practice page");
	}

	@Then("The user navigated to Data Structure page")
	public void the_user_navigated_to_data_structure_page() {
		System.out.println("User should Navigated Back to datastructure page");
	}

	@When("The user clicks the Try Here button")
	public void the_user_clicks_the_try_here_button() throws InterruptedException {
	    ds.clicktryHere();
	    Thread.sleep(2000);
	    
	}
	
	@When("The user clicks on {string} link")
	public void the_user_clicks_on_link(String string) throws InterruptedException {
		
	    ds.clicktimeComplexity();
	    Thread.sleep(2000);
	    
	}
	
	@When("The user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) throws InterruptedException {
	    ds.clickPracticeQuestLink();
	    
	}
	
	@Then("The user should see the title {string}")
	public void the_user_should_see_the_title(String string) {
		
		if (driver.getPageSource().contains(string)) {
			System.out.println(" Title Found" );
		}
			else {
				System.out.println("Title not found");
			}
	}
	
	
	
    //Practice question steps
	@When("The User click on {string}")
	public void the_user_click_on(String string) throws InterruptedException {
		   
		  app.clickpracticeQuestionforcheck();
	}

	@Then("The user should be redirected to practice question page page")
	public void the_user_should_be_redirected_to_practice_question_page_page() {
	System.out.println("User should Navigated Back to datastructure page");
	}
		
	@When("The User click on {string} button")
	public void the_user_click_on_button(String string) {
	System.out.println("User click Search the array link");
			
	}
	@Then("The User should navigated back toPractice questions page")
	public void the_user_should_navigated_back_to_practice_questions_page() {
		System.out.println("User navigated to practice page");
	}

	@Then("The User {string}")
	public void the_user(String string) {
	    hp.Clicksignout();
	}
 }

		





	

	