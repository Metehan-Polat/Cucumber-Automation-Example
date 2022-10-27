package stepDefinition;

import io.cucumber.java.en.And;
import pom.base.Base;
import pom.logintoyouraccount.LoginToYourAccountCorrect;
import pom.newUserSigup.NewUserSigup;
import pom.newUserSigupRegisterExisting.RegisterUserWithExistingEmail;

public class RegisterUserExistingEmailStep extends Base {

    RegisterUserWithExistingEmail registerUserWithExistingEmail=new RegisterUserWithExistingEmail();
    NewUserSigup newUserSigup=new NewUserSigup();
    @And("Enter name and already email address")
    public void enterNameAndAlreadyEmailAddress() {
        newUserSigup.sigUpName(getDriver(),getElement());
        registerUserWithExistingEmail.alreadyRegisteredEmailAddress(getDriver(),getElement());
    }

    @And("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        registerUserWithExistingEmail.emailAddressAlreadyExistMessage(getDriver(),getElement());
    }
}
