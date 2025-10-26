
package com.adactinhotelapp.listnears;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;

public class TestNGListners implements ITestListener {
	
	protected WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {

	
		Allure.step("Starting an test case(step) (onTestStart) " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		Allure.step("Test case completed successfully (onTestSuccess)  " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailure(ITestResult result) {

		Allure.step("test case failed  " + result.getMethod().getMethodName());

		// take screenshot code
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		Allure.step("this test case has skipped  " + result.getMethod().getMethodName());


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		Allure.step("this test case Failed But Within Success Percentage  " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		Allure.step("this test case has Failed With Timeout  " + result.getMethod().getMethodName());


	}

	@Override
	public void onStart(ITestContext context) {
		
		Allure.step("this test case onStart  " + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		
		
		
		
		Allure.step("this test case onFinish  " + context.getName());


	}
}
