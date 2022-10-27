package pom.removeProductsFromCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RemoveProductsFromCartPom {

    public void XButtonClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
    }

    public void verifyThatProductRemovedFromCart(WebDriver driver, WebElement element)
    {
        String a="Cart is empty!";
        element=driver.findElement(By.xpath("//b"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }
}
