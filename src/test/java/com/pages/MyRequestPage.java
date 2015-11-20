package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import tools.EmployeeVacationModel;

@DefaultUrl(ConstantClass.BASE_URL)
public class MyRequestPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade pendingCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade HolidayButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade VacationWithoutPaymentButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElementFacade SpecialVacationButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElementFacade SickLeaveButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	private WebElementFacade MaternityLeaveButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade OneToFiveDaysButton;

	@FindBy(css = ".lfr-search-container table tbody tr th:nth-child(1)")
	private WebElementFacade StartDate;

	@FindBy(css = "div[class='lfr-search-container '] tbody tr[class^='portlet-section-body results-row']")
	private List<WebElement> tableRows;

	@FindBy(css = "a.aui-paginator-next-link")
	private WebElementFacade nextButton;
	
	@FindBy(css = "div.results-grid")
	private WebElementFacade resultListContainer;

	@FindBy (css= ".lfr-search-container ")
	private WebElement vacationContainer;
	
	@FindBy (id= "_evovacation_WAR_EvoVacationportlet_vacationStatusALLCheckbox")
	private WebElement VacationStatusAllCheckBox;
	
	
	public void VacationStatusCheckAllBox (){
		VacationStatusAllCheckBox.click();
	}

	public void Holiday() {
		HolidayButton.click();
	}

	public void VacationWithoutPayment() {
		VacationWithoutPaymentButton.click();
	}

	public void SpecialVacation() {
		SpecialVacationButton.click();
	}

	public void SickLeave() {
		SickLeaveButton.click();
	}

	public void MaternityLeave() {
		MaternityLeaveButton.click();
	}

	public void OneToFiveDays() {
		OneToFiveDaysButton.click();
	}

	public void Pending() {
		pendingCheckBox.click();
	}

	public void ApplyButton() {
		applyButton.click();
	}

	public void StartDate() {
		StartDate.click();
	}

	public List<EmployeeVacationModel> grabEmployeeVacationsList() {
		element(resultListContainer).waitUntilVisible();

		List<EmployeeVacationModel> resultList = new ArrayList<EmployeeVacationModel>();

		List<WebElement> entryList = resultListContainer
				.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));

		for (WebElement webElement : entryList) {
			System.out.println("Element: " + webElement.getText());
			EmployeeVacationModel entryNow = new EmployeeVacationModel();

			String startDate = webElement.findElement(By.cssSelector("td[class*='start.date']")).getText();
			String endDate = webElement.findElement(By.cssSelector("td[class*='end.date']")).getText();
			String type = webElement.findElement(By.cssSelector("td[class*='type']")).getText();
			String status = webElement.findElement(By.cssSelector("td[class*='status']")).getText();

			entryNow.setStartDate(startDate);
			entryNow.setEndDate(endDate);
			entryNow.setType(type);
			entryNow.setStatus(status);

			resultList.add(entryNow);

		}

		return resultList;
	}

	public void verifyStartDate(List<EmployeeVacationModel> ListElements, String type) {

		boolean isPresent = false;
		
		theFor:
		for (EmployeeVacationModel startDate : ListElements) {
			isPresent = startDate.getStartDate().contains(type);
			if(isPresent){
				break theFor;
			}
		}

		Assert.assertTrue("The row does not contains the expected type", isPresent);

	}

	public boolean isNextPresent() {
		boolean result = false;
		element(vacationContainer).waitUntilVisible();
		List<WebElement> nextButtonList = vacationContainer.findElements(By.cssSelector(".aui-paginator-next-link"));
		if (nextButtonList.size() > 0) {
			if (nextButtonList.get(0).getTagName().contentEquals("a")) {
				nextButtonList.get(0).click();
				result = true;
			}
		}
		return result;
	}

}
