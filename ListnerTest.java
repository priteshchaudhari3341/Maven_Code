package ExcelR.SeleniumOctTraining;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTest implements ITestListener {
	
	
	public void onFinish(ITestContext contextFinish) {
	System.out.println("onFinish method finished");
	System.out.println("The testcase is finished");

	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("Method failed with certain success percentage"+ result.getName());

	}


	public void onTestFailure(ITestResult result) {
	System.out.println("Method failed"+ result.getName());
	System.out.println("The testcase is failed");
	}

	
	public void onTestSkipped(ITestResult result) {
	System.out.println("Method skipped"+ result.getName());
	System.out.println("The testcase is skipped");
	}

	
	public void onTestStart(ITestResult result) {
	System.out.println("Method started"+ result.getName());
	System.out.println("The testcase is started");
	}
	
	
	public void onTestSuccess(ITestResult result) {
	System.out.println("Method passed"+ result.getName());
	System.out.println("The testcase is passed");
	}
	
	

}
