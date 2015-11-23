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
		loginSteps.getHomePage();
		loginSteps.startLogin();
		loginSteps.loginAsDM();
		vacationsReportSteps.clickVacationsReport();
		vacationsReportSteps.selectMonth("November");
		vacationsReportSteps.selectYear("2014");
		vacationsReportSteps.selectPending();
		vacationsReportSteps.selectExport();
		
	}	

}
