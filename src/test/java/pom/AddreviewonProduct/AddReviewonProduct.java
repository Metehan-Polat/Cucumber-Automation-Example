package pom.AddreviewonProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddReviewonProduct {
    public void VerifyWriteYourReviewVisible(WebDriver driver, WebElement element)
    {
        String a="WRITE YOUR REVIEW";
        element=driver.findElement(By.xpath("//a[@href='#reviews']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }
    public void enterName(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@id='name']"));
        element.sendKeys("Metehan Polat");
    }
    public void enterEmail(WebDriver driver,WebElement element){
        element=driver.findElement(By.xpath("//input[@id='email']"));
        element.sendKeys("mmetehanpolat@gmail.com");

    }
    public void review(WebDriver driver,WebElement element)
    { element=driver.findElement(By.xpath("//textarea[@name='review']"));
        element.sendKeys("Thanks");

    }
    public void messageThankYou(WebDriver driver,WebElement element)
    {
        String a="Thank you for your review.";
        element=driver.findElement(By.xpath("//*[text()='Thank you for your review.']"));
        String b=element.getText();
        Assert.assertEquals(a,b);

    }
    public void submitClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@id='button-review']")).click();
    }
}
