package com.bu.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.bu.basepage.Basepage;
import com.relevantcodes.extentreports.ExtentTest;

public class Importingpage extends Basepage {

	public Importingpage(WebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	@FindBy(how = How.XPATH, using ="//a[text()='Import PowerPoint']")
	public WebElement importPowerpoint;
	@FindBy(how = How.XPATH, using ="html/body/div[1]/div/div/div[2]/form/div[1]/div[2]/input[2]")
	public WebElement browse;
	@FindBy(how = How.XPATH, using ="html/body/div[1]/div/div/div[2]/form/div[2]/div/input")
	public WebElement importpptButton;
	public void importfromPowerpoint() throws Exception {
		Thread.sleep(3000);
		importPowerpoint.click();
		Thread.sleep(3000);
		browse.click();
		StringSelection Stringselection = new StringSelection("C:\\Users\\jobs\\Downloads\\Student Does.pptx ");
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
		importpptButton.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		 Screenshot(driver, test);
	}
	
public void importfromSlidelibrary() {
	
		
	}

public void addCompareSlide() {
	
	
}
}
