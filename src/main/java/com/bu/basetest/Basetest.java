/**
 * 
 */
package com.bu.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bu.basepage.Basepage;
import com.bu.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author jobs
 *Reusable functionalities for test cases.
 */
public class Basetest extends Basepage {
	public ExtentReports extent = ExtentManager.getInstance();
public void openBrowser(String browser) {
	test.log(LogStatus.INFO, browser+" is going to  open");
	if (browser.equals("Mozilla")) {
		System.setProperty("webdriver.firefox.marionette", "D:\\shyam\\Set ups\\geckodriver.exe");
		driver = new FirefoxDriver();
		test.log(LogStatus.INFO, browser+" is opened");
	}else if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\shyam\\Set ups\\chromedriver.exe");
		driver = new ChromeDriver(); 
		test.log(LogStatus.INFO, browser+" is opened");
	}else if(browser.equals("Edge")) {
		System.setProperty("webdriver.edge.driver", "D:\\shyam\\Set ups\\Microsoftdriver.exe");
		driver = new EdgeDriver(); 
		test.log(LogStatus.INFO, browser+" is opened");
	}
}
}
