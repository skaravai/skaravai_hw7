package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CartPage;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @And("^Cart page is opened$")
    public void checkCartPage() {
        cartPage.checkCartPageIsDisplayed();
    }

    @Then("^The selected product is in the cart$")
    public void checkAddedProduct() {
        cartPage.checkAddedProduct();
    }
}
