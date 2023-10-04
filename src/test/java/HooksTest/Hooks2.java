package HooksTest;

import org.testng.annotations.*;

public class Hooks2 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
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
}
