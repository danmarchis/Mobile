package com.steps.serenity;

import com.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ApproveAllVacationsinInbox extends ScenarioSteps {
	LoginPage dictionaryPage;

	@Step
	public void enters(String k1, String k2) {
		dictionaryPage.add_screen_name(k1);
		dictionaryPage.add_password(k2);

	}
}