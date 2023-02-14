package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();

    @Given("user go to home page")
    public void homePage()
    {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @When("user select {string} currency")
    public void userSelectCurrency(String currency) {
        homePage.currList.
        
    }

    @Then("user change the currencies successfully")
    public void userChangeTheCurrenciesSuccessfully() {

    }
}
