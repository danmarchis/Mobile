package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ViewVacationsPage extends PageObject {
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
    private WebElementFacade holidayCheckBox;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
    private WebElementFacade vacationWithoutPaymentCheckBox;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
    private WebElementFacade SpecialVacationCheckBox;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
    private WebElementFacade sickLeaveCheckBox;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
    private WebElementFacade maternityLeaveCheckBOx;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
    private WebElementFacade oneFiveDaysCheckBox;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
    private WebElementFacade pendingCheckBox;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
    private WebElementFacade approvedCheckBox;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_applyButton")
    private WebElementFacade applyButton;
    
    @FindBy(css="a[href*='menuItem=view-vacations']")
    private WebElementFacade viewVacations;
    
    public void accesViewVacation(){
    	viewVacations.click();
    }
    
    public void checkHoliday(){
    	holidayCheckBox.click();
    }
    
    public void checkVacationWithoutPayment(){
    	vacationWithoutPaymentCheckBox.click();
    }
    
    public void checkPending(){
    	pendingCheckBox.click();
    }
 
    public void clickApply(){
    	applyButton.click();
}
}

    
