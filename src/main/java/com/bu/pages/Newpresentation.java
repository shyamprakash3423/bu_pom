package com.bu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bu.basepage.Basepage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Newpresentation extends Basepage{

	
	public Newpresentation(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;
	}
	@FindBy(how = How.XPATH, using =".//*[@id='PresentationName']")
	public WebElement presentationName;	
	@FindBy(how = How.XPATH, using ="html/body/div[1]/div/form/div[4]/div/button")
	public WebElement createButton;	
public Importingpage create() throws Exception {
Thread.sleep(3000);
test.log(LogStatus.INFO, "Enter the filename"+filename);
presentationName.sendKeys(filename);
test.log(LogStatus.INFO, "click on create button");
createButton.click();
Importingpage imp = new Importingpage(driver,test);
PageFactory.initElements(driver, imp);
return imp;
}



}

