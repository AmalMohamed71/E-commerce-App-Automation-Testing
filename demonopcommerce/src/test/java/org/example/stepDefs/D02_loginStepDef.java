package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();
    @Given("user go to login page")
    public void loginpage()
    {
        login.loginLink.click();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithAnd(String email, String password) {
        login.email.sendKeys(email);
        login.password.sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginbutton.click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        //verify the url " https://demo.nopcommerce.com/"
        String link= Hooks.driver.getCurrentUrl();
        soft.assertEquals(link," https://demo.nopcommerce.com/");
        //verfiy "My account" tab isDisplayed
        soft.assertTrue(login.accountTap.isDisplayed());

        soft.assertAll();

    }

    @Given("user go to login-page")
    public void userGoToLoginPage() {
        login.loginLink.click();
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String email, String password) {
        login.email.sendKeys(email);
        login.password.sendKeys(password);
    }

    @And("user press on login-button")
    public void LoginButton() {
        login.loginbutton.click();
    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();

        //error message contains "Login was unsuccessful."
        soft.assertTrue(login.errormsg.getText().contains("Login was unsuccessful"));
        //the color of this message is red "#e4434b"
        soft.assertEquals(login.errormsg.getCssValue("color"),"rgba(228, 67, 75, 1");

        soft.assertAll();
    }
}
