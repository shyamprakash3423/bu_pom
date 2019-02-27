package com.bu.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bu.basetest.Basetest;
import com.bu.pages.Launchingpage;
import com.bu.pages.Loadingpage;
import com.bu.utilities.Constatnts;
import com.relevantcodes.extentreports.LogStatus;

public class Logintestcase extends Basetest{
	@Test
	public void login() {
		test= extent.startTest("login");
		test.log(LogStatus.INFO, "login testing start");
		openBrowser("Chrome");
	//  from here to launching class we need to pass the driver.
		Launchingpage launch = new Launchingpage(driver,test);
	// to pass the object and driver from test case to page	(this class - another class)
		PageFactory.initElements(driver,launch);
		Loadingpage land = launch.openApplication();
		PageFactory.initElements(driver,land);
		land.login(Constatnts.BU_USERNAME, Constatnts.BU_PASSWORD);
		
	}

	@AfterTest
	public void quit() {
		extent.endTest(test);
		extent.flush();
		extent.close();
	}
}
