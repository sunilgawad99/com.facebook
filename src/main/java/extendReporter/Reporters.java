package extendReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporters {

	
	
public static ExtentReports getReport()
{
	String path = "E:\\Velocity\\facebook\\report\\index.html";
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
	reporter.config().setDocumentTitle("FacebookAuto");
	reporter.config().setReportName("Web Automation");
	
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "sunil");
	return extent;
	
}
	
}
