package pom.SearchProductsandVerifyCartAfterLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductsandVerifyCartAfterLogin {

    public void addthoseProductsCart(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/product_details/2']")).click();
    }
    public void addToCartClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
    }
}
