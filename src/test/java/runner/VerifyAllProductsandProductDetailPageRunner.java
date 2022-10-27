package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/feature/Test Case 7 Verify All Products and product detail page.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)

public class VerifyAllProductsandProductDetailPageRunner extends AbstractTestNGCucumberTests {
}
