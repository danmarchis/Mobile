package com.steps.serenity;

import com.pages.ViewVacationsPage;
import com.pages.InboxPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.pages.SiteMenuPage;

public class ViewVacationsSteps extends ScenarioSteps {
	ViewVacationsPage viewVacations;

	@Step
	public void clickViewVacation() {
		viewVacations.accesViewVacation();
	}

	@Step
	public void tickHolidayType() {
		viewVacations.checkHoliday();
	}

	@Step
	public void tickPendingStatus() {
		viewVacations.checkPending();
	}

	@Step
	public void clickApplyButton() {
		viewVacations.clickApply();
	}

	@Step
	public void checkRegistrationContent(String message) {
		viewVacations.verifyThatTypeIsCorrect(message);
	}

	@Step
	public void checkRegistrationStatus(String message) {
		viewVacations.verifyThatStatusIsCorrect(message);
	}

}
