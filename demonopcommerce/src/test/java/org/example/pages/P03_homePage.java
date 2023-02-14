package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_homePage {
    public P03_homePage() {
        PageFactory.initElements(Hooks.driver,this);
    }


@FindBy(id = "customerCurrency")
    public WebElement currList;



   @FindBy(className = "search-box-text ui-autocomplete-input\"")
    public WebElement searchbox;

   @FindBy(className = "button-1 search-box-button")
    public WebElement searchbutton;

   @FindBy(id = "ui-id-1")
    public WebElement searchlist;

}
