package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.InboxPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ApproveAllVacationsinInboxSteps extends ScenarioSteps {
	InboxPage inbox1;

	
	
	@Step
	public void click_inbox_page() {
		inbox1.click_inbox12();
	}
	
	@Step
	public void tick_all_vacations() {
		inbox1.tick_all();
	}
	
	@Step
	public void approve_all_vacations() {
		inbox1.approve_all();
	}
     
}