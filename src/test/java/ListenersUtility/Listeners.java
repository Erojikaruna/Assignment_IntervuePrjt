package ListenersUtility;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Login.LoginTest;

public class Listeners implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		Reporter.log("Report configuration", true);
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("Report Backup", true);
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName() + "--Started--", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName() + "--Success--", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		Reporter.log(testname + "--Failed--", true);
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		TakesScreenshot ts = (TakesScreenshot) LoginTest.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/" + testname + time + ".png");

		try {
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			Reporter.log("Screenshot not captured", true);
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getMethod().getMethodName() + "--Skipped--", true);
	}
}
