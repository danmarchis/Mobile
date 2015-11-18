package com.steps.serenity;

import com.pages.Inbox;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ApproveAllVacationsAssignedToOthersInbox extends ScenarioSteps {
	Inbox inbox1;

	
	
	@Step
	public void click_inbox_page() {
		inbox1.click_inbox12();
	}
	
	@Step
	public void click_assign_to_others() {
		inbox1.click_assigntoothers();
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