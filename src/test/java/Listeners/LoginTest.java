package Listeners;

import Pageobject.AdminPage;
import Pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    LoginPage loginpage;
    AdminPage adminpage;
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginpage = new LoginPage(driver);
        adminpage = new AdminPage(driver);
    }
    @Test
    public void loginTest1()
    {
        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();
        adminpage.verifyAdmin();
    }
    @Test
    public void loginTest2()
    {
        loginpage.fillUsername("ganesh");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();
        adminpage.verifyAdmin();
    }
    @AfterMethod
    public  void afterMethod(){
        driver.quit();
    }

}
