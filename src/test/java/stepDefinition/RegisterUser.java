package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.base.Base;
import pom.Click.ChooseClick;
import pom.Click.SigupLoginClick;
import pom.newUserSigup.NewUserSigup;
import pom.url.GetUrl;

public class RegisterUser extends Base {

    NewUserSigup newUserSigup=new NewUserSigup();
    @Given("Navigate to {string}")
    public void navigateTo(String arg0) {
        this.driver(arg0);
    }

    @And("Navigate to Url")
    public void navigateToUrl() {
        GetUrl getUrl=new GetUrl();
        getUrl.url(getDriver());
    }

    @When("Click on Signup Login button")
    public void clickOnSignupLoginButton() {

        ChooseClick chooseClick=new ChooseClick(new SigupLoginClick());
        chooseClick.clickButtons(getDriver());

    }

    @Then("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {
        newUserSigup.verifyNewUserSigup(getDriver(),getElement());
    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        newUserSigup.sigUpName(getDriver(),getElement());
        newUserSigup.sigUpEmail(getDriver(),getElement());
    }

    @When("Click Signup button")
    public void clickSignupButton() {
        newUserSigup.sigUpButton(getDriver());
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        newUserSigup.VerifyEnterAccountInformation(getDriver(),getElement());
    }

    @And("Fill details Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        newUserSigup.fiilDetails(getDriver(),getElement(),getActions(),getSelect());
    }

    @When("Click Create Account button")
    public void clickCreateAccountButton() {
        newUserSigup.createAccountButton(getDriver());
    }

    @Then("Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        newUserSigup.VerifyAccountCreated(getDriver(),getElement());
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        newUserSigup.continueButton(getDriver());
    }


    @And("Logout")
    public void logout() {
        newUserSigup.logOut(getDriver());
    }

    @And("Close")
    public void close() {
        quitMethod();
    }
}
