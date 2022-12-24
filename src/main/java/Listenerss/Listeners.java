package Listenerss;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import extendReporter.Reporters;
import facebook.Pom.Utility;

public class Listeners implements ITestListener{
	ExtentTest test;
	 ExtentReports extent;
	
	public void onTestStart(ITestResult result) {
		extent=	Reporters.getReport();
		test = extent.createTest(result.getMethod().getMethodName());
		
	   
	  }
	
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test :pass "+result.getMethod().getMethodName());
		
		Reporter.log("testpassed");
	  }
	
	public void onTestFailure(ITestResult result) {
		test.fail("test fail");
		test.log(Status.FAIL, result.getThrowable());
		String path = null;
		try {
		path =	Utility.getScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			test.addScreenCaptureFromPath(path,result.getMethod().getMethodName() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  }

	public void onTestSkipped(ITestResult result) {
		   test.log(Status.SKIP, result.getMethod().getMethodName());
		  }
	
	public void onFinish(ITestContext context) {
	
		extent.flush();
	  }
}
