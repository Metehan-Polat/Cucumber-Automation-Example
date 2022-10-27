package pom.VerifyProductQuantityInCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class VerifyProductQuantityInCart {

    //findElements ler içerisinde rastgele element seçip o element üzerinde işlem yapma
    public void randomViewProduct(WebDriver driver, WebElement element)
    {
       List<WebElement> list= driver.findElements(By.xpath("//*[text()='View Product']")); //viewProduct ların tamamı çağırılır
        Random rnd=new Random();
        int a=rnd.nextInt(list.size()); //gelen view product sayısına göre rastgele numara secilir

        element=list.get(a); //secilen sayıya hangi list elemanı denk geliyorsa o element çağırılır
        element.click(); //çağırılan elemebt click edilir

    }
    public void ıncreaseQuantityToFour(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@id='quantity']"));
        element.click();
        element.clear();
        element.sendKeys("4");

    }


    public void addToCart(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
    }

    public void viewCartClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
    }
    public void verifyProductDisplayedInCartPageExact(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//button[@class='disabled']"));
        String a= element.getText();
        String b= "4";
        Assert.assertEquals(a,b);

    }
}
