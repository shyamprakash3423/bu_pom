package com.bu.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bu.basepage.Basepage;
import com.bu.utilities.Constatnts;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Loadingpage extends Basepage{
	@FindBy(how = How.XPATH, using="//*[@id='UserName']") 
	public WebElement username;
	@FindBy(how = How.XPATH, using="//*[@id='Password']")
	public WebElement password;
	
	public Loadingpage(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	public Homepage login(String u, String p) {
		test.log(LogStatus.INFO, u+"is Enterd");
		username.sendKeys(u);
		test.log(LogStatus.INFO, p+"is Enterd");
		password.sendKeys(p);
		test.log(LogStatus.INFO, "Clickig login button ");
		password.sendKeys(Keys.ENTER);
		Homepage home = new Homepage(driver,test);
		PageFactory.initElements(driver, home);
		return home;
	}

}
