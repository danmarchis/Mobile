package com.steps.serenity;

import com.pages.SiteMenuPage;
import com.pages.VacationTrackerPage;

import net.thucydides.core.annotations.Step;

public class VacationTrackerSelectFiltersSteps {
	VacationTrackerPage tracker;
	SiteMenuPage sitePage;

	@Step
	public void showDropDownBuilding() {
		tracker.clickDropDownBilding();
	}

	@Step
	public void showDropDownAll() {
		tracker.clickDropDownAll();
	}

	@Step
	public void showDropDownDepartaments() {
		tracker.clickDropDownDepartaments();
	}

	@Step
	public void checkAllInDepartamentsDropDown() {
		tracker.clickDepartamentsDropDownAll();
	}

	@Step
	public void chooseDepartaments(String depName) {
		tracker.setDepartment(depName);
	}

	@Step
	public void clickApply() {
		tracker.applyButtonClick();
	}

	@Step
	public void chooseNumeberOfRowsInPage(String number) {
		tracker.setNumberOfRows(number);
		
	}

	public void chooseNumeberOfRowsInPage1(String rowsNumber) {
		tracker.verifyIfApplicationDisplayCorrectNumberOfRows(rowsNumber);
		
	}
}
