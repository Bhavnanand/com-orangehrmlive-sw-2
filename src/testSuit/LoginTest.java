package testSuit;

import browserFactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl =" https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setupBrowser()
    {
      openBrowser(baseUrl);
    }
@Test
public void userSholdLoginSuccessfullyWithValidCredentials(){
        WebElement emailfield =driver.findElement(By.xpath("//input[@placeholder='Username']"));
        emailfield.sendKeys("Admin");
        WebElement passwordField =driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("admin123");
        driver.findElement(By.xpath(("//button[@type='submit']"))).click();
    String expected ="Dashboard";
        String actual =driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();

     Assert.assertEquals("Actual and expected text are same",expected,actual);


    }
    public void closeBrowser(){
        driver.close();
    }
}
