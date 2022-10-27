package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.base.Base;
import pom.newUserSigup.NewUserSigup;
import pom.placeOrderRegisterwhileCheckout.RegisterwhileCheckout;

public class PlaceOrderRegisterwhileCheckout extends Base {

    RegisterwhileCheckout registerwhileCheckout=new RegisterwhileCheckout();
    NewUserSigup newUserSigup=new NewUserSigup();

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        registerwhileCheckout.cartPage(getDriver(),getElement());
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        registerwhileCheckout.proceedToCheckoutClick(getDriver());
    }

    @And("Click Register Login button")
    public void clickRegisterLoginButton() {
        registerwhileCheckout.registerLoginClick(getDriver());

    }

    @When("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
        newUserSigup.sigUpName(getDriver(),getElement());
        newUserSigup.sigUpEmail(getDriver(),getElement());
        newUserSigup.sigUpButton(getDriver());
        newUserSigup.fiilDetails(getDriver(),getElement(),getActions(), getSelect());
        newUserSigup.createAccountButton(getDriver());

    }

    @Then("Verify ACCOUNT CREATED and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        newUserSigup.VerifyAccountCreated(getDriver(),getElement());
        newUserSigup.continueButton(getDriver());
    }


    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        registerwhileCheckout.textareaMessage(getDriver(),getElement());
        registerwhileCheckout.placeOrderClick(getDriver());
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        registerwhileCheckout.enterPaymentDetailsNameOnCard(getDriver());
        registerwhileCheckout.enterCardNumber(getDriver());
        registerwhileCheckout.enterCVC(getDriver());
        registerwhileCheckout.enterExpirationDat(getDriver(),getElement(),getActions());
    }

    @When("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        registerwhileCheckout.payandConfirmOrder(getDriver());
    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        registerwhileCheckout.successMessage(getDriver(),getElement());
    }
}
