package stepDefinition;

import io.cucumber.java.en.And;
import pom.base.Base;
import pom.logintoyouraccount.LoginToYourAccountIncorrect;

public class LoginUserWithEmailandPasswordIncorrectStepDefinition extends Base {


    LoginToYourAccountIncorrect loginToYourAccountIncorrect=new LoginToYourAccountIncorrect();
    @And("Enter incorrect name and email address")
    public void enterIncorrectNameAndEmailAddress() {
        loginToYourAccountIncorrect.loginIncorrectEmail(getDriver(),getElement());
        loginToYourAccountIncorrect.loginIncorrectEmail(getDriver(),getElement());
    }

    @And("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        loginToYourAccountIncorrect.yourEmailorPasswordisIncorrectMessage(getDriver(),getElement());
    }
}
