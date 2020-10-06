package Utils.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NGTestListener implements ITestListener {
	public void onTestStart(ITestResult iTestResult) {
		System.out.println("onTestStart");
	}
	
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("onTestStart");
	}
	
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("onTestFailure");
	}
	
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("onTestSkipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}
	
	public void onStart(ITestContext iTestContext) {
		System.out.println("onStart");
	}
	
	public void onFinish(ITestContext iTestContext) {
		System.out.println("onFinish");
	}
}
