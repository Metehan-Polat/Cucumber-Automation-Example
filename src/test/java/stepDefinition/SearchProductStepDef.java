package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.SearchProduct.SearchProduct;
import pom.base.Base;
import pom.js.JScr;

public class SearchProductStepDef extends Base {

    SearchProduct searchProduct=new SearchProduct();

    @When("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {

        searchProduct.inputAndClickButton(getDriver(),getElement());

    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {

        searchProduct.verifySEARCHEDPRODUCTS(getDriver(),getElement());

    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        searchProduct.releatedtoSearch(getDriver(),getElement());
    }
}
