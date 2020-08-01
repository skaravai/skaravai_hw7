package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefs.BaseHooks;

public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage() {
        driver = BaseHooks.getDriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void checkIsDisplayedElement(WebElement element) {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions
                        .elementToBeClickable(element));
        Assert.assertTrue("This page is not displayed", element.isDisplayed());
    }

    public void checkIsDisplayedPage(WebElement element, String locator) {
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(locator)));
        Assert.assertTrue("This page is not displayed", element.isDisplayed());
    }
}
