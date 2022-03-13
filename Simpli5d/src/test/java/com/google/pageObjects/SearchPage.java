package com.google.pageObjects;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.testCases.BaseClass;

public class SearchPage extends BaseClass

{

WebDriver ldriver;
	
	public SearchPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public List <WebElement>GetSearchResultsOnSearch()
	{
		List <WebElement> list = driver.findElements(By.cssSelector("li.sbct"));
		
		return list;
		
		
	}
	
	public WebElement FirstResult(int i)
	{
		i=1;//Click on first Link 
		WebElement W1 = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div["+i+"]/div/div[1]/div/a/h3"));
		
		return W1;
		
		
	}
		
	public String FirstURL(int i) 
	{
		 i=1; 
		 WebElement W2 = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[\"+i+\"]/div/div[1]/div/a/h3"));
		 String FirstLink= W2.getAttribute("href");
		
	     return FirstLink;
	
	}
	

}


