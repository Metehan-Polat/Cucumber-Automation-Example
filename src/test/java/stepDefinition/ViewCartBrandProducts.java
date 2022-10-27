package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ViewCartBrandProducts.ViewCartBrandProductss;
import pom.base.Base;

public class ViewCartBrandProducts extends Base {
    ViewCartBrandProductss viewCartBrandProducts=new ViewCartBrandProductss();
    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        viewCartBrandProducts.verifyBrand(getDriver(),getElement());
    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() {
        viewCartBrandProducts.clickAnyBrand(getDriver(),getElement());
    }


    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        viewCartBrandProducts.clickAnyBrand(getDriver(),getElement());
    }

}
