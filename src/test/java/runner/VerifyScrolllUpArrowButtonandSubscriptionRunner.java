package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 20 Verify Scroll Up using Arrow button and Scroll Down functionality.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class VerifyScrolllUpArrowButtonandSubscriptionRunner extends AbstractTestNGCucumberTests {
}
