package com.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
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
public class VacationTrackerPage extends PageObject {
	// a[href*='orderByCol=status&_evovacation_WA'
	@FindBy(css = "a[href*='orderByCol=employeName']")
	private WebElementFacade employeeName;

	@FindBy(css = "a[href*='orderByCol=status&_evovacation_WA']")
	private WebElementFacade statusColumn;
	// datePicker

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_trackerEndDate")
	private WebElementFacade endDate;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_trackerStartDate")
	private WebElementFacade startDate;

	// Page list container
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_vacationTrackerTable")
	private WebElement vacationContainer;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade numberOfPageDropDown;
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

	@FindBy(css = "table tbody th:nth-child(1) a")
	private WebElementFacade employeeNameColumn;

	@FindBy(css = "#departments dl dt div.hida")
	private WebElementFacade dropDownDepartaments;

	@FindBy(css = "#departments div.mutliSelect ul")
	private WebElementFacade departmentsContainer;

	@FindBy(css = "select.aui-field-input-menu ")
	private WebElementFacade rowsNumber;

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

	public void clickEmployeeNameColumn() {
		employeeNameColumn.click();
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

	public void setNumberOfRows(String numberOfRows) {
		// departamentscheckAll.click();
		numberOfPageDropDown.click();
		// waitABit(500);
		List<WebElement> numberOfRowsList = rowsNumber.findElements(By.cssSelector("option"));
		System.out.println("lista");
		for (WebElement rowsElement : numberOfRowsList) {
			System.out.println("element: " + rowsElement.getText());
			if (rowsElement.getText().contains(numberOfRows)) {
				rowsElement.click();

				System.out.println(rowsElement.getText().contains(numberOfRows));
				break;
			}

		}
	}

	public void selectColumn(String type) {
		if (type == "Status") {
			clickOnStatusColumnHeader();
			waitABit(500);
		}
		if (type == "Employee name") {
			clickEmployeeNameColumn();
			waitABit(500);
		}

	}

	public void verifyThatTypeIsCorrectInDepartmentColumn(String type) {
		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td.col-department"));
		boolean found = true;
		for (WebElement row : rows) {
			System.out.println("ceasdsdsd:" + row.getText());
			if (row.getText().contains(type)) {
				found = true;
			} else {
				found = false;
				Assert.assertTrue("The row does not contains the expected type", found);
				break;
			}

		}

	}

	/*
	 * 
	 * public int getNumberOfPages() { String number; int pages = 0;
	 * List<WebElement> rows =
	 * getDriver().findElements(By.cssSelector(".aui-paginator-total")); for
	 * (WebElement row : rows) { number = row.getText().toString().split("of "
	 * )[1].replace(')', ' ').split(" ")[0]; pages = Integer.parseInt(number);
	 * 
	 * } return pages; }
	 */
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

	public void ifTypeisCorrect(String terms) {
		for (int i = 0; i < 2; i++) {
			System.out.println("Ruleaza");
			// List<EmployeeVacationModel> result = grabVacationsList();
			// verifyThatTypeIsCorrectInDepartmentColumn(terms);
			goToNextPage();
			waitABit(2000);
			System.out.println(i);
		}
	}

	public List<EmployeeVacationModel> grabEmployeeVacationsList() {
		element(resultListContainer).waitUntilVisible();

		List<EmployeeVacationModel> resultList = new ArrayList<EmployeeVacationModel>();

		List<WebElement> entryList = resultListContainer
				.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		int i = 1;
		for (WebElement webElement : entryList) {

			System.out.println("Element : " + i++ + webElement.getText());

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

	public void verifyDeparment(List<EmployeeVacationModel> ListElements, String type) {

		for (EmployeeVacationModel department : ListElements) {

			Assert.assertTrue("The row does not contains the expected type", department.getDepartment().contains(type));

		}
	}

	public void nextPage() {
		while (nextButton.isCurrentlyVisible()) {
			nextButton.click();
		}
		//

	}

	public void verifyDepartment(String department) {
		List<WebElement> departmentList = getDriver().findElements(By.cssSelector(""));

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

	public boolean isNext() {
		boolean result = false;
		element(vacationContainer).waitUntilVisible();
		List<WebElement> nextButtonList = vacationContainer.findElements(By.cssSelector(".aui-paginator-next-link"));
		if (nextButtonList.size() > 0) {
			if (nextButtonList.get(0).getTagName().contentEquals("a")) {
				// nextButtonList.get(0).click();
				result = true;
			}
		}
		return result;
	}

	public void getNumberOfRows() {
		numberOfPageDropDown.click();

	}

	public void verifyStautusColumn(List<EmployeeVacationModel> ListElements) {
		// EmployeeVacationModel model = new EmployeeVacationModel();

		// List<String> officialList = Arrays.asList("Rejected", "Approved",
		// "Cancelled", "Withdrawn", "Pending");
		List<String> officialList = (List<String>) ConstantClass.OFFICIAL_STATUS_LIST;
		// sau incearca cu status_list
		for (String string : officialList) {
			System.out.println("official list  " + string);
		}

		List<String> listFromTable = new ArrayList<String>();

		for (EmployeeVacationModel status : ListElements) {

			String stat = status.getStatus();
			listFromTable.add(status.getStatus());
			// Assert.assertTrue("The row does not contains the expected type",
			// department.getDepartment().contains(type));
		}

		List<String> listBeforeNoDuplicate = new ArrayList<String>(new LinkedHashSet<String>(listFromTable));

		for (String string : listBeforeNoDuplicate) {
			System.out.println("Verify if no duplicate " + string);
		}

		if (officialList.equals(listBeforeNoDuplicate)) {
			System.out.println("lists are equal");
		} else {
			System.out.println("lists are not equal");
		}

		boolean noElement = false;
		// List<String> uncommon = new ArrayList<String> ();
		for (String s : listBeforeNoDuplicate) {
			if (!officialList.contains(s)) {
				Assert.assertTrue(s + " :was found but should not appear in status column !!!", false);
			}

		}
		for (String s : officialList) {
			// if (!listBeforeNoDuplicate.contains(s)) uncommon.add(s);
			Assert.assertTrue(s + " :was found but should not appear in status column !!!",
					!listBeforeNoDuplicate.contains(s));
		}

		System.out.println("   ");
		System.out.println("   ");

		// for (String string : uncommon) {
		// System.out.println("this element is not a status "+string);

	}
	/*
	 * boolean equallist=false; if(uncommon.size()>0){ Assert.assertTrue(
	 * "List contain an non-status element in status column  ", equallist); }
	 * 
	 */

	public void clickOnStatusColumnHeader() {
		statusColumn.click();
		waitABit(500);
		// TODO Auto-generated method stub

	}

	public void verifyStautusColumnIsInAscendingOrder(List<EmployeeVacationModel> employeeList, String expectedString) {
		// List<EmployeeVacationModel> resultList = result;

		List<String> firstList = new ArrayList<String>();
		List<String> secondList = new ArrayList<String>();

		if (expectedString == "Status") {
			for (EmployeeVacationModel employeeNow : employeeList) {
				String stat = employeeNow.getStatus();
				firstList.add(stat);
				secondList.add(stat);
			}
		}
		if (expectedString == "Employee name") {
			for (EmployeeVacationModel employeeNow : employeeList) {
				String stat = employeeNow.getEmployeeName();
				firstList.add(stat);
				secondList.add(stat);
			}
		}
		Collections.sort(secondList);

		boolean notEqual = false;
		if (!secondList.equals(firstList)) {
			Assert.assertTrue("Status colums is not sorted in ascending order", notEqual);
		}

	}

	public void verifyStautusColumnIsInDescendingOrder(List<EmployeeVacationModel> employeeList,
			String expectedString) {
		List<String> firstList = new ArrayList<String>();
		List<String> secondList = new ArrayList<String>();
		// EmployeeVacationModel column =column22;
		if (expectedString == "Status") {
			for (EmployeeVacationModel employeeNow : employeeList) {
				String stat = employeeNow.getStatus();
				firstList.add(stat);
				secondList.add(stat);
			}
		}
		if (expectedString == "Employee name") {
			for (EmployeeVacationModel employeeNow : employeeList) {
				String stat = employeeNow.getEmployeeName();
				firstList.add(stat);
				secondList.add(stat);
			}
		}

		Collections.sort(secondList);
		Collections.reverse(secondList);

		boolean notEqual = false;
		if (!secondList.equals(firstList)) {
			Assert.assertTrue("Status" + expectedString + "  is not sorted in descending order", notEqual);
		}

	}

	public void verifyStartDate(List<EmployeeVacationModel> results, String startDate2) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateInString = startDate2;

		java.util.Date date1 = formatter.parse(dateInString);

		List<String> startDateList = new ArrayList<String>();

		for (EmployeeVacationModel startDateColumn : results) {

			String statDate = startDateColumn.getStartDate(); // java.util.Date
			startDateList.add(statDate);

		}

		String minStartDate = Collections.min(startDateList);
		System.out.println(minStartDate);
		java.util.Date date2 = formatter.parse(minStartDate);

		System.out.println("data1   " + date1);
		System.out.println("Data2   " + date2);

		boolean before = false;
		if (date1.compareTo(date2) < 0) {
			System.out.println("Date1 is before Date2");

			// System.out.println(date);
			// System.out.println(formatter.format(date));
			Assert.assertTrue("In Start Date Column there are a date that is earlier than selected start Date", before);

		} else {
			System.out.println("ok");
		}

	}

	public void verifyIfApplicationDisplayCorrectNumberOfRows(String rowsNumber2) {
		do {
			verifyNumberOfRowsInPage();
		} while (isNextPresent());

	}

	public void verifyNumberOfRowsInPage() {
		element(resultListContainer).waitUntilVisible();

		List<EmployeeVacationModel> resultList = new ArrayList<EmployeeVacationModel>();

		List<WebElement> entryList = resultListContainer
				.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		int i = 1;
		for (WebElement webElement : entryList) {

			System.out.println("Element : " + i++ + webElement.getText());

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
			/*
			 * if(isNext()){ if(i<=5){ continue; }
			 */
			if (!isNext()) {
				if (i > 5) {
					Assert.assertTrue("There are more number of rows in page ", false);
					break;
				} else {
					System.out.println("tutul e bine");
					break;
				}
			}
		}
	}

}

// }
