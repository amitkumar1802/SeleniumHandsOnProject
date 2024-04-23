package utilities;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;

public class ExtentReport {
	
	static ExtentReports extentReports;
	
	public static ExtentReports getExtentReports() {
		String path= System.getProperty("user.dir")+"\\reports\\report.html";
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
		extentSparkReporter.config().setReportName("Automation Code for Tutorial Ninja Website");
        extentSparkReporter.config().setDocumentTitle("Test Cases");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("Operating System", "10");
        extentReports.setSystemInfo("Author", "Amit kumar");
        
        return extentReports;
	}

}
