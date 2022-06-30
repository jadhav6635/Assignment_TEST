package com.qa.testLayer;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;

import com.qa.testbase.Testbase;

public class HomepageTest extends Testbase {
	
	@Test
	public void VerifyMultiplication() throws InterruptedException
	{
		HomePage obj=new HomePage();
		obj.ClickOnFour();
		obj.ClickOnTwo();
		obj.ClickOnThree();
		obj.ClickOnMul();
		obj.ClickOnFive();
		obj.ClickOnTwo();
		obj.ClickOnFive();
		obj.ClickOnEquals();
		
		Thread.sleep(8000);
		obj.ClickOnAllClear();
	}
	@Test
	public void  VerifyDiv() throws InterruptedException {
		HomePage obj1 = new HomePage();
		obj1.ClickOnFour();
		obj1.ClickOnZero();
		obj1.ClickOnZero();
		obj1.ClickOnZero();
        obj1.ClickOnDiv();
        obj1.ClickOnTwo();
        obj1.ClickOnZero();
		obj1.ClickOnZero();
		obj1.ClickOnEquals();

		Thread.sleep(8000);
		obj1.ClickOnAllClear();
		
	}
	@Test
	public void verifyadd() throws InterruptedException {
		HomePage obj2= new HomePage();
		obj2.ClickOnSub();
		obj2.ClickOnTwo();
		obj2.ClickOnThree();
		obj2.ClickOnFour();
		obj2.ClickOnTwo();
		obj2.ClickOnThree();
		obj2.ClickOnFour();
		obj2.ClickOnAdd();
		obj2.ClickOnThree();
		obj2.ClickOnFour();
		obj2.ClickOnFive();
		obj2.ClickOnThree();
		obj2.ClickOnFour();
		obj2.ClickOnFive();
		obj2.ClickOnEquals();
		
		Thread.sleep(8000);
		obj2.ClickOnAllClear();
		
	}
		@Test
		public void verifysub() throws InterruptedException {
		HomePage obj3 = new HomePage();
		obj3.ClickOnTwo();
		obj3.ClickOnThree();
		obj3.ClickOnFour();
		obj3.ClickOnEight();
		obj3.ClickOnTwo();
		obj3.ClickOnThree();
		obj3.ClickOnSub();
		obj3.ClickOnAllBracketOn();
		obj3.ClickOnSub();
		obj3.ClickOnTwo();
		obj3.ClickOnThree();
		obj3.ClickOnZero();
		obj3.ClickOnNine();
		obj3.ClickOnFour();
		obj3.ClickOnEight();
		obj3.ClickOnTwo();
		obj3.ClickOnThree();
		obj3.ClickOnEquals();
		Thread.sleep(8000);
		}
		
		



}

