package com.steps.serenity;

import com.pages.DatePickerPag;
import com.pages.SiteMenuPage;
import com.pages.VacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps  extends ScenarioSteps {
	VacationRequestPage newVacationRequestPage;
	SiteMenuPage vacationOptionsPage;
	DatePickerPag datePickerBernadettPage;

	@Step
	public void selectStartDate(int day, String month, int year) {
		newVacationRequestPage.click_startDate();
		datePickerBernadettPage.setDate(day, month, year);
	}

	@Step
	public void click_NewVacationRequestFromTheLeftMenu() {
		vacationOptionsPage.create_page_newVacationRequest();
	}

	@Step
	public void selectEndDate(int day, String month, int year) {
		newVacationRequestPage.click_endDate();
		datePickerBernadettPage.setDate(day, month, year);
	}
}
