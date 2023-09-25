package Attributes;

import org.testng.annotations.Test;

public class TestAttributes {
    @Test(priority = 3)
    public void Test1() {
        System.out.println("Test1");
    }
    @Test(priority = 2)
    public void Test2() {
        System.out.println("Test2");
    }
    @Test
    public void Test3() {
        System.out.println("Test3");
    }
    @Test(priority = 1)
    public void Test4() {
        System.out.println("Test3");
    }
}
