package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.VerifySubscriptioninHomePage.VerifySubscriptioninHomePage;
import pom.base.Base;
import pom.js.JScr;

public class VerifySubscriptioninHomePageStepDefinition extends Base {

    VerifySubscriptioninHomePage verifySubscriptioninHomePage=new VerifySubscriptioninHomePage();
    @When("Scroll down to footer")
    public void scrollDownToFooter() {
        JScr jScr=new JScr();
        jScr.jsScrollHeight(getDriver());

    }

    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        verifySubscriptioninHomePage.verifySub(getDriver(),getElement());
    }

    @When("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        verifySubscriptioninHomePage.subscribeEmail(getDriver(),getElement());
        verifySubscriptioninHomePage.clickArrowButton(getDriver());
    }

    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        verifySubscriptioninHomePage.successMessage(getDriver(),getElement());
    }
}
