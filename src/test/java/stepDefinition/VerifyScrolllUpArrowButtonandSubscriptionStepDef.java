package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.VerifyScrolllUpArrowButtonandSubscription.VerifyScrolllUpArrowButtonandSubscription;
import pom.base.Base;
import pom.js.JScr;

public class VerifyScrolllUpArrowButtonandSubscriptionStepDef extends Base {

    VerifyScrolllUpArrowButtonandSubscription verifyScrolllUpArrowButtonandSubscription=new VerifyScrolllUpArrowButtonandSubscription();
    @When("Scroll down page to bottom Subscription")
    public void scrollDownPageToBottomSubscription() {
        verifyScrolllUpArrowButtonandSubscription.subscriptionHomePage(getDriver(),getElement());
    }

    @Then("Verify SUBSCRIPTION is visible")
    public void verifySUBSCRIPTIONIsVisible() throws InterruptedException {
    verifyScrolllUpArrowButtonandSubscription.subspriptionMlessage(getDriver(),getElement());
    }

    @When("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {
        verifyScrolllUpArrowButtonandSubscription.moveUpwardClick(getDriver());
    }

    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        verifyScrolllUpArrowButtonandSubscription.scrolledmMessage(getDriver(),getElement());
    }
}
