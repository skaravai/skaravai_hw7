package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {
    public CartPage() {
        super();
    }

    WebElement numberOfProducts = driver.findElement(By.xpath("//span[@class='sticky-header-title__count']"));

    @FindBy(xpath = "(//*[contains(text(),'Итого')])[2]")
    WebElement cartPage;

    public void checkAddedProduct() {
        Assert.assertEquals("The product has not been added to the cart", "(1)", numberOfProducts.getText());
    }

    public void checkCartPageIsDisplayed() {
        checkIsDisplayedPage(cartPage, "(//*[contains(text(),'Итого')])[2]");
    }
}
