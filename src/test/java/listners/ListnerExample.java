package listners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerExample implements ITestListener {
    public void onTestStart(ITestResult result ){
        System.out.println("test is start");
    }
    public void onTestSuccess(ITestResult result){
        System.out.println(" test  is successes");
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("test is skipped");
    }
    public void onTestFailure(ITestResult result){
        System.out.println("test is fail");
    }
    public void onStart(ITestContext context){
        System.out.println("on start");
    }
    public void onFinish(ITestContext context){
        System.out.println("on finish");
    }
}
