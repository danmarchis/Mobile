package com.steps.serenity;

import com.pages.VacationsReportPage;
import com.pages.SiteMenuPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationsReportSteps extends ScenarioSteps{
	
	VacationsReportPage vacationsReportPage;
	
	@Step
	public void clickVacationsReport() {
	vacationsReportPage.exportMenu();
}
	
	@Step
	public void selectMonth(String month){
	vacationsReportPage.selectMonth(month);
	}
	
	@Step
	public void selectYear(String year){
	vacationsReportPage.selectYear(year);
	}

	@Step
	public void selectPending() {
	vacationsReportPage.check_pending();
	}
	
	@Step
	public void select_CIM() {
	vacationsReportPage.check_cim();
	}
	
	@Step
	public void selectExport() {
	vacationsReportPage.export();
	}
	
}
