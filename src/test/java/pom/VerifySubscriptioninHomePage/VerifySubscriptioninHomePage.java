package pom.VerifySubscriptioninHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class VerifySubscriptioninHomePage {



    public void verifySub(WebDriver driver, WebElement element)
    {
        String a="SUBSCRIPTION";
        element=driver.findElement(By.xpath("//*[text()='Subscription']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }
    public void subscribeEmail(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
        element.sendKeys("mmetehanpolat"+Math.random()+"@gmail.com");
    }
    public void clickArrowButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
    }
    public void successMessage(WebDriver driver,WebElement element)
    {
        String a="You have been successfully subscribed!";
        element=driver.findElement(By.xpath("//*[text()='You have been successfully subscribed!']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

}
