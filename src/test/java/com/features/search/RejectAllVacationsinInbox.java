package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsinInboxSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.RejectAllVacationsInInboxSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class RejectAllVacationsinInbox {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public RejectAllVacationsInInboxSteps rejectAllVacationsinInbox;
	
	@Steps
	public LoginSteps loginSteps;

	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.getHomePage();
		loginSteps.startLogin();
		loginSteps.login_as_DM();
		rejectAllVacationsinInbox.click_inbox_page();
		rejectAllVacationsinInbox.tick_all_vacations();
		rejectAllVacationsinInbox.approve_all_vacations();
		
}
}
