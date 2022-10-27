package pom.VerifyAllProductsandproductdetailpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class VerifyAllProductsandProductDetailPage {
    public void verifyAllProducts(WebDriver driver, WebElement element)
    {
        String a="ALL PRODUCTS";
        element=driver.findElement(By.xpath("//*[text()='All Products']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }
    public void viewProductoffirstproduct(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();

    }

}
