package com.qa.project.cucu.TatocCucumber.stepdefination;

import com.qa.project.cucu.TatocCucumber.driver.DriverFactory;
import com.qa.project.cucu.TatocCucumber.resource.CourseSelectionUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CourseSelection extends DriverFactory{
	
	@Given("^Open browser and start application Tatoc$")
	public void open_browser_and_start_application_Tatoc(){
		initDriver();
	}

	@When("^Click on advance course$")
	public void click_on_advance_course(){
		clickByXpath(CourseSelectionUtils.coursePath);
		//System.out.println("Advance course selected");
	}

	@Then("^Navigated to hover menu$")
	public void navigated_to_hover_menu(){
		//System.out.println("Navigated to hover menu");
	}

}