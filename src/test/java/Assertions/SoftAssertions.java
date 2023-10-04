package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    @Test
    public void hardAssert(){
        System.out.println("hi");
        Assert.assertTrue(false, "failure");
    }
    @Test
    public void softAssert(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("hii");
        softAssert.assertTrue(true, "fail1");
        System.out.println("hello");
        softAssert.assertFalse(false, "fail2");
        softAssert.assertEquals("bye", "bye", "fail3");
        softAssert.assertAll();
    }
}
