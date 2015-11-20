package com.steps.serenity;

import com.pages.ViewVacationsPage;
import com.pages.InboxPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.pages.SiteMenuPage;

public class ViewVacationsSteps extends ScenarioSteps { 
ViewVacationsPage viewVacations;

@Step
	public void click_view_vacation() {
	viewVacations.accesViewVacation();
}

@Step
public void tick_holiday_type(){
	viewVacations.checkHoliday();
}

@Step
public void tick_pending_status() {
	viewVacations.checkPending();
}

@Step
public void click_apply_button() {
viewVacations.clickApply();
}

@Step
public void check_registration_content(String mesage) {
viewVacations.verifyThatTypeIsCorrect(mesage);
}


}
