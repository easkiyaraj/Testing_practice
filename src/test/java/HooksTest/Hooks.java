package HooksTest;

import org.testng.annotations.*;

public class Hooks {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @Test
    public void Test1(){
        System.out.println("Test1");
    }
    @Test
    public void Test2(){
        System.out.println("Test2");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
