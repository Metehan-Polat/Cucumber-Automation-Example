package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/feature/Test Case 6 Verify Test Cases Page.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)


public class VerifyTestCasePageRunner extends AbstractTestNGCucumberTests {
}
