package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/feature/Test Case 4 Register User with existing email.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)




public class RegisterUserWithExistingEmailRunner extends AbstractTestNGCucumberTests {
}

