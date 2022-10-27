package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Click.ChooseClick;
import pom.Click.ProductsClick;
import pom.VerifyAllProductsandproductdetailpage.VerifyAllProductsandProductDetailPage;
import pom.base.Base;

public class VeriftAllProductsDetailpageStepdefs extends Base {


    VerifyAllProductsandProductDetailPage verifyAllProductsandProductDetailPage=new VerifyAllProductsandProductDetailPage();

    @When("Click on Products button")
    public void clickOnProductsButton() {
        ChooseClick chooseClick=new ChooseClick(new ProductsClick());
        chooseClick.clickButtons(getDriver());
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        verifyAllProductsandProductDetailPage.verifyAllProducts(getDriver(),getElement());
    }


    @And("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        verifyAllProductsandProductDetailPage.viewProductoffirstproduct(getDriver());
    }


}
