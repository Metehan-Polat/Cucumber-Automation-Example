package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.AddProductsInCart.AddProductsInCart;
import pom.base.Base;

public class AddProductsInCartStepDef extends Base {

    AddProductsInCart addProductsInCart=new AddProductsInCart();
    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        addProductsInCart.hoverOverFirstProductAndClickAddToCart(getDriver());
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        addProductsInCart.clickContinueShoppingButton(getDriver());
    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        addProductsInCart.hoverOverSecondProductAndClickAddToCart(getDriver());
    }
    @When("Click View Cart button")
    public void clickViewCartButton() {
        addProductsInCart.clickViewCartButton(getDriver());
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        addProductsInCart.verifyBothProductsAreAddedToCart(getDriver(),getElement());
    }

    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        addProductsInCart.verifyTheirPricesQuantityAndTotalPrice(getElement(),getDriver());
    }


}
