package Tests;

import Pageobject.AdminPage;
import Pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserLoginTest {
   @Test
    public void userLoginTest() {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage loginpage=new LoginPage(driver);
        AdminPage adminPage = new AdminPage(driver);

        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();

        adminPage.verifyAdmin();
    }
}
