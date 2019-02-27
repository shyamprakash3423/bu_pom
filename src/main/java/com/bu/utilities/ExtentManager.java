package com.bu.utilities;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
private static ExtentReports extent;
public static ExtentReports getInstance() {
	if(extent==null) {
		Date d = new Date();
		String filename = d.toString().replaceAll(" ", "_").replaceAll(":","_");
		String reportpath = "C:\\Users\\jobs\\myworkspace\\Bu_pom\\test-output\\junitreport\\"+filename+".html";
		//in folder it should display newest first.
		extent = new ExtentReports(reportpath, true, DisplayOrder.NEWEST_FIRST);
		extent.loadConfig(new File("C:\\Users\\jobs\\myworkspace\\Bu_pom\\extent-config.xml"));
		extent.addSystemInfo("Selenium version","3.0").addSystemInfo("Tester name","Shyam");
}
	return extent;
}
}