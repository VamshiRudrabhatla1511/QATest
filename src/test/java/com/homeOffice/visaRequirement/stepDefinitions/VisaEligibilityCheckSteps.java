package com.homeOffice.visaRequirement.stepDefinitions;

import com.homeOffice.visaRequirement.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class VisaEligibilityCheckSteps {

    @Steps
    NationalityPage nationalityPage;
    PurposeOfVisitPage purposeOfVisitPage;
    DecisionPage decisionPage;
    StudyDurationPage studyDurationPage;
    TravelPartnerPage travelPartnerPage;
    Article10Page article10Page;

    @And("^I provide a nationality as listed on my passport or travel document as (.*)$")
    public void enterNationality(String nationality){
        nationalityPage.selectNationality(nationality);
        nationalityPage.clickOnNextButton();
       Assert.assertEquals("purpose of visit page not displayed","What are you coming to the UK to do?",purposeOfVisitPage.isPurposeOfVistPageDisplayed());
    }

    @And("^I select the purpose of visit as (.*)$")
    public void selectPurposeOfVisit(String purpose){
        purposeOfVisitPage.selectThePurposeOfVisit(purpose);
        purposeOfVisitPage.clickOnNextButton();
    }

    @And("^I state I am intending to stay for (.*) than six months$")
     public void selectStayForSixMonthsOrLess(String moreOrLess) {
        studyDurationPage.selectDurationOfStudy(moreOrLess);
    }

    @Then("^I verify the (.*)$")
    public void assertResult(String expectedResult){
        Assert.assertTrue("start again link is displayed",decisionPage.startAgainLinkIsDisplayed());
        String actualResult = decisionPage.getResultMessage();
        Assert.assertEquals("Outcome does not match",expectedResult,actualResult);
    }

    @When("^I submit the study duration form$")
    public void iSubmitTheStudyDurationForm() {
        studyDurationPage.clickOnNextButton();
    }

    @And("^I state (.*) for travelling with or visiting a partner or family and (.*) for Article card$")
    public void travelwithorWithOutPartnerAndArticle(String withPartnerOrNot, String withOrWithOutArtcile) {
        switch (withPartnerOrNot){
            case "yes":
                travelPartnerPage.selectTravellingWithOrNot(withPartnerOrNot);
                travelPartnerPage.clickOnNextButton();
                article10Page.selectArticle1020Card(withOrWithOutArtcile);
                break;
            case "no":
                travelPartnerPage.selectTravellingWithOrNot(withPartnerOrNot);
                break;
        }
    }

    @When("^I submit the article form$")
    public void iSubmitTheArticleForm() {
        article10Page.clickOnNextButton();
    }
}
