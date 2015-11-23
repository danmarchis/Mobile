package com.steps.serenity;

import com.pages.DatePickerPag;
import com.pages.SiteMenuPage;
import com.pages.VacationTrackerPage;
import com.pages.VacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DatePickerActionsSteps  extends ScenarioSteps {
	VacationTrackerPage newDatePicker;
	SiteMenuPage newSiteMenu;
	DatePickerPag datePickerPage;

	
	
	public void selectStartDate_track(int day, String month, int year) {
		newDatePicker.click_startDate();
		datePickerPage.setDate(day, month, year);
	}


	@Step
	public void selectEndDate_track(int day, String month, int year) {
		newDatePicker.click_endDate();
		datePickerPage.setDate(day, month, year);
	}
}

