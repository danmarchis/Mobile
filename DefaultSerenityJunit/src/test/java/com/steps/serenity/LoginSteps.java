package com.steps.serenity;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps extends ScenarioSteps {
	LoginPage dictionaryPage;

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

	
}
