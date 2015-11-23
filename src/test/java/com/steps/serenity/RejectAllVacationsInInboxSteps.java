package com.steps.serenity;

import com.pages.InboxPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RejectAllVacationsInInboxSteps extends ScenarioSteps {
	
	InboxPage inbox2;

	
	@Step
	public void clickInboxPage() {
		inbox2.clickInbox12();
	}
	
	@Step
	public void tickAllVacations() {
		inbox2.tickAll();
	}
	
	@Step
	public void approveAllVacations() {
		inbox2.rejectAll();
	}
     
}
