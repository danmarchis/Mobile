package com.steps.serenity;

import com.pages.DatePickerPag;
import com.pages.SiteMenuPage;
import com.pages.VacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps  extends ScenarioSteps {
	VacationRequestPage newVacationRequestPage;
	SiteMenuPage vacationOptionsPage;
	DatePickerPag datePickerDanPage;

	@Step
	public void selectStartDate(int day, String month, int year) {
		newVacationRequestPage.click_startDate();
		datePickerDanPage.setDate(day, month, year);
	}
	
	public void selectStartDate_track(int day, String month, int year) {
		newVacationRequestPage.click_startDate1();
		datePickerDanPage.setDate(day, month, year);
	}

	@Step
	public void click_NewVacationRequestFromTheLeftMenu() {
		vacationOptionsPage.create_page_newVacationRequest();
	}

	@Step
	public void selectEndDate(int day, String month, int year) {
		newVacationRequestPage.click_endDate();
		datePickerDanPage.setDate(day, month, year);
	}
	
	@Step
	public void selectEndDate_track(int day, String month, int year) {
		newVacationRequestPage.click_endDate1();
		datePickerDanPage.setDate(day, month, year);
	}
}
