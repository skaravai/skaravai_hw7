package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FootwearPage extends AbstractPage {
    public FootwearPage() {
        super();
    }

    @FindBy(xpath = "(//*[@class='product product_type_catalog'])[4]")
    public WebElement product;

    @FindBy(xpath = "//*[contains(text(),' Женская обувь ')]")
    public WebElement womensFootwear;

    public void clickProduct() {
        product.click();
    }

    public void checkWomensFootwearPageIsDisplayed() {
        checkIsDisplayedPage(womensFootwear, "//*[contains(text(),' Женская обувь ')]");
    }
}
