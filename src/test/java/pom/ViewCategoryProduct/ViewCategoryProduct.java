package pom.ViewCategoryProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ViewCategoryProduct {

    public void verifyCategory(WebDriver driver, WebElement element)
    {
        String a="CATEGORY";
        element=driver.findElement(By.xpath("//*[text()='Category']"));
        String b=element.getText();
        Assert.assertEquals(a,b);

    }
    public void clickOnWomen(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='#Women']")).click();
    }
    public void clickOnWomenCategory(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/category_products/1']")).click();
    }
    public void verifyWomenTopsProducts(WebDriver driver,WebElement element)
    {
        String a="WOMEN - DRESS PRODUCTS";
        element=driver.findElement(By.xpath("//*[text()='Women - Dress Products']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

    public void menClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='#Men']")).click();
    }
    public void tshirtClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/category_products/3']")).click();
    }

    public void verifyMenProduct(WebDriver driver,WebElement element)
    {
        String a="MEN - TSHIRTS PRODUCTS";
        element=driver.findElement(By.xpath("//*[text()='Men - Tshirts Products']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }
}
