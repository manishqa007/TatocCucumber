package com.qa.project.cucu.TatocCucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/Destination"},
		features={"src/feature/feature.feature"},
		glue = "com.qa.project.cucu.TatocCucumber.stepdefination",
		monochrome = true
		)
public class TatocRunner {

}
