package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.base.Base;
import pom.logintoyouraccount.LoginToYourAccountCorrect;

public class LoginUserWithEmailandPasswordCorrectStepDefinition extends Base {

    LoginToYourAccountCorrect loginToYourAccount=new LoginToYourAccountCorrect();

    @Then("Verify Login to your account")
    public void verifyLoginToYourAccount() {
        loginToYourAccount.verifyLoginToYourAccount(getDriver(),getElement());
    }

    @And("Enter correct name and email address")
    public void enterCorrectNameAndEmailAddress() {
        loginToYourAccount.loginEmail(getDriver(),getElement());
        loginToYourAccount.loginPassword(getDriver(),getElement());
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginToYourAccount.loginButton(getDriver());
    }




}
