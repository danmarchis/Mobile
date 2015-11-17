package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DatePickerPage {
	
	
	@FindBy(css="input[type='button']")
	private WebElementFacade startDate;
	
	
	@FindBy(css="input[type='button']")
	private WebElementFacade endDate;
	
	
	public void selectStartDate(){
		
	}
	
	public void selectEndDate(){
		
	}
}
