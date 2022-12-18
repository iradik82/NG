package class04;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListinersWithMetodName implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("test case Pass "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("taste case fail "+result.getName());
    }
}
