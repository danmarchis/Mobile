package com.steps.serenity;

import java.util.ArrayList;
import java.util.List;

import com.pages.DatePickerPag;
import com.pages.MyRequestPage;
import com.pages.SiteMenuPage;
import com.pages.VacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import tools.EmployeeVacationModel;

public class MyRequestSteps extends ScenarioSteps {

	SiteMenuPage MyRequests;
	MyRequestPage Request;

	@Step
	public void click_MyRequestFromLeftMenu() {
		MyRequests.create_page_newMyRequests();
	}

	@Step
	public void click_Holiday() {
		Request.Holiday();
	}

	@Step
	public void click_VacationWithoutPayment() {
		Request.VacationWithoutPayment();
	}

	@Step
	public void click_SpecialVacation() {
		Request.SpecialVacation();
	}

	@Step
	public void click_SickLeave() {
		Request.SickLeave();
	}

	@Step
	public void click_MaternityLeave() {
		Request.MaternityLeave();
	}

	@Step
	public void click_OneToFiveDays() {
		Request.OneToFiveDays();
	}

	@Step
	public void click_Pending() {
		Request.Pending();
	}

	@Step
	public void click_Apply() {
		Request.ApplyButton();
	}

	@Step
	public void click_StartDate() {
		Request.StartDate();
	}

	@Step
	public void select_VacationStatusCheckAllBox() {
		Request.VacationStatusCheckAllBox();
	}

	@Step
	public List<EmployeeVacationModel> grabVacationsList() {
		List<EmployeeVacationModel> finalResultList = new ArrayList<EmployeeVacationModel>();
		do {
			List<EmployeeVacationModel> partialList = Request.grabEmployeeVacationsList();
			finalResultList.addAll(partialList);
		} while (Request.isNextPresent());

		return finalResultList;
	}

	@Step
	public void showEmployeeIfExistStartDate(String type) {

		List<EmployeeVacationModel> result = grabVacationsList();
		Request.verifyStartDate(result, type);

	}

}
