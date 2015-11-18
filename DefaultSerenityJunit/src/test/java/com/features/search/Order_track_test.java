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
public class Order_track_test {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	
	public LoginSteps endUser;
	
	@Steps
	public TrackerSteps trUser;

	@Test
	public void verify_if_you_can_sort_a_column_by_clicking_on_a_specifiv_column_head() {
		endUser.is_the_home_page();
		endUser.login_as_PM();
		endUser.access_track_tab();
		trUser.sort_by_employee1();
		trUser.clickStartDate();

	}
	
}
