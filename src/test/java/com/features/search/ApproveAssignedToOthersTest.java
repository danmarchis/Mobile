package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.ApproveAllVacationsAssignedToOthersInboxSteps;
import com.steps.serenity.ApproveAllVacationsinInboxSteps;
import com.steps.serenity.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ApproveAssignedToOthersTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public ApproveAllVacationsAssignedToOthersInboxSteps approveAllAssignedToOthers;
	
	@Steps
	public LoginSteps loginSteps;

	@Test
	public void approveAllVacationsInbox() {
		loginSteps.getHomePage();
		loginSteps.startLogin();
		loginSteps.loginAsDM();
		approveAllAssignedToOthers.clickInboxPage();
		approveAllAssignedToOthers.clickAssignToOthers();
		approveAllAssignedToOthers.tickAllVacations();
		approveAllAssignedToOthers.approveAllVacations();	
	}
}