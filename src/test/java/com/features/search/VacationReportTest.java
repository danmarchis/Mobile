package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;
import com.steps.serenity.VacationsReportSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class VacationReportTest {
	

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginSteps loginSteps;
	
	@Steps
	public VacationsReportSteps vacationsReportSteps;
	
	
	@Test
	public void approve_all_vacations_inbox() {
		loginSteps.is_the_home_page();
		loginSteps.start_login();
		loginSteps.login_as_DM();
		vacationsReportSteps.click_vacations_report();
		vacationsReportSteps.selectMonth("November");
		vacationsReportSteps.selectYear("2014");
		vacationsReportSteps.select_pending();
		vacationsReportSteps.select_export();
		
	}	

}
