package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 19 Add to cart from Recommended items.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class AddToCartFromRecommendedItemsRunner extends AbstractTestNGCucumberTests {
}
