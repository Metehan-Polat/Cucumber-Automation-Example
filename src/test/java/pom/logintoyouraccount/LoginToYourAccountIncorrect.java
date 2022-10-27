package pom.logintoyouraccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginToYourAccountIncorrect {

    public void loginIncorrectEmail(WebDriver driver, WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        element.sendKeys("mmetehanpolatasdasd@gmail.com");
    }

    public void loginIncorrectPassword(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        element.sendKeys("Mm189..."+Math.random());
    }

    public void yourEmailorPasswordisIncorrectMessage(WebDriver driver,WebElement element)
    {
        String a="Your email or password is incorrect!";
        element=driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']"));
        String b=element.getText();
        Assert.assertEquals(a,b);

    }


}
