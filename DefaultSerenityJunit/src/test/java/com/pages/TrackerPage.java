package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(ConstantClass.BASE_URL)
public class TrackerPage extends PageObject {

	@FindBy(css = "a[href*='orderByCol=employeName']")
	private WebElementFacade employeeName;

	// datePicker

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_trackerEndDate")
	private WebElementFacade endDate;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_trackerStartDate")
	private WebElementFacade startDate;

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
		//element(dropDownDepartaments).waitUntilVisible();
		//dropDownDepartaments.click();
		//departamentscheckAll.click();
		List<WebElement> buildingtList = buildingContainer.findElements(By.cssSelector("li"));
		System.out.println("lista");
		for (WebElement buildingElement : buildingtList) {
			System.out.println("element: " + buildingElement.getText());
			if (buildingElement.getText().contains(buildingName)) {
				buildingElement.click();
				System.out.println(buildingElement.getText().contains(buildingName));
				break;
			}
			//buildingElement.findElement(By.cssSelector("input")).click();
			//System.out.println(" aici = " + buildingElement.getText());
			//break;
		}
	}

	public void setDepartment(String departmentName) {
		//element(dropDownDepartaments).waitUntilVisible();
		//dropDownDepartaments.click();
		//departamentscheckAll.click();
		List<WebElement> departmentList = departmentsContainer.findElements(By.cssSelector("li"));
		System.out.println("lista");
		for (WebElement departmentElement : departmentList) {
			System.out.println("element: " + departmentElement.getText());
			if (departmentElement.getText().contains(departmentName)) {
				departmentElement.click();
				
				System.out.println(departmentElement.getText().contains(departmentName));
				break;
			}
//			departmentElement.findElement(By.cssSelector("input")).click();
//			System.out.println(" aici = " + departmentElement.getText());
//			break;
		}
	}
	
	public void verifyThatTypeIsCorrect(String type) {
		  List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td.col-department "));
		  for (WebElement row : rows) {
			  /*
			  if(!row.getText().contains(type)){
				  System.out.println("The row does not contains the expected type");
			  }
			  else {
				  System.out.println("The row contains the expected type");
			  }
			  */
		  Assert.assertTrue("The row does not contains the expected type", row.getText().contains(type));
		   
		  }
		 }
	
	
/*
		public void CheckListIsSorted(String building, String department){
			List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(5) "));
		  for (WebElementFacade i : buildingList)
		   Assert.assertTrue(i.getText().contentEquals(building));
		  
		  for (WebElementFacade i : departmentList)
		   Assert.assertTrue(i.getText().contains(department));
		 }
		 */
}
	

