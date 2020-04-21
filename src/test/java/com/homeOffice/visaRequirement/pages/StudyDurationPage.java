package com.homeOffice.visaRequirement.pages;

import com.homeOffice.visaRequirement.constants.PageEnums;
import com.homeOffice.visaRequirement.pageObjects.CommonPageObjects;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StudyDurationPage extends CommonPageObjects {

    public void selectDurationOfStudy(String moreOrLess) {
        try {
            TimeUnit.SECONDS.sleep(2);
            List<WebElement> studyDurationList= getDriver().findElements(By.xpath("//*[@class='govuk-radios__input']"));
            for (WebElement studyDuration : studyDurationList) {
                String value = studyDuration.getAttribute("value");
                if((moreOrLess.equalsIgnoreCase(PageEnums.MORE.getValue())
                        && value.trim().equalsIgnoreCase(PageEnums.LONGER_THAN_SIX_MONTHS.getValue()))
                || (moreOrLess.equalsIgnoreCase(PageEnums.LESS.getValue())
                        && value.trim().equalsIgnoreCase(PageEnums.SIX_MONTHS_OR_LESS.getValue())) ) {
                    studyDuration.click();
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
