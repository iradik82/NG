package class03;

import org.testng.annotations.*;

public class Annotations {

    @BeforeTest
    public void BeforeTest() {
        System.out.println("I'm before test only for xml");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("I'm Before Class and execute only once at the beginning");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("I am Before Method and execute before every test case ");
    }

    @Test
    public void AfirstTest() {
        System.out.println("I am a 1 Test");
    }

    @Test
    public void BSecondTest() {
        System.out.println("I am b 2 Test");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("I am After Method and execute after every test case");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("I'm After Class and execute only once at the end");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("I'm after test only for xml");
    }
}