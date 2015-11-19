package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VacationsReportPage extends PageObject {
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_exportMonth")
	private WebElementFacade month_box;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_exportYear")
	private WebElementFacade year_box;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_pending")
	private WebElementFacade pending_radio;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_approved")
	private WebElementFacade approved_radio;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_exportTarget")
	private WebElementFacade cim_checkbox;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_exportButton")
	private WebElementFacade exportButton;
	
	public void crea(){
		//exportButton.selectByVisibleText(label)
	}
	
	
	
}
