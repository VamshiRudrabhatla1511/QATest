package com.homeOffice.visaRequirement.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CommonPageObjects extends PageObject {
    @FindBy(css = "#current-question button[type='submit']")
    WebElementFacade nextButton;

    public void clickOnNextButton(){
        clickOn(nextButton);
    }

    public void clickOnElement(WebElement e){
        e.click();
    }
}
