package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class MainFactoryPage extends FactoryPage {


    @FindBy(css = "[aria-label='Sign in']")
    private WebElement accountLink;
    @FindBy(xpath = "//button[@aria-label='Basket']")
    private WebElement basketIcon;

    @FindBy(xpath = "//h1[contains(text(),'Your shopping basket is empty')]")
    private WebElement emptyBasketTitle;
    @FindBy(xpath ="//h1[contains (text(), 'Your shopping basket is empty']")
    private WebElement basketPage;
    @FindBy(xpath = "//button[contains(text(),'Accept all')]")
    private WebElement trustButton;
    @FindBy(xpath = "//h2[@class='GenericContent_heading__Z5H8I'][contains(text(), 'EPIC WINTER SALE')]")
    private WebElement WiggleHomePage;

    @FindBy(css = "button[aria-label='My account']")//
    private WebElement AccountList;

    @FindBy(xpath = "//nav[@class='MyAccountMenu_myAccountMenu__GNv_B']")
    private WebElement MyAccountListPresent;

    @FindBy(xpath = "//button[@class='MyAccountMenu_menuLink__0HAZW'][contains(text(), 'Sign out')]")
    private WebElement returnSingOutLink;


    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    public void clickOnTrustButton() {
        trustButton.click();
    }



    public void WiggleHomePageIsDisplayed() {
        WiggleHomePage.isDisplayed();

    }

    public void ClicksMyAccount() {
        AccountList.click();
    }

    public void isMyAccountListPresent() {
        MyAccountListPresent.isDisplayed();

    }

    public void clickSingOut() {
        returnSingOutLink.click();
    }


    public void clickOnBasketIcon() {
       basketIcon.click();
    }
    public boolean isBasketPageDisplayed() {
        return basketPage.isDisplayed();
    }
}

