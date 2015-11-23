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
import com.steps.serenity.DatePickerActionsSteps;
import com.steps.serenity.LoginSteps;


@RunWith(SerenityRunner.class)
public class AscendingOrderInStatusColumn {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginSteps endUser;
	
	
	
	@Steps
	public TrackerSteps newTrack;
	
	@Steps
	public DatePickerActionsSteps newDateSteps;
	
	@Test
	public void access_tracker_tab() {
		endUser.getHomePage();
		endUser.login_as_PM();
		endUser.access_track_tab();
		
		
		newDateSteps.selectStartDate_track(17, "Nov", 2015);
		
		newDateSteps.selectEndDate_track(31, "Dec", 2015);
    	newTrack.showDropDownBuilding();
    	newTrack.showDropDownAll();
    
    	//newTrack.chooseBuildings("Not");
    	newTrack.showDropDownBuilding();
    	
    	newTrack.showDropDownDepartaments();
    	newTrack.showDepartamentsDropDownAll();
    	
    	newTrack.chooseDepartaments("Mobile");
    	
    	newTrack.clickApply();
		
    	newTrack.verifyIfStatusColumnIsInAscendingOrder();

	}



}
