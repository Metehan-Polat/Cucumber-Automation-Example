package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Test Case 9 Verify Subscription im home page.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)

public class VerifySubscriptioninHomePageRunner extends AbstractTestNGCucumberTests {



}



