package com.google.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {


WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.NAME, using ="q")
	@CacheLookup
	WebElement SearchBox;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
	@CacheLookup
	WebElement SearchButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/img")
	@CacheLookup
	WebElement GoogleLogo;
    
	
	public void EnterText() {
		SearchBox.sendKeys("Simplifi5d");
			
	}

	public void ClickSearch() 
	{
		SearchButton.click();
		
	}
    
	public boolean CheckDisplay() 
	{
		
		return SearchBox.isEnabled();
		
		
	}
		
	public boolean CheckLogo()
	{
		
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor)ldriver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", GoogleLogo);
		if (!ImagePresent) {
			System.out.println("Image not displayed.");
		  } else {
			System.out.println("Image displayed.");
		}
		
		return ImagePresent;
	}
    

}




    





