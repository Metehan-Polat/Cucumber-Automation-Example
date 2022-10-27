package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 13 Place Order Register while Checkout.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class PlaceOrderRegisterCheckoutRunner extends AbstractTestNGCucumberTests {
}
