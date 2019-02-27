package com.bu.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.bu.basepage.Basepage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Slidelibrarypage extends Basepage{
	
	public Slidelibrarypage(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test = test;
	}
	@FindBy(how = How.XPATH,using = ".//*[@id='SeachCaseSection']")
	public WebElement dropdown;
	@FindBy(how = How.XPATH,using = ".//*[@id='IsPresenter']")
	public WebElement checkbox;
	@FindBy(how = How.XPATH,using = ".//*[@id='btnSearch']")
	public WebElement Search;
	
	public void search() throws Exception {
		test.log(LogStatus.INFO, "category is selected from dropdown");
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		test.log(LogStatus.INFO, "include from pp lib is clicked");
		checkbox.click();
		test.log(LogStatus.INFO, "search is clicked");
		Search.click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Screenshot is taken");
		Screenshot(driver, test);
		
		
	}
	public void reset() {
		
	}

}
