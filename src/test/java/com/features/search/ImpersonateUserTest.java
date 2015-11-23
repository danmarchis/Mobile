package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;
import com.steps.serenity.NewVacationRequestSteps;
import com.steps.serenity.ApproveAllVacationsinInboxSteps;
import com.steps.serenity.ImpersonateUserSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ImpersonateUserTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginSteps loginSteps;
	
	@Steps
	public ImpersonateUserSteps impersonateSteps;
	

	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	@Steps
	public ApproveAllVacationsinInboxSteps approveAllVacationsinInboxSteps;
	

	@Test
	public void approveAllImpersonatedVacationsInbox() {
		loginSteps.getHomePage();
		loginSteps.loginAsDM();
		loginSteps.navigateTo("http://172.22.4.88:9090/group/control_panel?doAsGroupId=10180&refererPlid=86301");
		impersonateSteps.users_and_org();
		impersonateSteps.name_field();;
		impersonateSteps.enter_username("melian");
		impersonateSteps.search_option();
		impersonateSteps.findUserAndImpersonate("emilian.melian1");
		impersonateSteps.navigateTo("http://172.22.4.88:9090/vacation");
		newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
		newVacationRequestSteps.selectStartDate(16,"Dec",2015);
		newVacationRequestSteps.selectEndDate(16, "Dec", 2015);
		newVacationRequestSteps.Holiday();
		newVacationRequestSteps.Save();
		impersonateSteps.sign_out();
		loginSteps.getHomePage();
		loginSteps.loginAsDM();
		approveAllVacationsinInboxSteps.clickInboxPage();
		approveAllVacationsinInboxSteps.tickAllVacations();
		approveAllVacationsinInboxSteps.approveAllVacations();
		
	}
}
