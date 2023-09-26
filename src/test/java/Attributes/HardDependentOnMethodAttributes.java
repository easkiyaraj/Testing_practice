package Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardDependentOnMethodAttributes {
    @Test(dependsOnMethods = {"loginTest"})
    public void sendMessageTest() {
        System.out.println("Test1");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"loginTest"})
    public void postPictureTest() {
        System.out.println("Test2");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test
    public void registerTest() {
        System.out.println("Test3");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"registerTest"})
    public void loginTest() {
        System.out.println("Test3");
        Assert.fail();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test
    public void test()
    {
        System.out.println("test without dependency");
    }
}
