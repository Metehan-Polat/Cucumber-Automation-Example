package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.VerifyProductQuantityInCart.VerifyProductQuantityInCart;
import pom.base.Base;

public class VerifyProductQuantityInCartStepDef extends Base {

    VerifyProductQuantityInCart verifyProductQuantityInCart=new VerifyProductQuantityInCart();
    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        verifyProductQuantityInCart.randomViewProduct(getDriver(),getElement());
    }

    @And("Increase quantity to four")
    public void ıncreaseQuantityTo() {
        verifyProductQuantityInCart.ıncreaseQuantityToFour(getDriver(),getElement());
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        verifyProductQuantityInCart.addToCart(getDriver());

    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        verifyProductQuantityInCart.verifyProductDisplayedInCartPageExact(getDriver(),getElement());
    }
}
