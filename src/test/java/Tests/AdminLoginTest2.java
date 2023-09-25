package Tests;

import Pageobject.AdminPage;
import Pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminLoginTest2 {
  @Test
    public void adminLoginTest1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage loginpage = new LoginPage(driver);
        AdminPage adminPage = new AdminPage(driver);

        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();

        adminPage.verifyAdmin();
    }
    @Test
    public void adminLoginTest2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage loginpage = new LoginPage(driver);
        AdminPage adminPage = new AdminPage(driver);

        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();

        adminPage.verifyAdmin();
    }
}
