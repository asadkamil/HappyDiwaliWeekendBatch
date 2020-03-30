package TestNG_Package;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener,ISuiteListener {

	@Override
	public void onFinish(ISuite arg0) {
		System.out.println("Suite Finished");
	}

	@Override
	public void onStart(ISuite arg0) {
		System.out.println("Suite started");
	}

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("block Finished");
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("block started");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("test method failed");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("test method skipped");
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("test method started");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("test method pass");
	}
}
