package com.homeOffice.visaRequirement.pages;

import com.homeOffice.visaRequirement.pageObjects.CommonPageObjects;
import com.homeOffice.visaRequirement.utils.CommonMethods;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Article10Page extends CommonPageObjects {
    CommonMethods commonMethods;
    public void selectArticle1020Card(String yesOrNo){
      commonMethods.selectRadioButton(yesOrNo);
    }

}
