package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.AddreviewonProduct.AddReviewonProduct;
import pom.base.Base;

public class AddreviewonProductStepDef extends Base {
    AddReviewonProduct addReviewonProduct=new AddReviewonProduct();
    @Then("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        addReviewonProduct.VerifyWriteYourReviewVisible(getDriver(),getElement());
    }

    @And("Enter name, email and review")
    public void enterNameEmailAndReview() {
        addReviewonProduct.enterName(getDriver(),getElement());
        addReviewonProduct.enterEmail(getDriver(),getElement());
        addReviewonProduct.review(getDriver(),getElement());
    }

    @When("Submit button CLick")
    public void submitButtonCLick() {
        addReviewonProduct.submitClick(getDriver());
    }
    @Then("Verify success message Thank you for your review")
    public void verifySuccessMessageThankYouForYourReview() {
        addReviewonProduct.messageThankYou(getDriver(),getElement());
    }


}
