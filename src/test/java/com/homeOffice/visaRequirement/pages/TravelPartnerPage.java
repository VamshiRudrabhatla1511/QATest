package com.homeOffice.visaRequirement.pages;

import com.homeOffice.visaRequirement.pageObjects.CommonPageObjects;
import com.homeOffice.visaRequirement.utils.CommonMethods;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TravelPartnerPage extends CommonPageObjects {
    CommonMethods commonMethods;

    public void selectTravellingWithOrNot(String yesOrNo){
        waitForTextToAppear("Will you be travelling with or visiting either your partner or a family member in the UK?");
        commonMethods.selectRadioButton(yesOrNo);
}
}
