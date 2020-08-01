package stepdefs;

import cucumber.api.java.en.And;
import pages.ProductPage;

public class ProductSteps {
    ProductPage productPage = new ProductPage();

    @And("^Add product to Cart$")
    public void addProductToCart() {
        productPage.addToCartClick();
    }

    @And("^Add product to Favorite$")
    public void addProductToFavorite() {
        productPage.addFavoriteClick();
    }

    @And("^Product page is open$")
    public void checkProductPage() {
        productPage.checkProductPageIsDisplayed();
    }
}
