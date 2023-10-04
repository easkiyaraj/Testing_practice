package HooksTest;

import Pageobject.AdminPage;
import Pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HooksExample {
    WebDriver driver;
    LoginPage loginpage;
    @BeforeMethod
  public void beforeMethod(){
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

      loginpage = new LoginPage(driver);
  }
   @Test
    public void loginTest1()
   {



       loginpage.fillUsername("Admin");
       loginpage.fillPassword("admin123");
       loginpage.clickButton();

       driver.quit();
   }
    @Test
    public void loginTest2()
    {
        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();
        driver.quit();
  }
    @AfterMethod
    public  void afterMethod(){
        driver.quit();
    }

}
