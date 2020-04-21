package com.homeOffice.visaRequirement.pages;

import com.homeOffice.visaRequirement.pageObjects.CommonPageObjects;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.junit.Assert;

public class NationalityPage extends CommonPageObjects {

    @FindBy(id = "response")
    WebElementFacade nationalities;
    @FindBy(css="label[class='govuk-label govuk-label--m']")
    WebElementFacade nationalityPageTextAssert;

    public void selectNationality(String nationalityName){
        selectFromDropdown(nationalities,nationalityName);
    }
/*    public void assertNationalityPageText(String expected){
        String actual = nationalityPageTextAssert.getText();
        Assert.assertEquals("Text Did Not Match --Error in Loading Page",actual,expected);
    }*/

    public String isNationalityPageDisplayed() {
        nationalityPageTextAssert.waitUntilVisible();
        return nationalityPageTextAssert.getText();
    }
}
