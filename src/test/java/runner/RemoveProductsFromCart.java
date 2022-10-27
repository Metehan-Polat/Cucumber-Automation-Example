package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 14 Remove Products From Cart.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)


public class RemoveProductsFromCart extends AbstractTestNGCucumberTests {
}
