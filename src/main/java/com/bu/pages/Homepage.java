package com.bu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bu.basepage.Basepage;
import com.bu.utilities.Constatnts;
import com.gargoylesoftware.htmlunit.Page;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Homepage extends Basepage{
  
	public Homepage(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	@FindBy(how = How.XPATH, using="html/body/div[1]/div[1]/div[1]/div")
	public  WebElement myslidebox;
	@FindBy(how = How.XPATH, using="html/body/div[1]/div[1]/div[2]/div")
	public  WebElement mypresentations;
	
	public Myslideboxpage myslidebox() throws Exception {
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Clicking on myslidebox");
		myslidebox.click();
		Myslideboxpage myslide = new Myslideboxpage(driver,test);
		PageFactory.initElements(driver, myslide);
		return myslide;
		
	}
	public Mypresentationspage mypresentations() throws Exception{
		Thread.sleep(3000);
		mypresentations.click();
		Mypresentationspage mypresent=new Mypresentationspage(driver,test);
		PageFactory.initElements(driver, mypresent);
		return mypresent;
		
	}
	@FindBy(how = How.XPATH,using="html/body/div[1]/div[1]/div[3]/div")
	public WebElement slidelibrary;
	public Slidelibrarypage slidelibrary() throws Exception {
		Thread.sleep(3000);
		slidelibrary.click();
		Slidelibrarypage sli = new Slidelibrarypage(driver,test);
		PageFactory.initElements(driver, sli);
		return sli;
	}
	@FindBy(how=How.XPATH,using="html/body/div[1]/div[1]/div[6]")
	public WebElement groupchat;
	public GroupchatPage groupchat() throws Exception {
	Thread.sleep(3000);
	 test.log(LogStatus.INFO, "groupchat icon is clicked");
	groupchat.click();
	GroupchatPage grp=new GroupchatPage(driver,test);
	PageFactory.initElements(driver, grp);
	return grp;
	
}
}

