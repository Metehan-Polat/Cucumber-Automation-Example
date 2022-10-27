package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/feature/Test Case 1 RegisterUsers.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)




public class RegisterUserRunner extends AbstractTestNGCucumberTests {
}
