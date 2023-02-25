package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {

    P03_homePage homePage = new P03_homePage();
    @Given("get homepage")
    public void goToHttpsDemoNopcommerceCom() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @When("user click on wishlist button")
    public void userClickOnWishlistButton() {
        Select select = new Select(homePage.icon);
        select.selectByIndex(2);
    }

    @Then("success message appear")
    public void successMessageAppear() {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(homePage.smsg.isDisplayed());

        String actualcolor = homePage.smsg.getCssValue("background-color");
        soft.assertEquals(actualcolor,"rgba(75, 176, 122, 1)");

        soft.assertAll();
    }

    @Given("navigate to homepage")
    public void navigateToHomepage() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @When("user click-on wishlist button")
    public void userClickWishlistButton() {
        Select select = new Select(homePage.icon);
        select.selectByIndex(2);
    }

    @And("user click on wishlist tab")
    public void userClickOnWishlistTab() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(homePage.smsg));

        homePage.wishlist.click();
    }

    @Then("wishlist has the products that was added")
    public void wishlistHasTheProductsThatWasAdded() {
        SoftAssert soft = new SoftAssert();

        soft.assertNotEquals(homePage.qty.getText(),0);

        soft.assertAll();
    }
}
