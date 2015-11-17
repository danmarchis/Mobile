package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.Inbox;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ApproveAllVacationsinInboxSteps extends ScenarioSteps {
	Inbox inbox1;

	
	
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
     
	@Steps
	public LoginSteps endUser;
	
	public void login_in_vacation_tool_as_a_DM() {
		// TODO Auto-generated method stub
		endUser.is_the_home_page();
		endUser.looks_for("ioanahoaghia1", "parola.12");
	
	}
}