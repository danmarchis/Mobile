package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.steps.serenity.TrackerSteps;
import com.pages.LoginPage;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.NewVacationRequestSteps;

@RunWith(SerenityRunner.class)
public class DropDownElementTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginSteps endUser;
	
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	@Steps
	public TrackerSteps newTrack;

	@Test
	public void verify_if_the_drop_down_elements_are_visible() {
		endUser.is_the_home_page();
		endUser.login_as_PM();
		endUser.access_track_tab();
		//newTrack.selectStartDate_track(17, "Nov", 2015);
    	//newVacationRequestSteps.selectEndDate_track(26, "Nov", 2015);
    	newTrack.showDropDownBuilding();
    	newTrack.showDropDownAll();
    
    	//newTrack.chooseBuildings("Not");
    	newTrack.showDropDownBuilding();
    	
    	newTrack.showDropDownDepartaments();
    	newTrack.showDepartamentsDropDownAll();
    	
    	newTrack.chooseDepartaments("Mobile");
    	//newTrack.checkMobile();
    	newTrack.clickApply();
		//newTrack.showIfTypeIsCorrect("Mobile");
    	//newTrack.verifyThatTypeIsCorrect("Mobile");
    	//newTrack.showEmployeeVacationsList();
    	//newTrack.showIfDepartamentTypeIsCorrect();

	}
	
}
