package com.homeOffice.visaRequirement.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(css ="a[href='/check-uk-visa/y']")
    WebElementFacade startButton;
    @FindBy(css ="section[class='intro'] div[class$='govuk-govspeak '] p")
    WebElementFacade homePageAssertText;

    public void launch(){
        open();
    }

    public void clickOnStartNow(){
        startButton.click();
    }
    public String isHomePageTextDisplayed(){
        return homePageAssertText.getText();
    }
}
