package com.stv.factory.factorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.stv.framework.core.drivers.Driver.driver;

public class LoginPage extends FactoryPage {
    @FindBy(xpath = "//*[contains(text(),'Please log in')]")
    private WebElement loginTextInfo;
    @FindBy(xpath = "//a[contains(text(),'Sign up')]")
    private WebElement signUpLink;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private WebElement signInLink;
    @FindBy(xpath = "//p[contains(text(),'Create your account to continue')]")
    private WebElement singUpTextInfo;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;

    public WebElement getUsername() {
        return username;
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy(xpath = "//button[@data-action-button-primary='true']")
// //button[@name='action'][@type='submit'][@data-action-button-primary='true']
    public WebElement buttonContinue;
    @FindBy(css = "button[aria-label='My account']") //xpath = "//button[@aria-label='My account']
    private WebElement myAccountButton;
    @FindBy(css = "span#error-element-password")//  xpath = "//span[@id='error-element-password']"
    private WebElement loginMessage;

    public boolean isLoginTextInfoDisplayed() {
        return loginTextInfo.isDisplayed();
    }

    public void clickSignUpLink() {
        signUpLink.click();
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public boolean isSingUpPageInfoDisplayed() {
        return singUpTextInfo.isDisplayed();
    }

    public boolean isElementFocused(WebElement element) {
        return element.equals(driver.switchTo().activeElement());
    }

    public void inputText(WebElement el, String text) {
        el.sendKeys(text);
    }

    public void clickButtonContinue() {
        buttonContinue.click();
    }

    public boolean isMyAccountButtonPresent() {
        return myAccountButton.isDisplayed();
    }

    public String loginMessage() {
        return loginMessage.getText();
    }

    public void ValidateEmailIsDisplayed(String email) {

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.clear();
        username.sendKeys(email);
    }

    public void ValidatePasswordIsDisplayed(String password) {
        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.clear();
        pass.sendKeys(password);

    }


}
