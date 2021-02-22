package com.PazarYeri.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/featureas",
        glue = "com/PazarYeri/stepdefinitions",
        dryRun = true,
        tags = "@wiki"

)

public class CuckRunner {


}
