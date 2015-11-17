package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.SiteMenuPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps extends ScenarioSteps {
	LoginPage dictionaryPage;
	SiteMenuPage  sitePage;

	@Step
	public void enters(String k1, String k2) {
		dictionaryPage.add_screen_name(k1);
		dictionaryPage.add_password(k2);

	}

	@Step
	public void start_login() {
		dictionaryPage.click_login();
	}

	@Step
	public void is_the_home_page() {
		dictionaryPage.open();
	}

	@Step
	public void looks_for(String term1, String term2) {
		enters(term1, term2);
		start_login();
	}
	
	public void login_as_PM(){
		enters("emilian.melian1","Allthe+best25");
		start_login();
	}
	
	@Step
	public void login_as_DM(){
		enters("ioanahoaghia1","parola.12");
		start_login();
	}
	
	@Step
	public void login_as_tester(){
		enters("dan.marchis1","barosanu");
		start_login();
	}
	
	@Step
	public void access_track_tab(){
		sitePage.accesTracker();
	}
	public void access_newVacationRequest_tab(){
		sitePage.accesNewVacation();
	}
	
}
