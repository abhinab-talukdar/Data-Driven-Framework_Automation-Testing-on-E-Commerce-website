package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	public static ExtentReports getExtentReport() {
		String extentReportFilePath=System.getProperty("user.dir")+"\\Reports\\extentreport.html";
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(extentReportFilePath);
		sparkReporter.config().setReportName("TutorialsNinja Automation Results");
		sparkReporter.config().setDocumentTitle("TutorialsNinja Test Automation Results");
		ExtentReports extentReport=new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		extentReport.setSystemInfo("Selenium Version","4.35.0");
		extentReport.setSystemInfo("Operating System","Windows10");
		extentReport.setSystemInfo("Executed By","Abhinab Talukdar");
		return extentReport;
	}

}
