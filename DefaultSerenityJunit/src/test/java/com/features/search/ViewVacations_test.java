package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsAssignedToOthersInbox;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.ViewVacationsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ViewVacations_test {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public ViewVacationsSteps viewFilteredVacations;
	
	@Steps
	public LoginSteps loginSteps;

	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.is_the_home_page();
		loginSteps.start_login();
		loginSteps.login_as_DM();
		viewFilteredVacations.click_view_vacation();
		viewFilteredVacations.tick_holiday_type();
		viewFilteredVacations.tick_pending_status();
		viewFilteredVacations.click_apply_button();	
	}
}
