package dsalgocucumber.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import dsalgocucumber.pageObjects.Implementationofarraypage;
import dsalgocucumber.pageObjects.Implementationusingcollections_dqueue;
import dsalgocucumber.pageObjects.Queueclass;
import dsalgocucumber.pageObjects.Queueimplementationofpython;
import dsalgocucumber.pageObjects.Queueoperations;
import dsalgocucumber.pageObjects.Tryandrun;
import dsalgocucumber.utilities.CommonUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queuesteps {

	WebDriver driver;


	@Given("The user is in the Queue page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {

		driver = CommonUtilities.setup();
		CommonUtilities cu = new CommonUtilities();
		cu.signIn(driver);

	}

	@When("The user clicks Implementation of Queue in Python button")
	public void the_user_clicks_implementation_of_queue_in_python_button() {

		Queueclass q = new Queueclass(driver);
		q.clickQueueinPython();

	}

	@Then("The user should be directed to Implementation of Queue in Python Page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
		Queueimplementationofpython qp = new Queueimplementationofpython(driver);
		qp.validatepage();

	}

	@Given("The user is in the Implementation of Queue in Pythonpage after logged in")
	public void the_user_is_in_the_implementation_of_queue_in_pythonpage_after_logged_in() {

		driver = CommonUtilities.setup();
		CommonUtilities cu = new CommonUtilities();
		cu.signIn(driver);

		Queueclass q = new Queueclass(driver);
		q.clickQueueinPython();

		Queueimplementationofpython qp = new Queueimplementationofpython(driver);
		qp.validatepage();

	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String link) throws InterruptedException {
		Queueclass q = new Queueclass(driver);

		if (link.equals("Try Here")) {
			Queueimplementationofpython qp = new Queueimplementationofpython(driver);
			qp.clicktrybutton();

		} else if (link.equals("Implementation using Collections deque")) {
			q.clickimplementationcollections();

		} else if (link.equals("Implementation using Array")) {
			q.clickImplementationofarraypage();
		} else if (link.equals("Queue Operations")) {
			q.clickQueueoperations();

		} else if (link.equals("Practice Questions")) {

			q.clickPracticeQuestions();
		}

	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {

		Tryandrun ty = new Tryandrun(driver);

		ty.validaterunbutton();
		ty.validatetryeditor();

	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String pagename) {

		if (pagename.equals("Implementation using Collections deque")) {

			driver.get("https://dsportalapp.herokuapp.com/queue/implementation-collections/");
			Implementationusingcollections_dqueue ic = new Implementationusingcollections_dqueue(driver);

			ic.validateImplementationCollectionPage();

		} else if (pagename.equals("Implementation using Array")) {

			Implementationofarraypage ia = new Implementationofarraypage(driver);
			ia.validatepage();
		} else if (pagename.equals("Queueoperations")) {

			Queueoperations qop = new Queueoperations(driver);
			qop.validatequeueoperations();
		}

	}

	@Given("The user is in the Implementation using Collections deque page after logged in")
	public void the_user_is_in_the_implementation_using_collections_deque_page_after_logged_in()
			throws InterruptedException {

		driver = CommonUtilities.setup();
		CommonUtilities cu = new CommonUtilities();
		cu.signIn(driver);

		Queueclass q = new Queueclass(driver);
		q.clickimplementationcollections();
		
		Implementationusingcollections_dqueue ic = new Implementationusingcollections_dqueue(driver);
		ic.validateImplementationCollectionPage();

	}

	@Given("The user is in the Implementation using Array page after logged in")
	public void the_user_is_in_the_implementation_using_array_page_after_logged_in() throws InterruptedException {

		driver = CommonUtilities.setup();
		CommonUtilities cu = new CommonUtilities();
		cu.signIn(driver);

		Queueclass q = new Queueclass(driver);
		q.clickImplementationofarraypage();

	}

	@Given("The user is in the Queue Operations page after logged in")
	public void the_user_is_in_the_queue_operations_page_after_logged_in() {

		driver = CommonUtilities.setup();
		CommonUtilities cu = new CommonUtilities();
		cu.signIn(driver);

		Queueclass q = new Queueclass(driver);
		q.clickQueueoperations();

	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals("Not on the correct Page", "https://dsportalapp.herokuapp.com/queue/practice", currentURL);

	}

}
