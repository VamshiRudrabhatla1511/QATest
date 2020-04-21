package com.homeOffice.visaRequirement.stepDefinitions;

import com.homeOffice.visaRequirement.pages.HomePage;
import com.homeOffice.visaRequirement.pages.NationalityPage;
import com.homeOffice.visaRequirement.Runner.BaseRunner;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class BackGroundSteps extends BaseRunner {


    @Steps
    HomePage homePage;
    NationalityPage nationalityPage;

    @Given("^I am on visa requirement check home page$")
    public void openHomePage(){
       homePage.launch();
       Assert.assertEquals("home page not displayed","You may need a visa to come to the UK to visit, study or work.",homePage.isHomePageTextDisplayed());
    }

    @Given("^I start the visa check process$")
    public void visaRequirementCheck(){
        homePage.clickOnStartNow();

        Assert.assertEquals("nationality selection page not displayed","What’s your nationality as shown on your passport or travel document?",nationalityPage.isNationalityPageDisplayed());
    }

}
