package com.bu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bu.basepage.Basepage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Mypresentationspage extends Basepage{
	@FindBy(how = How.XPATH, using="html/body/div[1]/div/div[1]/div/div[1]/a")
	public  WebElement newpresentation;
	public Mypresentationspage(WebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public Newpresentation newPresentation() throws Exception {
		test.log(LogStatus.INFO, "click on new presentation button");
		Thread.sleep(3000);
		newpresentation.click();
		Newpresentation newpresntation=new Newpresentation(driver,test);
		PageFactory.initElements(driver, newpresntation);
		return newpresntation;
	}
}
