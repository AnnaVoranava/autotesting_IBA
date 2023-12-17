package com.stv.bdd.steps;

import com.stv.design.designpages.MainPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;


public class FinalTaskSteps extends BasicFactoryTest {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @When("User clicks on Basket Icon")
    public void userClicksOnBasketIcon() {
        mainFactoryPage.clickOnBasketIcon();
    }

    @Then("Basket page is displayed")
     public void isBasketPageIsDisplayed() {
   mainFactoryPage.isBasketPageDisplayed();}}




