package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.testbase.Testbase;

public class HomePage extends Testbase
{
	public HomePage ()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class=\"scinm\"])[4]")
	private WebElement four;
	
	public void ClickOnFour()
	{
		four.click();
	}
	
	@FindBy(xpath="(//span[@class=\"scinm\"])[8]")
	private WebElement Two;
	
	public void ClickOnTwo() 
	{
		Two.click();
	}
	@FindBy(xpath="(//span[@class=\"scinm\"])[9]")
	private WebElement Three;
	
	public void ClickOnThree() 
	{
		Three.click();
	}
	@FindBy(xpath="(//span[@class=\"sciop\"])[5]")
	private WebElement Mul;
	
	public void ClickOnMul() 
	{
		Mul.click();
	}
	@FindBy(xpath="(//span[@class=\"scinm\"])[5]")
	private WebElement Five;
	
	public void ClickOnFive() 
	{
		Five.click();
	}
	@FindBy(xpath="(//span[@class=\"scieq\"])[2]")
	private WebElement Equals;
	
	public void ClickOnEquals() 
	{
		Equals.click();
	}
	//////////
	
	@FindBy(xpath="(//span[@class=\"scinm\"])[10]")
	private WebElement Zero;
	
	public void ClickOnZero() 
	{
		Zero.click();
	}
	@FindBy(xpath="(//span[@class=\"scinm\"])[2]")
	private WebElement Eight;
	
	public void ClickOnEight() 
	{
		Eight.click();
	}
	@FindBy(xpath="(//span[@class=\"scinm\"])[3]")
	private WebElement Nine;
	
	public void ClickOnNine() 
	{
		Nine.click();
	}
	@FindBy(xpath="(//span[@class=\"sciop\"])[8]")
	private WebElement Div;
	
	public void ClickOnDiv() 
	{
		Div.click();
	}
	@FindBy(xpath="(//span[@class=\"sciop\"])")
	private WebElement Add;
	
	public void ClickOnAdd() 
	{
		Add.click();
	}
	@FindBy(xpath="(//span[@class=\"sciop\"])[3]")
	private WebElement Sub;
	
	public void ClickOnSub() 
	{
		Sub.click();
	}
	@FindBy(xpath="(//span[@class=\"scieq\"])")
	private WebElement AllClear;
	
	public void ClickOnAllClear() 
	{
		AllClear.click();
	}
	@FindBy(xpath="(//span[@class=\"scifunc\"])[19]")
	private WebElement BracketOn;
	
	public void ClickOnAllBracketOn() 
	{
		BracketOn.click();
	}
	@FindBy(xpath="(//span[@class=\"scifunc\"])[20]")
	private WebElement BracketClose;
	
	public void ClickOnAllBracketClose() 
	{
		BracketClose.click();
	}
}