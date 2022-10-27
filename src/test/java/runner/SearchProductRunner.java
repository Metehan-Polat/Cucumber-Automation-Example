package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/feature/Test Case  8 Search Product.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class SearchProductRunner extends AbstractTestNGCucumberTests {
}
