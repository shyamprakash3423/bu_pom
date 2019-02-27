package com.bu.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bu.basepage.Basepage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Myslideboxpage extends Basepage {
	@FindBy(how = How.XPATH, using =".//*[@id='#Shared/']/i")
	public WebElement myslidebox;
	
	@FindBy(how = How.XPATH, using =".//*[@id='uploadLink']/i")
	public WebElement upload;
	
	@FindBy(how = How.XPATH, using ="//a[@id='shyam/_anchor']")
	public WebElement folder;
	@FindBy(how = How.XPATH, using =".//*[@id='files']")
	public WebElement choosefile;
	@FindBy(how = How.XPATH, using =".//*[@id='txtcasetitle']")
	public WebElement diagnosis;
	@FindBy(how = How.XPATH, using =".//*[@id='uploadfilestocloud']")
	public WebElement uploadbutton;
	public Myslideboxpage(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;
	}

	public void createfolder() {
		
	}
   public void createsubfolder() {
	   
   }
   public void upload() throws Exception {
	   Thread.sleep(7000);
	   test.log(LogStatus.INFO, "clicking on myslidebox button");
	   myslidebox.click();
	   wait = new WebDriverWait(driver, 60);
	   wait.until(ExpectedConditions.visibilityOf(folder));
	   test.log(LogStatus.INFO, folder + ("is clicked"));
	   folder.click();  
	   Thread.sleep(3000);
	   test.log(LogStatus.INFO, "clicking on upload button");
	   wait = new WebDriverWait(driver, 80);
	   wait.until(ExpectedConditions.visibilityOf(upload));
	   upload.click();
	   test.log(LogStatus.INFO, "open upload window");
	   ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tab.size());
		for (int i = 0; i < tab.size(); i++) {
			driver.switchTo().window(tab.get(i));
			System.out.println(driver.getCurrentUrl());	
		}
		driver.switchTo().window(tab.get(1));
		 test.log(LogStatus.INFO, "choosing of file");
		Thread.sleep(3000);
		choosefile.click();
		StringSelection Stringselection = new StringSelection("C:\\Users\\jobs\\Downloads\\verysmall.svs ");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Stringselection, null);
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.setAutoDelay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		diagnosis.sendKeys("svs");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 test.log(LogStatus.INFO, "clicking on upload button");
		uploadbutton.click();
		test.log(LogStatus.INFO, " file is uploaded");
		Thread.sleep(8000);
		driver.switchTo().window(tab.get(0));
		driver.navigate().refresh();
		Thread.sleep(12000);
		wait = new WebDriverWait(driver, 60);
		   wait.until(ExpectedConditions.visibilityOf(myslidebox));
		   myslidebox.click();
		   wait = new WebDriverWait(driver, 60);
		   wait.until(ExpectedConditions.visibilityOf(folder));
		   test.log(LogStatus.INFO, folder + ("is clicked"));
		   folder.click();  
		   Screenshot(driver, test);
		   
	   
   }
   public void multipleupload() {
	   
   }
   public void sharefile() {
	   
   }
   public void multipleshare() {
	   
   }
}

