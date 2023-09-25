package Attributes;

import org.testng.annotations.Test;

public class EnableDisableAttributes {
    @Test
    public void Test1() {
        System.out.println("Test1");
    }
    @Test
    public void Test2() {
        System.out.println("Test2");
    }
    @Test(enabled = false)
    public void Test3() {
        System.out.println("Test3");
    }
    @Test(enabled = true)
    public void Test4() {
        System.out.println("Test3");
    }
}
