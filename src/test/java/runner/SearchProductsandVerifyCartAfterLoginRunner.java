package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 17 Search Products and Verify Cart After Login.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)

public class SearchProductsandVerifyCartAfterLoginRunner extends AbstractTestNGCucumberTests {
}
