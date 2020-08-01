package stepdefs;

import cucumber.api.java.en.And;
import pages.FootwearPage;

public class FootwearSteps {
    FootwearPage footwearPage = new FootwearPage();

    @And("^Footwear page is open$")
    public void checkFootwearPageIsDisplayed() {
        footwearPage.checkWomensFootwearPageIsDisplayed();
    }

    @And("^Choose product$")
    public void firstProductClicked() {
        footwearPage.clickProduct();
    }
}
