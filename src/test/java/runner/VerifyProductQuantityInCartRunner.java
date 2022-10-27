package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 12 Verify Product quantity in Cart.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class VerifyProductQuantityInCartRunner extends AbstractTestNGCucumberTests {
}
