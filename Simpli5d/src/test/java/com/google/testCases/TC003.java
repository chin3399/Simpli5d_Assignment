package com.google.testCases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchPage;

import junit.framework.Assert;

@Test
public class TC003 extends BaseClass
{
    public void CheckResult() throws MalformedURLException, InterruptedException 
    {

	HomePage H = new HomePage(driver);
    H.EnterText();
    H.ClickSearch();
    SearchPage S = new SearchPage(driver);
    S.FirstResult(1).click();
    Thread.sleep(2000);
    String ClickedURL= driver.getCurrentUrl();
    System.out.println("Click URL is "+ClickedURL);
    String FirstURL = S.FirstURL(1);
    System.out.println("Actual URL is +"+FirstURL);
    Assert.assertEquals(ClickedURL, FirstURL);
    
    

    
    
    




}}

