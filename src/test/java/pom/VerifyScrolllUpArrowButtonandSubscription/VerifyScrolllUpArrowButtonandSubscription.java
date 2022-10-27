package pom.VerifyScrolllUpArrowButtonandSubscription;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.js.JScr;

public class VerifyScrolllUpArrowButtonandSubscription {

    JScr jScr=new JScr();

       public void subscriptionHomePage(WebDriver driver, WebElement element)
       {
           element=driver.findElement(By.xpath("//input[@id='susbscribe_email']"));
           jScr.jsScrollElement(driver,element);
       }
    public void subspriptionMlessage(WebDriver driver,WebElement element) throws InterruptedException {
        String a="SUBSCRIPTION";
        element=driver.findElement(By.xpath("//*[text()='Subscription']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
        Thread.sleep(3000);
    }

       public void moveUpwardClick(WebDriver driver)
       {
           driver.findElement(By.xpath("//a[@id='scrollUp']")).click();
       }

       public void scrolledmMessage(WebDriver driver,WebElement element)
       {
           String a="Full-Fledged practice website for Automation Engineers";
           element=driver.findElement(By.xpath("//*[text()='Full-Fledged practice website for Automation Engineers']"));
           String b=element.getText();
           Assert.assertEquals(a,b);
       }

}
