package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.SiteMenuPage;
import com.pages.TrackerPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class TrackerSteps extends ScenarioSteps  {
	
	TrackerPage tracker;
	SiteMenuPage  sitePage;
	
	@Step
	public void access_track_tab(){
		sitePage.accesTracker();
	}
	
	@Step
	public void sort_by_employee(){
		tracker.sortByEmployeeName();
	}

}
