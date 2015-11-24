package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsAssignedToOthersInboxSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.ViewVacationsSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(separator=';',value="tools/VacationType.csv")


public class ViewVacationsTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public ViewVacationsSteps viewFilteredVacations;
	
	@Steps
	public LoginSteps loginSteps;

	public String VacationType;
	
	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.getHomePage();
		loginSteps.startLogin();
		loginSteps.loginAsDM();
		viewFilteredVacations.clickViewVacation();
		//viewFilteredVacations.tickHolidayType();
		
		viewFilteredVacations.selectVacationType(VacationType);
		viewFilteredVacations.tickPendingStatus();
		viewFilteredVacations.checkOneToFive();
		viewFilteredVacations.clickApplyButton();	
		viewFilteredVacations.arrangeByStartDayHeaderFilter();
		viewFilteredVacations.clickNextPage();
		viewFilteredVacations.checkRegistrationContent(VacationType);
		//viewFilteredVacations.selectVacationType(VacationType);
		viewFilteredVacations.checkRegistrationStatus("Pending");
	}
}
