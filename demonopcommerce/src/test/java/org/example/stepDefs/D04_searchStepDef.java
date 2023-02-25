package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {

    P03_homePage homePage = new P03_homePage();
@Given("user go to home-page")
    public void homepage()
{
    Hooks.driver.get("https://demo.nopcommerce.com/");
}

    @When("user enter product <name> {string}")
    public void userEnterProductName(String name) {
         homePage.searchbox.sendKeys(name);
    }

    @And("search results appear")
    public void searchResultsAppear() {
        SoftAssert soft = new SoftAssert();

        for (int i=0 ; i<homePage.searchlist.size();i++)
        {
            soft.assertTrue(homePage.searchlist.contains(homePage.searchbox.getText().toLowerCase()));
        }
         soft.assertAll();
    }

    @And("user click on search-button")
    public void userClickOnSearchButton() {
        homePage.searchbutton.click();
    }

    @Then("result page load successfully")
    public void resultPageLoadSuccessfully() {

        SoftAssert soft = new SoftAssert();

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));

        for (int i=0 ; i<homePage.searchlist.size();i++)
        {
            soft.assertTrue(homePage.searchlist.contains(homePage.searchbox.getText().toLowerCase()));
        }
    soft.assertAll();
}

    @Given("User select search box")
    public void userSelectSearchBox() {
        Select select = new Select(homePage.searchbox);
    }

    @When("user enter product <SKU> {string}")
    public void userEnterProductSKU(String sku) {
    homePage.searchbox.sendKeys(sku);
    }


    @And("user click on the product in search result")
    public void userClickOnTheProductInSearchResult() {
    homePage.chooseelement.click();
    }


    @Then("result-page load successfully")
    public void result_PageLoadSuccessfully() {

    Assert.assertTrue(homePage.sku.isDisplayed());
    Assert.assertTrue(homePage.sku.getText().contains(homePage.searchbox.getText()));

    }


}
