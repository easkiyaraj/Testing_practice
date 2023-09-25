package Attributes;

import org.testng.annotations.Test;

public class DescriptionAttributes {
    @Test(testName = "A Sending Message", dependsOnMethods = {"loginTest"}, suiteName = "Auto suiter")
    public void sendMessageTest() {
        System.out.println("Test1");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"loginTest"}, suiteName = "suiter test")
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
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(testName = "Simple Test Method", description = "This test will be executed without dependency!!!")
    public void test()
    {
        System.out.println("test without dependency");
    }
}
