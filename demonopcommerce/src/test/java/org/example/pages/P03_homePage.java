package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {
    public P03_homePage() {
        PageFactory.initElements(Hooks.driver,this);
    }


@FindBy(id = "customerCurrency")
    public WebElement currList;

    @FindBy(partialLinkText = "Euro")
    public WebElement curr;
@FindBy(className = "details")
public List<WebElement> eoru;


   @FindBy(className = "search-box-text ui-autocomplete-input")
    public WebElement searchbox;

   @FindBy(className = "button-1 search-box-button")
    public WebElement searchbutton;

   @FindBy(className = "product-item")
    public List<WebElement> searchlist;

   @FindBy(id = "ui-id-2")
    public WebElement chooseelement;

   @FindBy(className = "sku")
    public WebElement sku;

   @FindBy(className = "top-menu notmobile")
    public List<WebElement> menu;

   @FindBy(className = "sublist first-level")
    public List<WebElement> submenu;

   @FindBy(className = "nivoSlider")
    public WebElement slider;

    @FindBy(className = "networks")
    public WebElement links;

    @FindBy(className = "facebook")
    public WebElement facebook;

    @FindBy(className = "twitter")
    public WebElement twitter;

    @FindBy(className = "rss")
    public WebElement rss ;

    @FindBy(className = "youtube")
    public WebElement youtube;

    @FindBy(className = "button-2 add-to-wishlist-button")
    public WebElement icon;

    @FindBy(className = "bar-notification success")
    public WebElement smsg;

    @FindBy(className = "wishlist-label")
    public WebElement wishlist;

    @FindBy(className = "qty-input")
    public WebElement qty;
}
