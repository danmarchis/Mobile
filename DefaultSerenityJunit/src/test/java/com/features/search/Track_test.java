package com.features.search;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.steps.serenity.TrackerSteps;
import com.pages.LoginPage;
import com.steps.serenity.LoginSteps;

@RunWith(SerenityRunner.class)
public class Track_test {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	
	public LoginSteps endUser;

	@Test
	public void access_tracker_tab() {
		endUser.is_the_home_page();
		endUser.login_as_PM();
		endUser.access_track_tab();

	}
	
}
