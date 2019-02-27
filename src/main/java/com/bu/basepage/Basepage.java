/**
 * 
 */
package com.bu.basepage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author jobs
 *for storing reusable functionalities for pages.
 */
public class Basepage {
public WebDriverWait wait;
 public WebDriver driver;
 public ExtentTest test ;
 Date d=new Date();
 public String filename=d.toString().replaceAll(" ", "_").replaceAll(":", "_");
 
 public void Screenshot(WebDriver driver,ExtentTest test) throws IOException {
	 Date d=new Date();
		String filename=d.toString().replaceAll(" ", "_").replaceAll(":", "_");
		String imagepath="C:\\Users\\jobs\\myworkspace\\Bu_pom\\test-output\\screenshots"+filename+".png";
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(imagepath));
test.log(LogStatus.INFO, test.addScreenCapture(imagepath));
}
}