package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("test case Pass");
    }
    @Override
   public void onTestFailure(ITestResult result) {
        System.out.println("taste case fail");
    }


}
