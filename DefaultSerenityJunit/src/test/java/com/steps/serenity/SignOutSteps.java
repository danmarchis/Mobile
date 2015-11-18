package com.steps.serenity;
import com.pages.SiteMenuPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;



public class SignOutSteps extends ScenarioSteps{
	
	SiteMenuPage  sitePage;

	@Step
	public void access_user_options(){
		sitePage.accesUserOptions();
	}
	
	@Step
	public void sign_out(){
		sitePage.signOutOption();
	}
	
	
	
}
