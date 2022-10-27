package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Click.ChooseClick;
import pom.Click.ContactUsClick;
import pom.base.Base;
import pom.contactUS.ContactUS;

public class ContactUsFormStepDefinition extends Base {

    ContactUS contactUS=new ContactUS();
    @When("Click on Contact Us button")
    public void clickOnContactUsButton() {
        ChooseClick chooseClick=new ChooseClick(new ContactUsClick());
        chooseClick.clickButtons(getDriver());

    }

    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        contactUS.verifiyGetInTouchMessage(getDriver(),getElement());
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        contactUS.enterNameEmailSubjectAndMes(getDriver(),getElement(),getActions());
    }

    @And("Upload file")
    public void uploadFile() {
        contactUS.uploadFile(getDriver(),getElement());
    }

    @When("Click Submit button")
    public void clickSubmitButton() {
        contactUS.subimtButton(getDriver());
    }

    @Then("Verify success message Success! Your details have been submitted successfully is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        contactUS.SuccessMessage(getDriver(),getElement());
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactUS.bachHome(getDriver());
    }
}
