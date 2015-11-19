package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import tools.EmployeeVacationModel;

@DefaultUrl(ConstantClass.BASE_URL)
public class TrackerPage extends PageObject {

	@FindBy(css = "a[href*='orderByCol=employeName']")
	private WebElementFacade employeeName;

	// datePicker

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_trackerEndDate")
	private WebElementFacade endDate;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_trackerStartDate")
	private WebElementFacade startDate;
	
	//Page list container
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_vacationTrackerTable")
	private WebElement vacationContainer;

	// end

	public String departament_name;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_buildingsALLCheckbox")
	private WebElementFacade checkAll;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox")
	private WebElementFacade departamentscheckAll;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_QA DepartmentCheckbox")
	private WebElementFacade checkMobileDep;

	@FindBy(css = "#buildings dl dt div.hida")
	private WebElementFacade dropDownBilding;

	@FindBy(css = "#departments dl dt div.hida")
	private WebElementFacade dropDownDepartaments;

	@FindBy(css = "#departments div.mutliSelect ul")
	private WebElementFacade departmentsContainer;

	@FindBy(css = "#buildings div.mutliSelect ul")
	private WebElementFacade buildingContainer;

	@FindBy(css = "a.aui-paginator-next-link")
	private WebElementFacade nextButton;

	@FindBy(css = "div.results-grid")
	private WebElementFacade resultListContainer;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade dropDownButton;
	
	public void sortByEmployeeName() {
		employeeName.click();
	}

	public void checkMobileDepartament() {
		checkMobileDep.click();
	}

	public void applyButtonClick() {
		applyButton.click();
	}

	public void clickDropDownDepartaments() {
		dropDownDepartaments.click();
	}

	public void clickDropDownBilding() {
		dropDownBilding.click();
	}

	public void clickDropDownAll() {
		checkAll.click();
	}

	public void clickDepartamentsDropDownAll() {
		departamentscheckAll.click();
	}
	// datePicker

	public void click_startDate() {
		element(startDate).waitUntilVisible();
		startDate.click();
	}

	public void click_endDate() {
		endDate.click();
	}

	public void setBuilding(String buildingName) {
		// element(dropDownDepartaments).waitUntilVisible();
		// dropDownDepartaments.click();
		// departamentscheckAll.click();
		List<WebElement> buildingtList = buildingContainer.findElements(By.cssSelector("li"));
		System.out.println("lista");
		for (WebElement buildingElement : buildingtList) {
			System.out.println("element: " + buildingElement.getText());
			if (buildingElement.getText().contains(buildingName)) {
				buildingElement.click();
				System.out.println(buildingElement.getText().contains(buildingName));
				break;
			}
			// buildingElement.findElement(By.cssSelector("input")).click();
			// System.out.println(" aici = " + buildingElement.getText());
			// break;
		}
	}

	public void setDepartment(String departmentName) {
		// element(dropDownDepartaments).waitUntilVisible();
		// dropDownDepartaments.click();
		// departamentscheckAll.click();
		List<WebElement> departmentList = departmentsContainer.findElements(By.cssSelector("li"));
		System.out.println("lista");
		for (WebElement departmentElement : departmentList) {
			System.out.println("element: " + departmentElement.getText());
			if (departmentElement.getText().contains(departmentName)) {
				departmentElement.click();

				System.out.println(departmentElement.getText().contains(departmentName));
				break;
			}
			// departmentElement.findElement(By.cssSelector("input")).click();
			// System.out.println(" aici = " + departmentElement.getText());
			// break;
		}
	}

	public void verifyThatTypeIsCorrectInDepartmentColumn(String type) {
		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td.col-department"));
		boolean found = true;
		for (WebElement row : rows) {
			System.out.println("ceasdsdsd:" + row.getText());
			if (row.getText().contains(type)) {
				found = true;
			}
			else{
				found=false;
				Assert.assertTrue("The row does not contains the expected type", found);
				break;
			}
	
		}
		
	}

	public int getNumberOfPages() {
		String number;
		int pages = 0;
		List<WebElement> rows = getDriver().findElements(By.cssSelector(".aui-paginator-total"));
		for (WebElement row : rows) {
			number = row.getText().toString().split("of ")[1].replace(')', ' ').split(" ")[0];
			pages = Integer.parseInt(number);

		}
		return pages;
	}

	public void goToNextPage() {
		nextButton.click();

	}
	/*
	 * public void CheckListIsSorted(String building, String department){
	 * List<WebElement> rows = getDriver().findElements(By.cssSelector(
	 * "table tbody tr td:nth-child(5) ")); for (WebElementFacade i :
	 * buildingList) Assert.assertTrue(i.getText().contentEquals(building));
	 * 
	 * for (WebElementFacade i : departmentList)
	 * Assert.assertTrue(i.getText().contains(department)); }
	 */
	
	public void ifTypeisCorrect(String terms){
		for (int i = 0; i < 2; i++) {
			System.out.println("Ruleaza");
		//	List<EmployeeVacationModel> result = grabVacationsList();
		//	verifyThatTypeIsCorrectInDepartmentColumn(terms);
			goToNextPage();
			waitABit(2000);
			System.out.println(i);
			}
	}

	public List<EmployeeVacationModel> grabEmployeeVacationsList() {
		element(resultListContainer).waitUntilVisible();
		
		List<EmployeeVacationModel> resultList = new ArrayList<EmployeeVacationModel>();
		
		List<WebElement> entryList = resultListContainer.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		
		for (WebElement webElement : entryList) {
			System.out.println("Element: " + webElement.getText());
			EmployeeVacationModel entryNow = new EmployeeVacationModel();
			
			String name = webElement.findElement(By.cssSelector("td.col-employee-name")).getText();
			String startDate = webElement.findElement(By.cssSelector("td[class*='start.date']")).getText();
			String endDate = webElement.findElement(By.cssSelector("td[class*='end.date']")).getText();
			String building = webElement.findElement(By.cssSelector("td.col-building")).getText();
			String department = webElement.findElement(By.cssSelector("td.col-department")).getText();
			String type = webElement.findElement(By.cssSelector("td[class*='type']")).getText();
			String status = webElement.findElement(By.cssSelector("td[class*='status']")).getText();



				
			entryNow.setEmployeeName(name);
			entryNow.setStartDate(startDate);
			entryNow.setEndDate(endDate);
			entryNow.setBuilding(building);
			entryNow.setDepartment(department);
			entryNow.setType(type);
			entryNow.setStatus(status);

			resultList.add(entryNow);
			
		}
		
		return resultList;
	}
	
	public void verifyDeparment(List<EmployeeVacationModel> ListElements,String type){
		
		for (EmployeeVacationModel department : ListElements) {
				Assert.assertTrue("The row does not contains the expected type", department.getDepartment().contains(type));
			}
		}

	public void nextPage() {
		while(nextButton.isCurrentlyVisible()){
			nextButton.click();
		}
		//
		
	}

	public void clickOnDropDown() {
		
		
	}
	
	public void verifyDepartment(String department){
		List<WebElement> departmentList = getDriver().findElements(By.cssSelector(""));
		
		
	}

	public boolean isNextPresent() {
		boolean result = false;
		element(vacationContainer).waitUntilVisible();
		List<WebElement> nextButtonList = vacationContainer.findElements(By.cssSelector(".aui-paginator-next-link"));
		if(nextButtonList.size() > 0){
			if(nextButtonList.get(0).getTagName().contentEquals("a")){
				nextButtonList.get(0).click();
				result = true;
			}
		}
		return result;
	}

	
	}
	
