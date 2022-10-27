package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 10 Verify Subscription in Cart page.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class VerifySubscriptionInCartPageRunner extends AbstractTestNGCucumberTests {
}
