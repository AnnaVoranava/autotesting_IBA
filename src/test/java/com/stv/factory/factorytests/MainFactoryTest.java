package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.stv.framework.core.lib.WigglePageURLs.*;
import static com.stv.framework.core.lib.WigglePageURLs.PASSWORD;

public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();


    @Test(description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Test(description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(new LoginPage().isLoginTextInfoDisplayed(), true, "Login page isn't loaded properly");
    }

    @Test(description = "Assert the Sing up link is loader", dependsOnMethods = "assertLoginPageOpened")
    public void assertSingUpPageOpened() {
        loginPage.clickSignUpLink();

        Assert.assertEquals(new LoginPage().isSingUpPageInfoDisplayed(), true, "Sign up isn't loaded properly");
    }

    @Test(description = "Assert the Sign in link is loaded", dependsOnMethods = "assertSingUpPageOpened")
    public void assertSingInPageOpened() {
        loginPage.clickSignInLink();
        Assert.assertEquals(new LoginPage().isLoginTextInfoDisplayed(), true, "Login page isn't loaded properly");
    }


    @Test(description = "Assert the email_address is active on visiting login page", dependsOnMethods = "assertSingInPageOpened")
    public void assertFieldUsernameActive() {
        Assert.assertEquals(new LoginPage().isElementFocused(loginPage.getUsername()), true, "Field email_address is not active on visiting login page");
    }


    @Test(description = "Assert login(authorization) is performed with valid data", dependsOnMethods = "assertInvalidData")
    public void assertValidData() {
        loginPage.getUsername().clear();
        loginPage.inputText(loginPage.getUsername(), EMAIL_ADDRESS);
        loginPage.getPassword().clear();
        loginPage.inputText(loginPage.getPassword(), PASSWORD);
        loginPage.clickButtonContinue();
        Assert.assertEquals(new LoginPage().isMyAccountButtonPresent(), true, "Login failed");
    }

    @Test(description = "Assert login(authorization) is not performed with invalid data", dependsOnMethods = "assertFieldUsernameActive")
    public void assertInvalidData() {
        loginPage.getUsername().clear();
        loginPage.inputText(loginPage.getUsername(), NOTUSERNAME);
        loginPage.getPassword().clear();
        loginPage.inputText(loginPage.getPassword(), PASSWORD);
        loginPage.clickButtonContinue();
        Assert.assertEquals(new LoginPage().loginMessage(), "Wrong email or password", "The message does not appear");

    }

}