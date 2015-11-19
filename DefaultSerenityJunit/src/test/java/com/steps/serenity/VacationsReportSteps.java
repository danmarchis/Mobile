package com.steps.serenity;

import com.pages.VacationsReportPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationsReportSteps extends ScenarioSteps{
	
	VacationsReportPage vacationsReportPage;
	
	
	@Step
	public void selectMonth(String month){
		vacationsReportPage.selectMonth(month);
	}

}
