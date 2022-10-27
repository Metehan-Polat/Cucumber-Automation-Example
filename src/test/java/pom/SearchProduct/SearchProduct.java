package pom.SearchProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.base.Base;
import pom.js.JScr;

public class SearchProduct  extends Base {

    JScr jScr=new JScr();

    public void inputAndClickButton(WebDriver driver, WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@id='search_product']"));
        element.sendKeys("Men Tshirt");

        driver.findElement(By.xpath("//button[@id='submit_search']")).click();

    }
    public void verifySEARCHEDPRODUCTS(WebDriver driver,WebElement element)
    {
        String a="SEARCHED PRODUCTS";
        element=driver.findElement(By.xpath("//*[text()='Searched Products']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

    public void   releatedtoSearch(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@id='search_product']"));

        jScr.jsScrollElement(driver,element);
        String a=element.getText();

        element=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/p"));
        String b=element.getText();


        Assert.assertEquals(a,b);

    }

}
