package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VacationsReportPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportMonth")
	private WebElementFacade month_box;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportYear")
	private WebElementFacade year_box;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_pending")
	private WebElementFacade pending_radio;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_approved")
	private WebElementFacade approved_radio;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_CIM")
	private WebElementFacade cim_checkbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportButton")
	private WebElementFacade exportButton;

	public void crea(String label) {
		exportButton.selectByVisibleText(label);
	}

	public void check_pending() {
		pending_radio.click();
	}

	public void check_cim() {
		element(cim_checkbox).waitUntilVisible();
		cim_checkbox.click();
	}

	public void export() {
		exportButton.click();
	}
	
	@FindBy(css = "a[href*='menuItem=vacation-report']")
	private WebElementFacade vacationReport;
	
	public void exportMenu() {
		vacationReport.click();
	}
	
	@FindBy(css = "div.vacations-report")
	private WebElement filtersContainer;
	
	public void selectMonth(String month){
		element(filtersContainer).waitUntilVisible();
		WebElement monthSelect = filtersContainer.findElement(By.cssSelector("select[id*='exportMonth']"));
		//hack for element focus
		monthSelect.click();
		monthSelect.click();
		
		element(monthSelect).selectByVisibleText(month);
	
	}	
	
	public void selectYear(String year){
		element(filtersContainer).waitUntilVisible();
		WebElement yearSelect = filtersContainer.findElement(By.cssSelector("select[id*='exportYear']"));
		element(yearSelect).selectByVisibleText(year);
	
	}
	
	
}
