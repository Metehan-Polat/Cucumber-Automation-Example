package pom.addtocartfromRecommendeditems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddToCartfromRecommendedItems {

    public void verifyRecommendItems(WebDriver driver, WebElement element)
    {
        String a="RECOMMENDED ITEMS";
        element=driver.findElement(By.xpath("//*[text()='recommended items']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

    public void addToCartRecommendItems(WebDriver driver)
    {
         driver.findElement(By.xpath("//a[@data-product-id='5']"));

    }

    public void clickViewCart(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/view_cart']"));

    }
}
