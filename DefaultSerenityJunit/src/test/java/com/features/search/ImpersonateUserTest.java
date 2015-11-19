package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;
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
	

	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.is_the_home_page();
		loginSteps.start_login();
		loginSteps.login_as_DM();
		loginSteps.navigateTo("http://172.22.4.88:9090/group/control_panel?doAsGroupId=10180&refererPlid=86301");
		
//		impersonateSteps.go_to();
//		impersonateSteps.ctrl_panel();
		impersonateSteps.users_and_org();
		impersonateSteps.name_field();;
//		impersonateSteps.enter_username("melian");
//		impersonateSteps.search_option();
//		impersonateSteps.findUserAndImpersonate("emilian.melian1");
		impersonateSteps.findUserAndImpersonate("alecsandru.alupoaie");
	
	
	}
}
