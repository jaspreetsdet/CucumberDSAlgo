package dsalgocucumber.stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dsalgocucumber.pageObjects.Graph;
import dsalgocucumber.pageObjects.HomePage;
import dsalgocucumber.pageObjects.Linked_list;
import dsalgocucumber.pageObjects.Tree;

import java.time.Duration;

public class Graph_TreeSD {
    WebDriver driver = null;

    HomePage home;
    Graph gr;
    Tree tr;
    Linked_list list;

    @Given("User Opens Url in Browser")
    public void user_opens_url_in_browser() {
        System.out.println("Hello Browser");

        System.setProperty("webdriver.Chrome.driver",
                "C:/Users/santo/OneDrive/Desktop/Girija/Dec121922/src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
        driver.navigate().to("https://dsportalapp.herokuapp.com/");
    }

    @When("User is clicks on getstart button")
    public void user_is_clicks_on_getstart_button() throws InterruptedException {
        driver.navigate().to("https://dsportalapp.herokuapp.com/");
        home = new HomePage(driver);
        home.getStart();
        Thread.sleep(2000);
    }

    @Then("User clicks on signin link")
    public void user_clicks_on_signin_link() {
        home.signin();
    }

    @Then("User login with valid Credentials")
    public void user_login_with_valid_credentials() {
        home.existUser();
        home.login();
    }

    @Given("User clicks on graph Getstart button")
    public void user_clicks_on_graph_getstart_button() throws InterruptedException {
        gr = new Graph(driver);
        gr.graphStart();
        Thread.sleep(1000);
    }

    @Then("User Opens other Graphsublinks")
    public void user_opens_other_graphsublinks() throws InterruptedException {
        gr.GraphPage();
        extracted(driver);

        gr.Graph_rep();
        extracted(driver);
        gr.practiceQuestions();
        Thread.sleep(1000);

    }

    @Given("User Clicks on tree Getstart button")
    public void user_clicks_on_tree_getstart_button() {
        tr = new Tree(driver);
        tr.treeStart();
    }

    @Then("User verifies all the Tree links")
    public void user_verifies_all_the_subLinks() throws InterruptedException {
        tr.Overview_of_Trees();
        extracted(driver);

        tr.Terminologies();
        extracted(driver);

        tr.Types_of_Trees();
        extracted(driver);

        tr.Tree_Traversals();
        extracted(driver);

        tr.Traversals_Illustration();
        extracted(driver);
        tr.BinaryTrees();
        extracted(driver);
        tr.Types_of_BinaryTrees();
        extracted(driver);
        tr.Implementation_in_Python();
        extracted(driver);
        tr.BinaryTree_Traversals();
        extracted(driver);
        tr.Implementation_of_BinaryTrees();
        extracted(driver);
        tr.Applications_of_Binarytrees();
        extracted(driver);
        tr.Binary_Search_Trees();
        extracted(driver);
        tr.Implementation_Of_BST();
        extracted(driver);
    }

    private void extracted(WebDriver driver) throws InterruptedException {
        Actions action = new Actions(this.driver);
        WebElement element = this.driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']"));
        action.sendKeys(element, "print(\"Hello\")").build().perform();
        WebElement runButton = this.driver.findElement(By.xpath("//*[contains(text(),'Run')]"));
        runButton.click();
        Thread.sleep(1000);
        this.driver.navigate().back();
    }


    private void validatePopUpMessage(WebDriver driver) throws InterruptedException {
        Actions action = new Actions(this.driver);
        WebElement element = this.driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']"));
        action.sendKeys(element, "iphone").build().perform();
        WebElement runButton = this.driver.findElement(By.xpath("//*[contains(text(),'Run')]"));
        runButton.click();
        Thread.sleep(1000);
        String alertMessage = this.driver.switchTo().alert().getText();
        System.out.println("Alert Message is " + alertMessage);
        this.driver.switchTo().alert().accept();
    }

    @And("User quits Browser")
    public void userQuitsBrowser() {
        driver.quit();
    }

    @Given("User Clicks on LinkedList Getstart button")
    public void user_clicks_on_linked_list_getstart_button() {
        list = new Linked_list(driver);
        list.LinkedlistStart();
    }

    @Then("User verifies all the Linked_list links")
    public void user_verifies_all_the_linked_list_links() throws InterruptedException {
        list.Introduction();
        extracted(driver);

        list.Creating_Linked_LIst();
        extracted(driver);

        list.Types_of_LinkedList();
        extracted(driver);

        list.Implement_LinkedListinPython();
        extracted(driver);

        list.Traversal();
        extracted(driver);

        list.Insertion();
        extracted(driver);

        list.Deletion();
        extracted(driver);

        Thread.sleep(1000);
    }

    @Then("print the error message")
    public void print_the_error_message() throws InterruptedException {
        tr.Overview_of_Trees();
        validatePopUpMessage(driver);
    }

}

