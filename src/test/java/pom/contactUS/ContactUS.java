package pom.contactUS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactUS {

    public void verifiyGetInTouchMessage(WebDriver driver, WebElement element)
    {
        String a="GET IN TOUCH";
        element=driver.findElement(By.xpath("//*[text()='Get In Touch']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

    public void enterNameEmailSubjectAndMes(WebDriver driver, WebElement element,Actions actions)
    {
        element=driver.findElement(By.xpath("//input[@data-qa='name']"));
        actions=new Actions(driver);
        actions.click(element)
                .sendKeys("Metehan").sendKeys(Keys.TAB).sendKeys("mmetehanpolat@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("asdasdasdas").sendKeys(Keys.TAB).sendKeys("Thanks").
                perform();

    }
    public void uploadFile(WebDriver driver,WebElement webElement)
    {
        webElement=driver.findElement(By.xpath("//input[@name='upload_file']"));
        webElement.sendKeys("C:/Users/mmete/Desktop/Bos.png");
    }

    public void subimtButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();
        driver.switchTo().alert().accept();
    }
    public void SuccessMessage(WebDriver driver,WebElement element)
    {
        String a="Success! Your details have been submitted successfully.";

        element=driver.findElement(By.xpath("//*[text()='Success! Your details have been submitted successfully.']"));
        String b=element.getText();
        Assert.assertEquals(a,b);

    }
    public void bachHome(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
    }

}
