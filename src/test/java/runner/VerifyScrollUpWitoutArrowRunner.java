package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 21 Verify Scroll Up without Arrow button and Scroll Down functionality.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class VerifyScrollUpWitoutArrowRunner extends AbstractTestNGCucumberTests {
}
