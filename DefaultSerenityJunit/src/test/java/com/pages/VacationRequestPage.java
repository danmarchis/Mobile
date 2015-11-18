package com.pages;
import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class VacationRequestPage extends PageObject
{
	@FindBy (css = "input[name='startDate']")
	private WebElementFacade startDate;
	
	@FindBy (css = "input[name='endDate']")
	private WebElementFacade endDate;
	

	@FindBy (css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CO']")
	private WebElementFacade holiday;
	
	@FindBy (css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CF']")
	private WebElementFacade vacationwithoutpayment;
	
	
	public void click_startDate() 
    {
		element(startDate).waitUntilVisible();
		startDate.click();
    }

	public void click_endDate() {
		endDate.click();
	}
	
	@FindBy (id="_evovacation_WAR_EvoVacationportlet_trackerEndDate")
	private WebElementFacade endDate1;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_trackerStartDate")
  	private WebElementFacade startDate1;
	
	public void click_startDate1() 
    {
		element(startDate1).waitUntilVisible();
		startDate1.click();
    }

	public void click_endDate1() {
		endDate1.click();
	}
}