package com.stv.bdd.steps;

import com.stv.design.designpages.MainPage;
import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class SignInSteps extends BasicFactoryTest {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    @When("Wiggle home page is opened")
    public void wiggleHomePageIsOpened() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("User clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        mainFactoryPage.clickOnTrustButton();
    }

    @Then("Wiggle Logo is displayed")
    public void wiggleLogoIsDisplayed() {
        mainPage.isMainLogoDisplayed();
    }

    @And("Account Link is displayed")
    public void accountLinkIsDisplayed() {
        mainFactoryPage.isAccountLinkDisplayed();
    }


      @When("User clicks on Sign in link")
    public void userClicksOnSignInLink() {
        mainFactoryPage.isAccountLinkDisplayed();
    }

    @Then("Please log in is displayed")
    public void PleaseLogInIsDisplayed() {
        mainFactoryPage.clickOnAccountLink();
    }

    @When("User enters {string}")
    public void UserEntersEmail(String email) {
        loginPage.ValidateEmailIsDisplayed(email);
    }

    @And("User ent {string}")
    public void UserEntersPassword(String password) {
        loginPage.ValidatePasswordIsDisplayed(password);
    }

    @And("User clicks continue")
    public void UseClickContinue() {
        loginPage.clickButtonContinue();
    }

    @Then("My account is displayed")
    public void MyAccountIsDisplayed() {
        loginPage.isMyAccountButtonPresent();
    }
    @When("User clicks on My account link")
    public void userClicksMyAccountLink() {
        mainFactoryPage.ClicksMyAccount();
    }
    @Then("My account list is displayed")
    public void MyAccountListIsDisplayed() {
        mainFactoryPage.isMyAccountListPresent();
    }
    @When("User Sing out click")
    public void UseClickSingOut() {
        mainFactoryPage.clickSingOut();
    }


}
