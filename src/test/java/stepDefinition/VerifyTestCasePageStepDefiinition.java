package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Click.ChooseClick;
import pom.Click.TestCasesClick;
import pom.TestCasesPage.TestCasesPage;
import pom.base.Base;

public class VerifyTestCasePageStepDefiinition extends Base {
    @When("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        ChooseClick chooseClick=new ChooseClick(new TestCasesClick());
        chooseClick.clickButtons(getDriver());
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        TestCasesPage testCasesPage=new TestCasesPage();
        testCasesPage.verifyUserNavigatedSuccessfully(getDriver(),getElement());
    }
}
