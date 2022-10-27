package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 11 Add Products in Cart.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class AddProductsInCartRunner extends AbstractTestNGCucumberTests {
}
