package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsAssignedToOthersInboxSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.ViewVacationsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ViewVacationsTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public ViewVacationsSteps viewFilteredVacations;
	
	@Steps
	public LoginSteps loginSteps;

	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.getHomePage();
		loginSteps.startLogin();
		loginSteps.loginAsDM();
		viewFilteredVacations.clickViewVacation();
		viewFilteredVacations.tickHolidayType();
		viewFilteredVacations.tickPendingStatus();
		viewFilteredVacations.clickApplyButton();	
		viewFilteredVacations.checkRegistrationContent("Holiday");
		viewFilteredVacations.checkRegistrationStatus("Pending");
	}
}
