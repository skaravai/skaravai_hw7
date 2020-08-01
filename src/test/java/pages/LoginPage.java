package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    public LoginPage() {
        super();
    }

    @FindBy(css = "input[placeholder='Email']")
    public WebElement email;

    @FindBy(css = "input[placeholder='Пароль']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement enterBtn;

    @FindBy(xpath = "//*[contains(text(),' bmtstg@gmail.com ')]")
    public WebElement loginAuth;

    @FindBy(xpath = "//*[contains(text(),'Неверный логин или пароль')]")
    public WebElement loginError;

    public void enterEmail(String login) {
        email.sendKeys(login);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void enterSubmitBtn() {
        enterBtn.click();
    }

    public void checkSuccessLogin() {
        checkIsDisplayedPage(loginAuth, "//*[contains(text(),' bmtstg@gmail.com ')]");
    }

    public void checkLoginFailed() {
        checkIsDisplayedPage(loginError, "//*[contains(text(),'Неверный логин или пароль')]");
    }
}
