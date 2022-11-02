package com.GitHub.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources",
        glue = "com/GitHub/StepDefinitions",
        plugin = {
                "pretty",
                "html:target/report/cucumber-html-report.html",
                "json: target/cucumber.json"
        }
        //,dryRun=true
)

public class GitRunner {


}
