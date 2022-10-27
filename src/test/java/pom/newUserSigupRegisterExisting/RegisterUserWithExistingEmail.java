package pom.newUserSigupRegisterExisting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterUserWithExistingEmail {

    public void alreadyRegisteredEmailAddress(WebDriver driver, WebElement element)

    {
        element=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        element.sendKeys("mmetehanpolatasd@gmail.com");

    }

    public void emailAddressAlreadyExistMessage(WebDriver driver,WebElement element)
    {
        String a="Email Address already exist!";
        element=driver.findElement(By.xpath("//*[text()='Email Address already exist!']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

}
