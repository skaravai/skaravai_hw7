package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {
    public ProductPage() {
        super();
    }

    @FindBy(xpath = "//*[contains(text(),' Добавить в корзину ')]")
    WebElement addToCart;

    @FindBy(xpath = "//*[contains(text(),' В избранное ')]")
    WebElement addFavorite;

    @FindBy(xpath = "//section[@class='item__top']")
    WebElement productPage;


    public void addToCartClick() {
        checkIsDisplayedElement(addToCart);
        addToCart.click();
    }

    public void addFavoriteClick() {
        addFavorite.click();
    }

    public void checkProductPageIsDisplayed() {
        checkIsDisplayedPage(productPage, "//section[@class='item__top']");
    }
}
