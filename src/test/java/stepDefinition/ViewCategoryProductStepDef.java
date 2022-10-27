package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ViewCategoryProduct.ViewCategoryProduct;
import pom.base.Base;

public class ViewCategoryProductStepDef extends Base {

    ViewCategoryProduct viewCategoryProduct=new ViewCategoryProduct();
    @And("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        viewCategoryProduct.verifyCategory(getDriver(),getElement());
    }

    @And("Click on Women category")
    public void clickOnWomenCategory() {
        viewCategoryProduct.clickOnWomen(getDriver());
    }

    @When("Click on any category link under Women category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        viewCategoryProduct.clickOnWomenCategory(getDriver());
    }

    @Then("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        viewCategoryProduct.verifyWomenTopsProducts(getDriver(),getElement());
    }

    @When("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        viewCategoryProduct.menClick(getDriver());
        viewCategoryProduct.tshirtClick(getDriver());
    }

    @Then("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        viewCategoryProduct.verifyMenProduct(getDriver(),getElement());
    }
}
