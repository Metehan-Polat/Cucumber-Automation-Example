package stepDefinition;

import io.cucumber.java.en.And;
import pom.Click.CartClick;
import pom.Click.ChooseClick;
import pom.Click.SigupLoginClick;
import pom.SearchProductsandVerifyCartAfterLogin.SearchProductsandVerifyCartAfterLogin;
import pom.base.Base;
import pom.logintoyouraccount.LoginToYourAccountCorrect;
import pom.newUserSigup.NewUserSigup;

public class SearchProductsVerifyCartLoginStepDef extends Base {

    SearchProductsandVerifyCartAfterLogin searchProductsandVerifyCartAfterLogin=new SearchProductsandVerifyCartAfterLogin();
    LoginToYourAccountCorrect loginToYourAccount=new LoginToYourAccountCorrect();
    @And("Add those products to cart")
    public void addThoseProductsToCart() {

    searchProductsandVerifyCartAfterLogin.addthoseProductsCart(getDriver());
    }

    @And("Click Cart button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() {
        searchProductsandVerifyCartAfterLogin.addToCartClick(getDriver());
    }

    @And("Click Signup Login button and submit login details")
    public void clickSignupLoginButtonAndSubmitLoginDetails() {
        ChooseClick chooseClick=new ChooseClick(new SigupLoginClick());
        chooseClick.clickButtons(getDriver());
        loginToYourAccount.loginEmail(getDriver(),getElement());
        loginToYourAccount.loginPassword(getDriver(),getElement());
    }

    @And("Again, go to Cart page")
    public void againGoToCartPage() {
        ChooseClick chooseClick=new ChooseClick(new CartClick());
        chooseClick.clickButtons(getDriver());

    }

}
