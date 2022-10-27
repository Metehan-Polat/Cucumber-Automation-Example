package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.base.Base;
import pom.removeProductsFromCart.RemoveProductsFromCartPom;

public class RemoveProductsFromCart extends Base {

    RemoveProductsFromCartPom removeProductsFromCartPom=new RemoveProductsFromCartPom();
    @When("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
    removeProductsFromCartPom.XButtonClick(getDriver());
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        removeProductsFromCartPom.verifyThatProductRemovedFromCart(getDriver(),getElement());
    }
}
