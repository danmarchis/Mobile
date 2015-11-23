package com.features.search;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.DatePickerActionsSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.TrackerSteps;
import com.steps.serenity.VacationTrackerSelectFiltersSteps;
import com.steps.serenity.VerifyColumnTypesSteps;

import constantPckg.ConstantClass;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class DescendingOrderInColumns {

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
	public void verifyIfStatusColumnIsInDescendingOrder() {
		loginSteps.getHomePage();
		loginSteps.login_as_PM();
		loginSteps.access_track_tab();

		newDateSteps.selectStartDate_track(17, "Nov", 2015);
		newDateSteps.selectEndDate_track(31, "Dec", 2015);

		selectFilters.showDropDownBuilding();
		selectFilters.showDropDownAll();
		selectFilters.showDropDownBuilding();

		selectFilters.showDropDownDepartaments();
		selectFilters.checkAllInDepartamentsDropDown();
		selectFilters.chooseDepartaments(ConstantClass.MOBILE_DEPARTAMENT);
		// ok
		selectFilters.clickApply();

		verifyColumnTypes.verifyIfStatusColumnIsInDescendingOrder("Employee name");

	}
}
