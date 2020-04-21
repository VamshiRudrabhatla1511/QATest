package com.homeOffice.visaRequirement.pages;

import com.homeOffice.visaRequirement.pageObjects.CommonPageObjects;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DecisionPage extends CommonPageObjects {

    @FindBy(css ="h2[class^='gem-c-heading']")
    WebElementFacade finalDecisionMessage;
    @FindBy(css ="a[href='/check-uk-visa']")
    WebElementFacade finalDecisionMessageAssertionText;

    public String getResultMessage() {
        return finalDecisionMessage.getText();
    }

    public boolean startAgainLinkIsDisplayed() {
        finalDecisionMessageAssertionText.waitUntilVisible();
        return finalDecisionMessageAssertionText.isDisplayed();
    }
}
