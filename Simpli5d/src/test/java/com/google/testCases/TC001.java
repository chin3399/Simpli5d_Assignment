package com.google.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;


public class TC001 extends BaseClass{
/*Assert Google Search Page contains Google Logo and Search Box*/	
	
	@Test
	public void CheckBoxandLogo() throws InterruptedException
	{
		HomePage H = new HomePage(driver);
		Thread.sleep(2000);
		boolean b1 = H.CheckDisplay();
		Assert.assertEquals(b1, true);
		boolean C= H.CheckLogo();
		Assert.assertEquals(C, true);
       
	}
		
	
    }



