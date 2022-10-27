package pom.TestCasesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestCasesPage {
    public void verifyUserNavigatedSuccessfully(WebDriver driver, WebElement element)
    {
        String a="TEST CASES";
        element=driver.findElement(By.xpath("//b"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }
}
