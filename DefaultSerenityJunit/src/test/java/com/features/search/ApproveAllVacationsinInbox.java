package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsinInboxSteps;
import com.steps.serenity.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ApproveAllVacationsinInbox {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public ApproveAllVacationsinInboxSteps approveAllVacationsinInboxSteps;
	
	@Steps
	public LoginSteps loginSteps;

	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.is_the_home_page();
		loginSteps.start_login();
		loginSteps.login_as_DM();
		approveAllVacationsinInboxSteps.click_inbox_page();
		approveAllVacationsinInboxSteps.tick_all_vacations();
		approveAllVacationsinInboxSteps.approve_all_vacations();
		
}
}