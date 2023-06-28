package testSuit;

import browserFactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPassword extends BaseTest {

    String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setupBrowser()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
     driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        String expected = "Reset Password";
     String actual =driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();

     Assert.assertEquals("Actual and expected text are  equal",expected,actual);

    }



    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
