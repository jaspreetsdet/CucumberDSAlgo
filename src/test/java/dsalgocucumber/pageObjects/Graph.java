package dsalgocucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph {
	@FindBy(xpath=" //a[@href='graph']") WebElement GraphStart;
	@FindBy(xpath="//a[@href='graph']") WebElement Graph;
	@FindBy(xpath="//a[text()='Graph Representations']") WebElement Graph_rep;
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement practiceQuestions;
	@FindBy(xpath="//a[text()='Try here>>>']") WebElement Tryhere;
	
protected WebDriver driver;
	
	public Graph(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void graphStart() {
		GraphStart.click();
	}
	public void GraphPage() {
		Graph.click();
		Tryhere.click();
	}
	public void Graph_rep() {
		Graph_rep.click();
		Tryhere.click();
	}
	public void practiceQuestions() {
		practiceQuestions.click();	
	}

}
