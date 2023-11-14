package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.inetbanking.utilities.TestUtils;




  public class Listeners3 extends TestUtils implements  ITestListener{
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - "+result.getName());
		System.out.println("Test case is starting");
	}
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is passed -"+result.getStatus());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed - screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("<a href=\"C:\\Users\\hp\\eclipse-workspace\\HybridFramework\\inetbankingv1\\Screenshots\\Wed-Apr-19-11-58-38-IST-2023.png\">Test Results</a>");
	}
	public void onTestSkipped(ITestResult result) {
		
	}
	public void onTestFailureWithinSuccessPecentage(ITestResult result) {
		
	}
	public void onStart(ITestContext context) {
		
	}

}
