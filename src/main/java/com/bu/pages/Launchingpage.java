/**
 * 
 */
package com.bu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bu.basepage.Basepage;
import com.bu.utilities.Constatnts;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author jobs
 * to open application we are creating the launching page.
 */
public class Launchingpage extends Basepage{
	

	public Launchingpage(WebDriver driver, ExtentTest test) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test=test;
	}
	
	public Loadingpage openApplication() {
		
		driver.get(Constatnts.BU_URL);
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, Constatnts.BU_URL+" is opened");
		Loadingpage land = new Loadingpage(driver , test);
		PageFactory.initElements(driver, land);
		return land;
	}
	
}
