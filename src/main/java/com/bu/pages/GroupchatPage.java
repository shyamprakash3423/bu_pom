package com.bu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bu.basepage.Basepage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GroupchatPage extends Basepage {

	public GroupchatPage(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test= test;
	}
	@FindBy(how=How.XPATH,using=".//*[@id='17458d0e-dd99-489f-a47a-bc46700fb7a0']")
	public WebElement grpname;
	@FindBy(how=How.XPATH,using=".//*[@id='fistTab']/div/div/div/a[3]/img")
	public WebElement addslide;
	@FindBy(how=How.XPATH,using=".//*[@id='#Shared/']/i")
	public WebElement expand;
	@FindBy(how=How.XPATH,using=".//*[@id='shyam/']/i")
	public WebElement shyam;
	@FindBy(how=How.ID,using="shyam/test/_anchor")
	public WebElement test1;
	@FindBy(how=How.XPATH,using=".//*[@id='result']/div/div[1]/input")
	public WebElement cb1;
	@FindBy(how=How.XPATH,using=".//*[@id='result']/div/div[2]/input")
	public WebElement cb2;
	@FindBy(how=How.XPATH,using=".//*[@id='rightpanel']/div/div[1]/div[1]/div/button")
	public WebElement selectedimages;
	public void addslide() throws Exception {
	Thread.sleep(3000);
	test.log(LogStatus.INFO, "group name clicked");
		grpname.click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "add button is clicked");
		addslide.click();
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "expanstion is done");
		 expand.click();
			test.log(LogStatus.INFO, "shyam is clicked");
			Thread.sleep(3000);	
		 shyam.click();
		 Thread.sleep(5000);	
		 wait = new WebDriverWait(driver, 80);
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("shyam/test/_anchor")));
		 test.log(LogStatus.INFO, "test1 is clicked");
		 test1.click();
		 Thread.sleep(3000);
		 test.log(LogStatus.INFO, "cb1 is clicked");
		 cb1.click();
		 test.log(LogStatus.INFO, "cb2 is clicked");
		 cb2.click();
		 test.log(LogStatus.INFO, "selection is done");
		 selectedimages.click();
	}
	
}
