package pom.newUserSigup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class NewUserSigup {

    public void verifyNewUserSigup(WebDriver driver, WebElement webElement)

    {
        String a="New User Signup!";
        webElement=driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        String b=webElement.getText();
        Assert.assertEquals(a,b);


    }
    public void sigUpName(WebDriver driver,WebElement webElement)
    {
        webElement=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        webElement.sendKeys("Metehan Polat");
    }
    public void sigUpEmail(WebDriver driver,WebElement webElement)
    {
        webElement=driver.findElement(By.xpath("//input[@ data-qa='signup-email']"));
        webElement.sendKeys("mmetehan"+Math.random()+"@gmail.com");
    }
    public void sigUpButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }


    public void VerifyEnterAccountInformation(WebDriver driver, WebElement element)
    {   String a="ENTER ACCOUNT INFORMATION";
        element=driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        String b= element.getText();
        Assert.assertEquals(a,b);
    }

    public void fiilDetails(WebDriver driver,WebElement webElement,Actions actions,Select select)
    {
        webElement=driver.findElement(By.xpath("//input[@id='id_gender1']"));
        actions=new Actions(driver);
        actions.click(webElement)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys("Mm189..").perform();

        webElement=driver.findElement(By.xpath("//select[@id='days']"));
        select=new Select(webElement);
        select.selectByValue("26");

        webElement=driver.findElement(By.xpath("//select[@id='months']"));
        select=new Select(webElement);
        select.selectByValue("12");

        webElement=driver.findElement(By.xpath("//select[@id='years']"));
        select=new Select(webElement);
        select.selectByValue("1996");

        driver.findElement(By.xpath("//input[@name='newsletter']")).click();
        driver.findElement(By.xpath("//input[@name='optin']")).click();

        webElement=driver.findElement(By.xpath("//input[@data-qa='first_name']"));
        actions=new Actions(driver);
        actions.click(webElement)
                .sendKeys("Metehan")
                .sendKeys(Keys.TAB)
                .sendKeys("Polat")
                .sendKeys(Keys.TAB)
                .sendKeys("Polat")
                .sendKeys(Keys.TAB)
                .sendKeys("Sivas")
                .sendKeys(Keys.TAB)
                .sendKeys("Kayseri")
                .sendKeys(Keys.TAB)
                .sendKeys("India")
                .sendKeys(Keys.TAB)
                .sendKeys("Turkiye")
                .sendKeys(Keys.TAB)
                .sendKeys("Sivas")
                .sendKeys(Keys.TAB)
                .sendKeys("38110")
                .sendKeys(Keys.TAB)
                .sendKeys("5384658952").perform();

    }
    public void createAccountButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
    }

    public void VerifyAccountCreated(WebDriver driver,WebElement element)
    {
        String a="ACCOUNT CREATED!";
        element=driver.findElement(By.xpath("//b"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

    public void continueButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
    }

    public void logOut(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/logout']")).click();
    }

}
