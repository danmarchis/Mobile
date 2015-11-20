package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsAssignedToOthersInbox;
import com.steps.serenity.ApproveAllVacationsinInboxSteps;
import com.steps.serenity.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ApproveAssignedToOthers_test {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public ApproveAllVacationsAssignedToOthersInbox approveAllAssignedToOthers;
	
	@Steps
	public LoginSteps loginSteps;

	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.getHomePage();
		loginSteps.startLogin();
		loginSteps.login_as_DM();
		approveAllAssignedToOthers.click_inbox_page();
		approveAllAssignedToOthers.click_assign_to_others();
		approveAllAssignedToOthers.tick_all_vacations();
		approveAllAssignedToOthers.approve_all_vacations();	
	}
}