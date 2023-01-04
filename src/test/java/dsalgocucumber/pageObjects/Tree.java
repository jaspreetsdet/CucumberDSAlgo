package dsalgocucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tree {
@FindBy(xpath=" //a[@href='tree']") WebElement TreeStart;
	
	@FindBy(xpath="//a[text()='Overview of Trees']") WebElement Overview_of_Trees;
	@FindBy(xpath="//a[text()='Terminologies']") WebElement Terminologies;
	@FindBy(xpath="//a[text()='Types of Trees']") WebElement Types_of_Trees;
	@FindBy(xpath="//a[text()='Tree Traversals']") WebElement Tree_Traversals;
	@FindBy(xpath="//a[text()='Traversals-Illustration']") WebElement Traversals_Illustration;
	@FindBy(xpath="//a[text()='Binary Trees']") WebElement BinaryTrees;
	@FindBy(xpath="//a[text()='Types of Binary Trees']") WebElement Types_of_BinaryTrees;
	@FindBy(xpath="//a[text()='Implementation in Python']") WebElement Implementation_in_Python;
	@FindBy(xpath=" //a[text()='Binary Tree Traversals']") WebElement BinaryTree_Traversals;
	@FindBy(xpath=" //a[text()='Implementation of Binary Trees']") WebElement Implementation_of_BinaryTrees;
	@FindBy(xpath=" //a[text()='Applications of Binary trees']") WebElement Applications_of_Binarytrees;
	@FindBy(xpath=" //a[text()='Binary Search Trees']") WebElement Binary_Search_Trees;
	@FindBy(xpath=" //a[text()='Implementation Of BST']") WebElement Implementation_Of_BST;
	
	@FindBy(xpath="//a[text()='Try here>>>']") WebElement Tryhere;

protected WebDriver driver;
	public Tree(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void treeStart() {
		TreeStart.click();
	}
	public void Overview_of_Trees(){
		Overview_of_Trees.click();
		Tryhere.click();
	}
	public void Terminologies() {
		Terminologies.click();
		Tryhere.click();
	}
	public void Types_of_Trees() {
		Types_of_Trees.click();
		Tryhere.click();
	}
	public void Tree_Traversals() {
		Tree_Traversals.click();
		Tryhere.click();
		
	}
	public void Traversals_Illustration() {
		Traversals_Illustration.click();
		Tryhere.click();
		
	}
	public void BinaryTrees() {
		BinaryTrees.click();
		Tryhere.click();
		
	}
	public void Types_of_BinaryTrees() {
		Types_of_BinaryTrees.click();
		Tryhere.click();
			}
	public void Implementation_in_Python() {
		Implementation_in_Python.click();
		Tryhere.click();
		
	}
	public void BinaryTree_Traversals() {
		BinaryTree_Traversals.click();
		Tryhere.click();
		
	}
	public void Implementation_of_BinaryTrees() {
		Implementation_of_BinaryTrees.click();
		Tryhere.click();
		
	}
	public void Applications_of_Binarytrees() {
		Applications_of_Binarytrees.click();
		Tryhere.click();
		
	}
	public void Binary_Search_Trees() {
		Binary_Search_Trees.click();
		Tryhere.click();
		
	}
	public void Implementation_Of_BST() {
		Implementation_Of_BST.click();
		Tryhere.click();
		
	}

}
