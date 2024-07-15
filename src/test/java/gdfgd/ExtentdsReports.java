package gdfgd;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentdsReports {

ExtentReports extent;
	
	@Test
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("USER.DIR")+"\\reports2\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Result");
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rahul Shetty");
		
	
		extent.createTest("demo");
	System.out.println("Day3");
	   extent.flush();
	}
}
