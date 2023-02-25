package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();



    @Given("user select currency list")
    public void userSelectCurrencylist() throws InterruptedException {
        Select item = new Select(homePage.currList);
        item.selectByIndex(0);
        Thread.sleep(2000);
    }

    @When("user select Euro currency")
    public void userSelectEuroCurrency() {
        homePage.curr.click();
    }

    @Then("user change the currencies successfully")
    public void userChangeTheCurrenciesSuccessfully() {
        for (int i =0 ; i<4;i++)
        {
            String actualtxt = homePage.eoru.get(i).getText();
            Assert.assertTrue(actualtxt.contains("€"));
        }

    }



}
