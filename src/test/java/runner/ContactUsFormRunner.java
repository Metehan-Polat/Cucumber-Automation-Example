package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/feature/Test Case 5 Contact Us Form.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)




public class ContactUsFormRunner extends AbstractTestNGCucumberTests {
}
