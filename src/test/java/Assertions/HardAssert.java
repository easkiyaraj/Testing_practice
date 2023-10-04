package Assertions;

import Pageobject.AdminPage;
import Pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssert {
    WebDriver driver;
    LoginPage loginpage;
    AdminPage adminPage;

    @BeforeMethod
    public void beforeMethod(){
    driver =new  ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    loginpage =new LoginPage(driver);
//    adminPage =new AdminPage(driver);
    }
    @Test
    public void adminLoginTest1() {
        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();
//        adminPage.verifyAdmin();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Url Missmatching");
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",
                "Url Mismatch");
    }
    @Test
    public void adminLoginTest2() {
        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();
//        adminPage.verifyAdmin();
//        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Url Missmatching");
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",
                "Url Mismatch");
    }
}
