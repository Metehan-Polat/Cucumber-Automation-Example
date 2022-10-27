package stepDefinition;

import io.cucumber.java.en.And;
import pom.Click.CartClick;
import pom.Click.ChooseClick;
import pom.base.Base;

public class VerifySubscriptionInCartPageStepDef extends Base {
    @And("Click on Cart Button")
    public void clickOnCartButton() {
        ChooseClick click=new ChooseClick(new CartClick());
        click.clickButtons(getDriver());
    }
}
