package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @And("^Fill email field with value \"([^\"]*)\"$")
    public void fillEmailField(String email) {
        loginPage.enterEmail(email);
    }

    @And("^Fill password field with value \"([^\"]*)\"$")
    public void fillPasswordField(String pass) {
        loginPage.enterPassword(pass);
    }

    @And("^Enter Submit button$")
    public void enterSubmitBtn() {
        loginPage.enterSubmitBtn();
    }

    @Then("^The user's email is displayed$")
    public void checkEmail() {
        loginPage.checkSuccessLogin();
    }

    @Then("^Error message is displayed$")
    public void checkAuthError() {
        loginPage.checkLoginFailed();
    }
}
