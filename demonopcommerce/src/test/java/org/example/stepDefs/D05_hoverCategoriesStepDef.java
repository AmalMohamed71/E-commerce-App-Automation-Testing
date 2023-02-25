package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;


public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("user go to homepage")
    public void go_to_homepage()
    {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }
    String randomitemtxt;
    String selecteditemtxt;
    @When("user hover on a category")
    public void userHoverOnACategory() throws InterruptedException {

        Actions action = new Actions(Hooks.driver);
        int count = homePage.menu.size();
        int min = 0;
        int max = count-1;
        int randomitem = (int) Math.floor(Math.random() * (max - min + 1) + min);
        action.moveToElement(homePage.menu.get(randomitem)).perform();
        randomitemtxt = homePage.menu.get(randomitem).getText();
        Thread.sleep(2000);

            if (!homePage.submenu.isEmpty()){
                int counts = homePage.submenu.size();
                int mini = 0;
                int maxx = counts-1;
                int selecteditem= (int) Math.floor(Math.random() * (maxx - mini + 1) + mini);
                selecteditemtxt= homePage.submenu.get(selecteditem).getText();
                homePage.submenu.get(selecteditem).click();

            }
            else
            {
                homePage.menu.get(randomitem).click();

            }
        Thread.sleep(2000);
    }


    @Then("user go to sub category page")
    public void userGoToSubCategoryPage() {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().trim().contains(randomitemtxt) || Hooks.driver.getCurrentUrl().toLowerCase().trim().contains(selecteditemtxt));

        soft.assertAll();

    }
}
