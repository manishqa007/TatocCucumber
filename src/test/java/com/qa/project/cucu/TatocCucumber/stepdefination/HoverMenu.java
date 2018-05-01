package com.qa.project.cucu.TatocCucumber.stepdefination;

import org.openqa.selenium.WebElement;
import com.qa.project.cucu.TatocCucumber.driver.DriverFactory;
import com.qa.project.cucu.TatocCucumber.resource.HoverMenuUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HoverMenu extends DriverFactory{
	
	@When("^Hover on 'menu (\\d+)' and click on 'Go next'$")
	public void hover_on_menu_and_click_on_Go_next(int arg1){
		WebElement hover,click;
		hover = elementByXpath(HoverMenuUtils.menuPath);
		click = elementByXpath(HoverMenuUtils.menuClick);
		hoverAndClick(hover,click);
		//System.out.println("Hover and clicked.........................................");
	}

	@Then("^Navigated to query gate$")
	public void navigated_to_query_gate(){
		//System.out.println("Navigated to query gate");
	}

}