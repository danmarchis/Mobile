package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.TrackerSteps;
import com.steps.serenity.VacationTrackerSelectFiltersSteps;
import com.steps.serenity.VerifyColumnTypesSteps;

import constantPckg.ConstantClass;

import com.pages.LoginPage;
import com.steps.serenity.DatePickerActionsSteps;
import com.steps.serenity.DatePickerSteps;
import com.steps.serenity.LoginSteps;

@RunWith(SerenityRunner.class)
@UseTestDataFrom(separator=';',value="tools/page.csv")
public class AscendingOrderInStatusColumn {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public TrackerSteps newTrack;

	@Steps
	public DatePickerSteps newDateSteps;

	@Steps
	VacationTrackerSelectFiltersSteps selectFilters;

	@Steps
	VerifyColumnTypesSteps verifyColumnTypes;

	@Test
	public void access_tracker_tab() {
		loginSteps.getHomePage();
		loginSteps.loginAsPM();
		loginSteps.access_track_tab();
		
		
		newDateSteps.selectStartDate_track(ConstantClass.DATE_START);	
		newDateSteps.selectEndDate_track(ConstantClass.DATE_FINAL);
		
		
		selectFilters.showDropDownBuilding();
		selectFilters.showDropDownAll();
		selectFilters.showDropDownBuilding();
    	
		selectFilters.showDropDownDepartaments();
		selectFilters.checkAllInDepartamentsDropDown();
		selectFilters.chooseDepartaments("Mobile");
    	
		selectFilters.clickApply();
		selectFilters.chooseNumeberOfRowsInPage("5");
		//verifyColumnTypes.verifyIfStatusColumnIsInAscendingOrder("Status");

	}

}
