package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("user go home-page")
    public void user_go_home_page()
    {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @And("find Follow us links")
    public void findFollowUsLinks() {
        Select select = new Select(homePage.links);

    }

    @When("user opens facebook link")
    public void userOpensFacebookLink() throws InterruptedException {
        homePage.facebook.click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
    }

    @Then("facebook is opened in new tab")
    public void facebookIsOpenedInNewTab() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("www.facebook.com/nopCommerce"));
        Hooks.driver.close();
    }

    @Given("go home page")
    public void goHomePage() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @And("find Follow-us links")
    public void findFollowUs() {
        Select select = new Select(homePage.links);
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        homePage.twitter.click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
    }

    @Then("twitter is opened in new tab")
    public void twitterIsOpenedInNewTab() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://twitter.com/nopCommerce"));
        Hooks.driver.close();

    }

    @Given("go to home page")
    public void goToHomePage() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @And("find Follow_us links")
    public void findFollow_usLinks() {
        Select select = new Select(homePage.links);
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        homePage.rss.click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
    }

    @Then("rss is opened in new tab")
    public void rssIsOpenedInNewTab() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/new-online-store-is-open"));
        Hooks.driver.close();
    }

    @Given("go to home_page")
    public void goToHome_page() {
        Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @And("find FollowUs links")
    public void FollowUsLinks() {
        Select select = new Select(homePage.links);
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        homePage.youtube.click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
    }

    @Then("youtube is opened in new tab")
    public void youtubeIsOpenedInNewTab() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains( "https://www.youtube.com/user/nopCommerce"));
        Hooks.driver.close();
    }
}
