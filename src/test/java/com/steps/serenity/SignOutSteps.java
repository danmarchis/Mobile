package com.steps.serenity;

import com.pages.SiteMenuPage;

import constantPckg.ConstantClass;
import freemarker.template.utility.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignOutSteps extends ScenarioSteps {

	SiteMenuPage sitePage;
	
	@Step
	public void access_user_options() {
		sitePage.accesUserOptions();
	}

	@Step
	public void signOut() {
		sitePage.openAt(ConstantClass.ENV_URL + "/c/portal/logout");
	}

}
