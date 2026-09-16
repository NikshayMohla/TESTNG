package Day2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class iTest implements ITestListener {
    public void onStart(ITestContext context) {
        System.out.println("Code Has Started");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("Test Started");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test is Successfully passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Has Failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test has been skipped");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Code Has Finished");
    }
}
