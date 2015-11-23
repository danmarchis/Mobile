package com.steps.serenity;

import com.pages.InboxPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ApproveAllVacationsAssignedToOthersInboxSteps extends ScenarioSteps {
	InboxPage inbox1;

	
	
	@Step
	public void clickInboxPage() {
		inbox1.clickInbox12();
	}
	
	@Step
	public void clickAssignToOthers() {
		inbox1.click_assigntoothers();
	}
	
	@Step
	public void tickAllVacations() {
		inbox1.tickAll();
	}
	
	@Step
	public void approveAllVacations() {
		inbox1.approveAll();
	}
     
}
