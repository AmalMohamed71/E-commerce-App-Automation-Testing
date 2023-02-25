package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    public P02_login() {PageFactory.initElements(Hooks.driver,this);}

    @FindBy(className = "ico-login")
    public WebElement loginLink;

@FindBy(id = "Email")
    public WebElement email;

@FindBy(id = "Password")
    public WebElement password;

@FindBy(tagName = "button")
    public WebElement loginbutton;

@FindBy(className = "ico-account")
    public WebElement accountTap;

@FindBy(className = "message-error validation-summary-errors")
    public WebElement errormsg;


}
