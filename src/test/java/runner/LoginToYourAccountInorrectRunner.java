package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/feature/Test Case 3 Login User with incorrect email and password.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)




public class LoginToYourAccountInorrectRunner extends AbstractTestNGCucumberTests {
}

