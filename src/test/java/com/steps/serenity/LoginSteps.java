package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.SiteMenuPage;
import com.pages.TrackerPage;

import constantPckg.ConstantClass;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps extends ScenarioSteps {
	LoginPage dictionaryPage;
	SiteMenuPage  sitePage;
	TrackerPage  trkPage;

	@Step
	public void enters(String k1, String k2) {
		dictionaryPage.addScreenName(k1);
		dictionaryPage.add_password(k2);

	}

	@Step
	public void startLogin() {
		dictionaryPage.click_login();
	}

	@Step
	public void getHomePage() {
		dictionaryPage.open();
	}

	@Step
	public void looks_for(String term1, String term2) {
		enters(term1, term2);
		startLogin();
	}
	
	public void loginAsPM(){
		enters(ConstantClass.PM_NAME,ConstantClass.PM_PW);
		startLogin();
	}
	
	@Step
	public void loginAsDM(){
		enters(ConstantClass.DM_NAME,ConstantClass.DM_PW);
		startLogin();
	}
	
	@Step
	public void loginAsTester(){

	
		enters(ConstantClass.TESTER_NAME,ConstantClass.TESTER_PW);
		startLogin();
	}
	
	@Step
	public void access_track_tab(){
		sitePage.accesTracker();
	}
	
	@Step
	public void access_drop_build(){
	//	trkPage.dropDownBuild_clik();
	}
	
	
	@Step
	public void navigateTo(String URL){
		getDriver().get(URL);
	}
	

	public void access_newVacationRequest_tab(){
		sitePage.accesNewVacation();
	}



	
}
