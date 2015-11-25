package com.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.steps.serenity.TrackerSteps;
import com.steps.serenity.VacationTrackerSelectFiltersSteps;
import com.steps.serenity.VerifyColumnTypesSteps;

import constantPckg.ConstantClass;

import com.pages.LoginPage;
import com.steps.serenity.DatePickerActionsSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.NewVacationRequestSteps;
import com.steps.serenity.SignOutSteps;

@RunWith(SerenityParameterizedRunner.class)

@UseTestDataFrom(separator=';',value="tools/page.csv")
public class VerifyDateColumn {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	  
	@Steps
	public LoginSteps loginSteps;
	
	@Steps
	public DatePickerActionsSteps newDateSteps;
	
	@Steps
	public TrackerSteps newTrack;

	@Steps
	VacationTrackerSelectFiltersSteps selectFilters;
	
	@Steps
	VerifyColumnTypesSteps verifyColumnTypes;
	
	@Steps
	public SignOutSteps signout;
	
	public String department,type;
	@Test
	public void verifyIfTheApplicationDisplayCorrectStartDateInVacationTrackePage() throws ParseException {

		loginSteps.getHomePage();
		loginSteps.loginAsPM();
		loginSteps.accesVacationTrackerTab();

		
		
		
		newDateSteps.selectStartDate_track(10, "Dec", 2015);	
		newDateSteps.selectEndDate_track(21, "Dec", 2015);
		
		
		selectFilters.showDropDownBuilding();
		selectFilters.showDropDownAll();
		selectFilters.showDropDownBuilding();
    	
		selectFilters.showDropDownDepartaments();
		selectFilters.checkAllInDepartamentsDropDown();
		selectFilters.chooseDepartaments("Mobile");
    	
		selectFilters.clickApply();
    	
		
		verifyColumnTypes.verifyIfApplicationDisplayCorrectStartDate("10/12/2015");
		//signout.signOut();

	}
	
}
