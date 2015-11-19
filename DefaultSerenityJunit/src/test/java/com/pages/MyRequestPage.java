package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import tools.EmployeeVacationModel;



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
	 
	 @FindBy(css=".lfr-search-container table tbody tr th:nth-child(1)")
	    private WebElementFacade StartDate;
	 
	 
	 @FindBy(css = "div[class='lfr-search-container '] tbody tr[class^='portlet-section-body results-row']")
	    private List<WebElement> tableRows;
	 
	 
	 

	 
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
     public void ApplyButton(){
    	 applyButton.click();
     }
     public void StartDate(){
		 StartDate.click();
	 }


     





}
