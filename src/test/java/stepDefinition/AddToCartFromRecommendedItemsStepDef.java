package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.addtocartfromRecommendeditems.AddToCartfromRecommendedItems;
import pom.base.Base;
import pom.js.JScr;

public class AddToCartFromRecommendedItemsStepDef extends Base {

    AddToCartfromRecommendedItems addToCartfromRecommendedItems=new AddToCartfromRecommendedItems();
    @When("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        JScr jScr=new JScr();
        jScr.jsScrollHeight(getDriver());
    }

    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        addToCartfromRecommendedItems.verifyRecommendItems(getDriver(),getElement());
    }

    @And("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        addToCartfromRecommendedItems.addToCartRecommendItems(getDriver());
    }

    @And("Click on View Cart button")
    public void clickOnViewCartButton() {
    addToCartfromRecommendedItems.clickViewCart(getDriver());
    }


}
