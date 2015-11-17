package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;

@RunWith(SerenityRunner.class)
public class AccessEvoportal {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps endUser;

	@Test
	public void login_in_vacation_tool_as_a_PM() {
		endUser.is_the_home_page();
		//endUser.looks_for("emilian.melian1", "Allthe+best25");
		endUser.login_as_PM();
		

	}
}
