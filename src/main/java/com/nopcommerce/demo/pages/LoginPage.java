package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    public String verifyWelcomeText() {
        log.info("Verify welcome text" + welcomeText.toString());

        return getTextFromElement(welcomeText);
    }
    public void enterEmail(String email) {
        log.info("Enter email." + email + "in email field" + emailField.toString());

        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password." + password + "in email field" + passwordField.toString());

        sendTextToElement(passwordField, password);


    }

    public void clickOnLoginButton() {
        log.info("Click on login button" + loginButton.toString());

        clickOnElement(loginButton);


    }

    public String verifyErrorMessage() {
        log.info("Verify error message" + errorMessage.toString());

        return getTextFromElement(errorMessage);
    }

    public String verifyLogoutLinkIsDisplayed() {
        log.info("Verify logout link." + logout.toString());

        return getTextFromElement(logout);
    }

    public void clickOnLogoutLink() {
       log.info("Click on logout link." + logout.toString());

        clickOnElement(logout);
    }


}
