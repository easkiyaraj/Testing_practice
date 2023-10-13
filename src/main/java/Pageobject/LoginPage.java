package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
//    private static final By USERNAME=By.xpath("//input[@placeholder='Username']");
@FindBy(name = "username")
private WebElement USERNAME;
//    private static final By PASSWORD=By.xpath("//input[@placeholder='Password']");
@FindBy(xpath = "//input[@name='password']")
private WebElement PASSWORD;
//    private static final By Button=By.xpath("//button[normalize-space()='Login']");
@FindBy(xpath = "//button[normalize-space()='Login']")
private WebElement Button;

    public LoginPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void fillUsername(String username)
   {
//      ldriver.findElement(USERNAME).sendKeys(username);
       USERNAME.sendKeys(username);
   }
   public void fillPassword(String password){
//       ldriver.findElement(PASSWORD).sendKeys(password);
       PASSWORD.sendKeys(password);
   }
   public void clickButton(){
//       ldriver.findElement(Button).click();
       Button.click();
   }
}
