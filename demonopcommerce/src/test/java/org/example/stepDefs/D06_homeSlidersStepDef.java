package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("user go home page")
    public void gohomepage()
    {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @When("user select first slider")
    public void userSelectFirstSlider() {
        Select select = new Select(homePage.slider);
        select.selectByIndex(0);

    }

    @Then("the page of the product load successfully")
    public void thePageOfTheProductLoadSuccessfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(), " https://demo.nopcommerce.com/nokia-lumia-1020");

        soft.assertAll();
    }

    @Given("user go homepage")
    public void userGoHomepage() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @When("user select second slider")
    public void userSelectSecondSlider() {
        Select select = new Select(homePage.slider);
        select.selectByIndex(1);
    }

    @Then("page of the product load successfully")
    public void pageOfTheProductLoadSuccessfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");

        soft.assertAll();
    }
}
