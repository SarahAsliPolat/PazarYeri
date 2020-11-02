package com.PazarYeri.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featureas",
        glue = "com/PazarYeri/stepdefinitions",
        dryRun = false
)



public class CuckRunner {

}
