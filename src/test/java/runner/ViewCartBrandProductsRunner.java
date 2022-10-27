package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 16 View Cart Brand Products.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)

public class ViewCartBrandProductsRunner extends AbstractTestNGCucumberTests {
}
