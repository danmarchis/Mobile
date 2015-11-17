package com.pages;


import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(ConstantClass.BASE_URL)
public class TrackerPage extends PageObject {
	
	
    
    @FindBy(css="a[href*='orderByCol=employeName']")
	private WebElementFacade employeeName;
    

    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_trackerStartDate")
  	private WebElementFacade startDate;
      
    
	
	public void sortByEmployeeName(){
		employeeName.click();
	}
	
	public void clickStartDate(){
		startDate.click();
	}
    
}
