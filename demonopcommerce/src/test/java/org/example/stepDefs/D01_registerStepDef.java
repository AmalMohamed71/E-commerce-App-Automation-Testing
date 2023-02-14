package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register register = new P01_register();
    @Given("user go to register page")
    public void registerpage()
    {
        register.registerLink.click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.female.click();
    }

    @And("user enter firstname {string} and lastname {string}")
    public void userEnterAnd(String firstN, String lastN)
    {
        register.firstname.sendKeys(firstN);
        register.lastname.sendKeys(lastN);
    }

    @And("user select date of birth")
    public void userSelectDateOfBirth() {
        Select selectDay = new Select(register.dayofbirth);
        selectDay.selectByValue("8");

        Select selectMonth = new Select(register.manthofbirth);
        selectMonth.selectByValue("12");

        Select selectYear = new Select(register.yearofbirth);
        selectYear.selectByValue("1998");
    }

    @And("user enter email")
    public void userEnter() {
        Faker fakeEmail = new Faker();

        register.email.sendKeys(fakeEmail.internet().safeEmailAddress());
    }

    @And("user enter password {string} and confirm {string}")
    public void userEnterPasswordAndConfirm(String password) {
        register.password.sendKeys(password);
        register.confirmpassword.sendKeys(password);
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.registerbutton.click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(register.successmsg.getText().contains(" registration completed"));

        String actualcolor = register.successmsg.getCssValue("color");
        soft.assertEquals(actualcolor,"rgba(76, 177, 124, 1)");


        soft.assertAll();
    }

}
