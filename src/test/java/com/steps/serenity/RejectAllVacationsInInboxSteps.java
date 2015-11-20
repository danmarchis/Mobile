package com.steps.serenity;

import com.pages.InboxPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RejectAllVacationsInInboxSteps extends ScenarioSteps {
	
	InboxPage inbox2;

	
	@Step
	public void click_inbox_page() {
		inbox2.click_inbox12();
	}
	
	@Step
	public void tick_all_vacations() {
		inbox2.tick_all();
	}
	
	@Step
	public void approve_all_vacations() {
		inbox2.reject_all();
	}
     
}
