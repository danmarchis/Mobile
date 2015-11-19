package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.SiteMenuPage;
import com.pages.TrackerPage;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import tools.EmployeeVacationModel;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class TrackerSteps extends ScenarioSteps {

	TrackerPage tracker;
	SiteMenuPage sitePage;

	@Step
	public void access_track_tab() {
		sitePage.accesTracker();
	}
	
	
	@Step
	public void selectclickEmployeeNameColumn() {
		tracker.clickEmployeeNameColumn();
	}
	@Step
	public void sort_by_employee() {
		tracker.sortByEmployeeName();
	}

	@Step
	public void clickApply() {
		tracker.applyButtonClick();
	}

	@Step
	public void showDropDownBuilding() {
		tracker.clickDropDownBilding();
	}

	@Step
	public void showDropDownDepartaments() {
		tracker.clickDropDownDepartaments();
	}

	@Step
	public void showDropDownAll() {
		tracker.clickDropDownAll();
	}

	@Step
	public void showDepartamentsDropDownAll() {
		tracker.clickDepartamentsDropDownAll();
	}

	@Step
	public void sort_by_employee1() {
		tracker.sortByEmployeeName();
	}

	@Step
	public void clickStartDate() {
		// tracker.clickStartDate();
	}

	public void checkMobile() {
		tracker.checkMobileDepartament();

	}
	
	@Step
	public void chooseDepartaments(String depName) {
		tracker.setDepartment(depName);
	}

	@Step
	public void chooseBuildings(String buildName) {
		tracker.setBuilding(buildName);
	}

	@Step
	public void showIfTypeIsCorrect(String type) {
		tracker.verifyThatTypeIsCorrectInDepartmentColumn(type);
	}

	@Step
	public void verifyThatTypeIsCorrect(String terms) {

		tracker.ifTypeisCorrect(terms);
	}
	
	@Step
	public List<EmployeeVacationModel> grabVacationsList(){
		List<EmployeeVacationModel> finalResultList = new ArrayList<EmployeeVacationModel>(); 
		do{
			List<EmployeeVacationModel> partialList = tracker.grabEmployeeVacationsList();
			finalResultList.addAll(partialList);
		}while(tracker.isNextPresent());
		
		return finalResultList;
	}
	
	
	
	@Step
	public void showEmployeeVacationsList(String type){
	
		List<EmployeeVacationModel> result = grabVacationsList();	
		tracker.verifyDeparment(result,type) ;
		
	//	nextPageTrack();
	}
	
	/*
	@Step
	public void showIfElementsAreWellSorted(String type){
	
		List<EmployeeVacationModel> result = grabVacationsList();	
		tracker.verifySortedColumn(result) ;
		*/
	//	nextPageTrack();
	
	/*
	 * public void showIfDepartamentTypeIsCorrect(){
	 * tracker.verifyIfDepartamentSelectedIsTrue(); }
	 */

	

	public void verifyIfCanChooseAnEndDateThatIsEarlierThanTheStartDate() {
		// preluate start date and end date
		//
	}

	public void selectNumberOfRowsInPage() {
		// TODO Auto-generated method stub
		tracker.clickOnDropDown();
		
	}
}
