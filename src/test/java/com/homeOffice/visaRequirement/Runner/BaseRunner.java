package com.homeOffice.visaRequirement.Runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.util.logging.Logger;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue = {"com.homeOffice.visaRequirement.stepDefinitions"},format={"pretty"})
public class BaseRunner {

    private final static Logger LOGGER = Logger.getLogger(BaseRunner.class.getName());

    @Before
    public static void setup() {
        LOGGER.info("This will have implementation after later commits");
    }

    //@After
    public static void exitSuite() {

    }

}
