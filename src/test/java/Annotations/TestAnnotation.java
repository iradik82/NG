package Annotations;

import org.testng.annotations.*;

public class TestAnnotation {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("i'm before suit *-*");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("i am after suit -_-");
    }

    @BeforeTest
    public void BT(){
        System.out.println("I'm before Test--------");
    }
    @AfterTest
    public void AT(){
        System.out.println("i'm after Test--------");
    }
}
