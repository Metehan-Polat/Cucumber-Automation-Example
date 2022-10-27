package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 15 View Category Products.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)


public class ViewCategoryProductsRunner extends AbstractTestNGCucumberTests {

}
