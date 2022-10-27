package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 18 Add review on product.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)

public class AddRewviewProductRunner extends AbstractTestNGCucumberTests {
}
