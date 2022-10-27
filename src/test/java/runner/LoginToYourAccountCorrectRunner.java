package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/feature/Test Case 2 Login User with correct email and password.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)




public class LoginToYourAccountCorrectRunner extends AbstractTestNGCucumberTests {
}

