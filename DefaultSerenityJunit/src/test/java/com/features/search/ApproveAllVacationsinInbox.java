package com.features.search;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsinInboxSteps;
import com.steps.serenity.LoginSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class ApproveAllVacationsinInbox {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public ApproveAllVacationsinInboxSteps endUser;
	

	@Test
	
	public void approve_all_vacations_inbox() {
		endUser.login_in_vacation_tool_as_a_DM();
		endUser.click_inbox_page();
		endUser.tick_all_vacations();
		endUser.approve_all_vacations();
		
}
}