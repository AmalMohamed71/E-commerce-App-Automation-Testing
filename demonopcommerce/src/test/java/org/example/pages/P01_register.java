package org.example.pages;

import org.example.stepDefs.Hooks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register {
    public P01_register() {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerLink;

     @FindBy(id = "gender-female")
    public WebElement female;

     @FindBy(id = "FirstName")
    public WebElement firstname;

     @FindBy(id = "LastName")
    public WebElement lastname;

     @FindBy(name = "DateOfBirthDay")
    public WebElement dayofbirth;

     @FindBy(name = "DateOfBirthMonth")
    public WebElement manthofbirth;

     @FindBy(name = "DateOfBirthYear")
    public WebElement yearofbirth;

     @FindBy(id = "Email")
    public WebElement email;

     @FindBy(id = "Password")
    public WebElement password;

     @FindBy(id = "ConfirmPassword")
    public WebElement confirmpassword;

     @FindBy(id = "register-button")
    public WebElement registerbutton;

     @FindBy(className = "result")
    public WebElement successmsg;

}
