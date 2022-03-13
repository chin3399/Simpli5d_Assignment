package com.google.testCases;

import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchPage;

import junit.framework.Assert;


@Test
public class TC002 extends BaseClass

{   
	public void StartSearch() throws InterruptedException
	{
		HomePage H = new HomePage(driver);
		H.EnterText();
		Thread.sleep(2000);
		SearchPage sp = new SearchPage(driver);
		int r= sp.GetSearchResultsOnSearch().size();
		System.out.println("Total Number of Results returned"+r);
		boolean b;
		if(r>0) {
			
			b=true;
		}
		else {
			b=false;
		}
	    
		Assert.assertEquals(b, true);
	
	}
		




}
