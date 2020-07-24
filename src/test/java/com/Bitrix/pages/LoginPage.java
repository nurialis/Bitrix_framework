package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='log-popup-header']")
    public WebElement authorizationTitle;

}
