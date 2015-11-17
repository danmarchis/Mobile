package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.SiteMenuPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class TrackerSteps extends ScenarioSteps  {
	
	SiteMenuPage tracker;
	
	@Step
	public void access_track_tab(){
		tracker.accesTracker();
	}
	

}
