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
public class RejectAllVacationsinInboxTest {
	
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
		loginSteps.loginAsDM();
		rejectAllVacationsinInbox.clickInboxPage();
		rejectAllVacationsinInbox.tickAllVacations();
		rejectAllVacationsinInbox.approveAllVacations();
		
}
}
