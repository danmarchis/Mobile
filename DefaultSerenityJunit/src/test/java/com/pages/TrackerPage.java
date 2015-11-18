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
    
    //datePicker
    
    @FindBy (id="_evovacation_WAR_EvoVacationportlet_trackerEndDate")
	private WebElementFacade endDate;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_trackerStartDate")
  	private WebElementFacade startDate;
    
	//end
	
 
      
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_applyButton")
  	private WebElementFacade applyButton;
    
    
    
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_buildingsALLCheckbox")
  	private WebElementFacade checkAll;
    
    
    @FindBy(css = "#buildings dl dt div.hida")
  	private WebElementFacade dropDownBilding;
    
	
	public void sortByEmployeeName(){
		employeeName.click();
	}
	
	
	
	
	public void applyButtonClick(){
		applyButton.click();
	}
	
	
	public void clickDropDownBilding(){
		dropDownBilding.click();
	}
	
	public void clickDropDownAll(){
		checkAll.click();
	}
	
	//datePicker
	
	public void click_startDate() 
    {
		element(startDate).waitUntilVisible();
		startDate.click();
    }

	public void click_endDate() {
		endDate.click();
	}
    //end 
}