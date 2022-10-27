package pom.placeOrderRegisterwhileCheckout;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Assert;

public class RegisterwhileCheckout {

    public void cartPage(WebDriver driver, WebElement element)
    {
        String a="Shopping Cart";
        element=driver.findElement(By.xpath("//*[text()='Shopping Cart']"));
        String b=element.getText();
        Assert.assertEquals(a,b);

    }
    public void proceedToCheckoutClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();
    }

    public void registerLoginClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[text()='Register / Login']")).click();
    }

    public void textareaMessage(WebDriver driver,WebElement element)
    {

       driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Thanks");

    }
    public void placeOrderClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/payment']")).click();
    }
    public void enterPaymentDetailsNameOnCard(WebDriver driver)
    {
    driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("Metehan Polat");
    }
    public void enterCardNumber(WebDriver driver)
    {

        driver.findElement(By.xpath("//input[@data-qa='card-number']")).sendKeys("12354684686");
    }


    public void enterCVC(WebDriver driver)
    {

        driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("123");

    }
    public void enterExpirationDat(WebDriver driver, WebElement element, Actions actions)
    {
        element=driver.findElement(By.xpath("//input[@name='expiry_month']"));
        actions=new Actions(driver);
        actions.click(element).sendKeys("12").sendKeys(Keys.TAB).sendKeys("1995").perform();

    }
    public void payandConfirmOrder(WebDriver driver){
        driver.findElement(By.xpath("//*[text()='Pay and Confirm Order']")).click();
    }

    public void successMessage(WebDriver driver,WebElement element)
    {
        String a="Your order has been placed successfully!";
        element=driver.findElement(By.xpath("Your order has been placed successfully!"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }



}
