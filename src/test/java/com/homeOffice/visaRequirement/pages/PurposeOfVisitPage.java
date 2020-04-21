package com.homeOffice.visaRequirement.pages;

import com.homeOffice.visaRequirement.pageObjects.CommonPageObjects;
import com.homeOffice.visaRequirement.utils.CommonMethods;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PurposeOfVisitPage extends CommonPageObjects {
CommonMethods commonMethods;

    @FindBy(css="legend[class='govuk-fieldset__legend govuk-fieldset__legend--m']")
    WebElementFacade purposeOfVisitPageTextAssert;

    public void selectThePurposeOfVisit(String yesOrNo) {
        commonMethods.selectRadioButton(yesOrNo);
    }

    public String isPurposeOfVistPageDisplayed(){
        purposeOfVisitPageTextAssert.waitUntilVisible();
        return purposeOfVisitPageTextAssert.getText();
    }
}
