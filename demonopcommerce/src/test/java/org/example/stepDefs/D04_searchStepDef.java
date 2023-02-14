package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D04_searchStepDef {

    P03_homePage homePage = new P03_homePage();
@Given("user go to home-page")
    public void homepage()
{
    Hooks.driver.get("https://demo.nopcommerce.com/");
}

    @When("user enter product name {string}")
    public void userEnterProductName(String name) {
         homePage.searchbox.sendKeys(name);
    }

    @And("search results list appear")
    public void searchResultsListAppear() {
    homePage.searchlist.findElements(By.id("ui-id-1")).size();
    }

    @And("user click on search-button")
    public void userClickOnSearchButton() {
        homePage.searchbox.click();
    }

    @Then("result page load successfully")
    public void resultPageLoadSuccessfully() {

}

    @Given("user go to home_page")
    public void userGoToHome_page() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @When("user select search_bar")
    public void userSelectSearch_bar() {

    }

    @And("user enter  serial number of the product")
    public void userEnterSerialNumberOfTheProduct() {

    }

    @And("user click on search_button")
    public void userClickOnSearch_button() {

}



}
