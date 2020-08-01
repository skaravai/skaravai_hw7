package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.MainPage;

public class MainSteps {
    MainPage mainPage = new MainPage();

    @Given("^Main page is open$")
    public void openPage() {
        mainPage.openPage();
    }

    @And("^PersonalAccount button clicked$")
    public void personalAccountButtonClicked() {
        mainPage.clickPersonalAreaBtn();
    }

    @And("^Choose footwear category$")
    public void footwearCategoryClicked() {
        mainPage.clickFootwearCategory();
    }

    @And("^Click on the Cart button$")
    public void cartBtnClick() {
        mainPage.cartBtnClicked();
    }

    @And("^Confirm geo-position$")
    public void geoBtnClick() {
        mainPage.geoConfirmationClicked();
    }

    @And("^Click on the language icon$")
    public void languageSelectorClick() {
        mainPage.changeLanguageClicked();
    }

    @And("^Choose English language$")
    public void changeLanguage() {
        mainPage.setEnglishLanguage();
    }

    @And("^Click on the Tax Free$")
    public void taxFreeClick() {
        mainPage.taxFreeClicked();
    }

    @And("^Click on the search button$")
    public void searchBtnClick() {
        mainPage.searchButtonClicked();
    }

    @And("^Enter Gucci brand in the field$")
    public void searchGucciBrand() {
        mainPage.fillSearchField();
    }

    @And("^Gucci page is open$")
    public void searchGucciTitle() {
        mainPage.findGucciTitle();
    }
}
