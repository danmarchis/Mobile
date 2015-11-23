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
import com.steps.serenity.VacationTrackerSelectFiltersSteps;
import com.steps.serenity.VerifyColumnTypesSteps;

import constantPckg.ConstantClass;

import com.pages.LoginPage;
import com.steps.serenity.DatePickerActionsSteps;
import com.steps.serenity.LoginSteps;


@RunWith(SerenityRunner.class)
public class AscendingOrderInColumns {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginSteps loginSteps;
	
	@Steps
	public TrackerSteps newTrack;
	
	@Steps
	public DatePickerActionsSteps newDateSteps;
	
	@Steps
	VacationTrackerSelectFiltersSteps selectFilters;
	
	@Steps
	VerifyColumnTypesSteps verifyColumnTypes;
	
	
	
	
	@Test
	public void verifyIfStatusColumnIsInAscendingOrder() {
		loginSteps.getHomePage();
		loginSteps.loginAsPM();
		loginSteps.access_track_tab();
		
		
		newDateSteps.selectStartDate_track(17, "Nov", 2015);	
		newDateSteps.selectEndDate_track(31, "Dec", 2015);
		
		
		selectFilters.showDropDownBuilding();
		selectFilters.showDropDownAll();
		selectFilters.showDropDownBuilding();
    	
		selectFilters.showDropDownDepartaments();
		selectFilters.checkAllInDepartamentsDropDown();
		selectFilters.chooseDepartaments(ConstantClass.MOBILE_DEPARTAMENT);
    	
		selectFilters.clickApply();
		selectFilters.chooseNumeberOfRowsInPage(ConstantClass.THIRTY);
		verifyColumnTypes.verifyIfColumnIsInAscendingOrder(ConstantClass.STATUS_COLUMN);

	}


}
