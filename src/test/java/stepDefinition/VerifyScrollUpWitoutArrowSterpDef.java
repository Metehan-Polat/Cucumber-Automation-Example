package stepDefinition;

import io.cucumber.java.en.When;
import pom.base.Base;
import pom.js.JScr;

public class VerifyScrollUpWitoutArrowSterpDef extends Base {
    JScr jScr=new JScr();

    @When("Scroll up page to top")
    public void scrollUpPageToTop() {
    jScr.jsScrollTop(getDriver());
    }
}
