package pom.ViewCartBrandProducts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class ViewCartBrandProductss{

    public void verifyBrand(WebDriver driver, WebElement element)
    {
        String a="BRANDS";
        element=driver.findElement(By.xpath("//*[text()='Brands']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

    public void clickAnyBrand(WebDriver driver,WebElement element)
    {
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='brands-name']"));
        Random rnd=new Random();
        int a=rnd.nextInt(list.size());
        element=list.get(a);
        element.click();
    }




}
