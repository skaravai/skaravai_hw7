package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends AbstractPage {

    @FindBy(css = "a[href='/login/']")
    public WebElement personalArea;

    @FindBy(xpath = "(//*[contains(text(),'Обувь')])[1]")
    public WebElement shoes;

    @FindBy(css = "a[title='Корзина']")
    public WebElement cart;

    @FindBy(css = "button[theme='quite-black']")
    public WebElement geoConfirmBtn;

    @FindBy(css = "div[class='language-selector']")
    public WebElement languageSelector;

    @FindBy(css = "a[href='/english/']")
    public WebElement englishLanguage;

    @FindBy(css = "a[href='taxfree.php']")
    public WebElement taxFree;

    @FindBy(css = "div[class='search__input']")
    public WebElement searchBtn;

    @FindBy(css = "input[name='q']")
    public WebElement searchField;

    @FindBy(xpath = "//span[@title='Gucci']")
    public WebElement gucciTitle;

    public MainPage() {
        super();
    }

    public void clickPersonalAreaBtn() {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.cssSelector("a[href='/login/']")));
        personalArea.click();
    }

    public void clickFootwearCategory() {
        shoes.click();
    }

    public void openPage() {
        driver.get("https://www.tsum.ru/");
    }

    public void cartBtnClicked() {
        cart.click();
    }

    public void geoConfirmationClicked() {
        geoConfirmBtn.click();
    }

    public void changeLanguageClicked() {
        languageSelector.click();
    }

    public void setEnglishLanguage() {
        englishLanguage.click();
    }

    public void taxFreeClicked() {
        taxFree.click();
    }

    public void searchButtonClicked() {
        searchBtn.click();
    }

    public void fillSearchField() {
        searchField.sendKeys("gucci", Keys.RETURN);
    }

    public void findGucciTitle() {
        checkIsDisplayedPage(gucciTitle, "//span[@title='Gucci']");
    }

}
