package com.pages;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(ConstantClass.BASE_URL)
public class MyRequestPage extends PageObject{

	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	    private WebElementFacade pendingCheckBox;

	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_applyButton")
	    private WebElementFacade applyButton;

	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	    private WebElementFacade HolidayButton;
	 
	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	    private WebElementFacade VacationWithoutPaymentButton;

	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	    private WebElementFacade SpecialVacationButton;
	 
	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	    private WebElementFacade SickLeaveButton;

	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	    private WebElementFacade MaternityLeaveButton;

	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	    private WebElementFacade OneToFiveDaysButton;

	 
	 public void Holiday(){
		 HolidayButton.click();
	 }
	 
	 public void VacationWithoutPayment(){
		 VacationWithoutPaymentButton.click();
	 }
	 
	 public void SpecialVacation(){
		 SpecialVacationButton.click();
	 }
	 
	 public void SickLeave(){
		 SickLeaveButton.click();
	 }
	 
	 public void MaternityLeave(){
		 MaternityLeaveButton.click();
	 }
	 public void OneToFiveDays(){
		 OneToFiveDaysButton.click();
	 }
	 public void Pending(){
		 pendingCheckBox.click();
	 }
}
