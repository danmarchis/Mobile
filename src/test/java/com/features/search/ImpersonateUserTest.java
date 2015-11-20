package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;
import com.steps.serenity.NewVacationRequestSteps;
import com.steps.serenity.ImpersonateSteps;

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
	public ImpersonateSteps impersonateSteps;
	

	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	

	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.is_the_home_page();
		loginSteps.start_login();
		loginSteps.login_as_DM();
		loginSteps.navigateTo("http://172.22.4.88:9090/group/control_panel?doAsGroupId=10180&refererPlid=86301");
		impersonateSteps.users_and_org();
		impersonateSteps.name_field();;
		impersonateSteps.enter_username("melian");
		impersonateSteps.search_option();
		impersonateSteps.findUserAndImpersonate("emilian.melian1");
		impersonateSteps.navigateTo("http://172.22.4.88:9090/vacation");
		newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
		newVacationRequestSteps.selectStartDate(15,"Dec",2015);
		newVacationRequestSteps.selectEndDate(15, "Dec", 2015);
		newVacationRequestSteps.Holiday();
		newVacationRequestSteps.Save();
		
		

	
	
	}
}
