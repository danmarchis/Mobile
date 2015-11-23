package com.steps.serenity;

import java.util.ArrayList;
import java.util.List;

import com.pages.SiteMenuPage;
import com.pages.VacationTrackerPage;

import net.thucydides.core.annotations.Step;
import tools.EmployeeVacationModel;

public class VerifyColumnTypesSteps {

	VacationTrackerPage vacationTracker;
	SiteMenuPage sitePage;
	
	@Step
	public List<EmployeeVacationModel> grabVacationsList(){
		List<EmployeeVacationModel> finalResultList = new ArrayList<EmployeeVacationModel>(); 
		do{
			List<EmployeeVacationModel> partialList = vacationTracker.grabEmployeeVacationsList();
			finalResultList.addAll(partialList);
		}while(vacationTracker.isNextPresent());
		
		return finalResultList;
	}

	@Step
	public void verifyIfApplicationDisplayCorrectTypes(String type) {

		List<EmployeeVacationModel> result = grabVacationsList();
		vacationTracker.verifyDeparment(result, type);

	}
	
	@Step
	public void verifyIfNoStatusElementsAreAllowedInStatusColumn() {

		List<EmployeeVacationModel> result = grabVacationsList();
		vacationTracker.verifyStautusColumn(result);

		// nextPageTrack();
	}
	
	@Step
	public void verifyIfColumnIsInAscendingOrder(String type) {
		vacationTracker.selectColumn(type);
		List<EmployeeVacationModel> result = grabVacationsList();
		vacationTracker.verifyStautusColumnIsInAscendingOrder(result,type);
	}
	
	@Step
	public void verifyIfStatusColumnIsInDescendingOrder(String type) {
		vacationTracker.selectColumn(type);
		vacationTracker.selectColumn(type);
		//vacationTracker.clickOnStatusColumnHeader();
		
		//vacationTracker.clickOnStatusColumnHeader();
		List<EmployeeVacationModel> result = grabVacationsList();
		vacationTracker.verifyStautusColumnIsInDescendingOrder(result,type);
		
	}
}