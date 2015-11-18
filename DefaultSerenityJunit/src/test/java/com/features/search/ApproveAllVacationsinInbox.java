package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsinInboxSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.NewVacationRequestSteps;
import com.steps.serenity.SignOutSteps;

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
	
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	@Steps
	public SignOutSteps signOutSteps;

	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.is_the_home_page();
		loginSteps.start_login();
		loginSteps.login_as_tester();
		newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(20, "Nov", 2015);
    	newVacationRequestSteps.selectEndDate(20, "Nov", 2015);
    	newVacationRequestSteps.MaternityLeaveBox();
    	newVacationRequestSteps.select_MaternityLeaveOptionConcediu();
    	newVacationRequestSteps.enter_DurationBox("Mar");
    	newVacationRequestSteps.enter_InstitutionBox("Para");
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
    	signOutSteps.access_user_options();
    	signOutSteps.sign_out();
    	loginSteps.is_the_home_page();
		loginSteps.start_login();
		loginSteps.login_as_DM();
		approveAllVacationsinInboxSteps.click_inbox_page();
		approveAllVacationsinInboxSteps.tick_all_vacations();
		approveAllVacationsinInboxSteps.approve_all_vacations();
		
}
}