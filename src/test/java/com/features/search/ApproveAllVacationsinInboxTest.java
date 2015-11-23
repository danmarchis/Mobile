package com.features.search;

import java.sql.Driver;

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
public class ApproveAllVacationsinInboxTest {
	
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
	public void approveAllVacationsInbox() {
		loginSteps.getHomePage();
		loginSteps.startLogin();
		loginSteps.loginAsPM();
		newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(19, "Nov", 2015);
    	newVacationRequestSteps.selectEndDate(19, "Nov", 2015);
    	newVacationRequestSteps.MaternityLeaveBox();
    	newVacationRequestSteps.select_MaternityLeaveOptionConcediu();
    	newVacationRequestSteps.enter_DurationBox("Mar");
    	newVacationRequestSteps.enter_InstitutionBox("Para");
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
    	//signOutSteps.access_user_options();
    	signOutSteps.signOut();
    	loginSteps.getHomePage();
		loginSteps.startLogin();
		loginSteps.loginAsDM();
		approveAllVacationsinInboxSteps.clickInboxPage();
		approveAllVacationsinInboxSteps.tickAllVacations();
		approveAllVacationsinInboxSteps.approveAllVacations();
		
}
}