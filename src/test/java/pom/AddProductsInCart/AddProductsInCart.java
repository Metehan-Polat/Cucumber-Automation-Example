package pom.AddProductsInCart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

public class AddProductsInCart
{

    public void hoverOverFirstProductAndClickAddToCart(WebDriver driver) {
        driver.findElement(By.xpath("//a[@data-product-id='1']")).click();
    }


    public void clickContinueShoppingButton(WebDriver driver) {
        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
    }


    public void hoverOverSecondProductAndClickAddToCart(WebDriver driver) {

        driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
    }

    public void clickViewCartButton(WebDriver driver) {

        driver.findElement(By.xpath("//*[text()='View Cart']")).click();
    }


    public void verifyBothProductsAreAddedToCart(WebDriver driver,WebElement element) {

       element=driver.findElement(By.xpath("//tr[@id='product-1']"));
       String a=element.getText();
       element=driver.findElement(By.xpath("//tr[@id='product-2']"));
       String b=element.getText();
       System.out.println(a);
       System.out.println(b);

    }


    public void verifyTheirPricesQuantityAndTotalPrice(WebElement element,WebDriver driver) {
        List<WebElement> price=driver.findElements(By.xpath("//td[@class='cart_price']"));
        List<String> a = null;
        for (int i=0; i<price.size();i++){
        a= Collections.singletonList(price.get(i).getText());
        }
        System.out.println(a);

    }



}
