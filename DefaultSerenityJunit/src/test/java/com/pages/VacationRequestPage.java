package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class VacationRequestPage extends PageObject {
	@FindBy(css = "input[name='startDate']")
	private WebElementFacade startDate;

	@FindBy(css = "input[name='endDate']")
	private WebElementFacade endDate;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CO']")
	private WebElementFacade holiday;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_type_CF']")
	private WebElementFacade vacationwithoutpayment;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CM")
	private WebElementFacade SickLeave;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CS")
	private WebElementFacade SpecialVacation;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_ML")
	private WebElementFacade MaternityLeave;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_newVacationComment")
	private WebElementFacade Comment;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_commentContent")
	private WebElementFacade Comment_Box;

	@FindBy(name = "duration")
	private WebElementFacade Duration_Box;

	@FindBy(name = "institution")
	private WebElementFacade Institution_Box;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade Save;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_cancelButton")
	private WebElementFacade Cancel;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_specialReason=MARRIAGE")
	private WebElementFacade Marriage;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_specialReason")
	private WebElementFacade SpecialVacationOption;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_maternityLeave")
	private WebElementFacade MaternityLeaveOption;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_specialReason")
	private WebElementFacade specialVacationOptionChildBirth;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_maternityLeave")
	private WebElementFacade maternityLeaveOptionPrenatal;

	public void selectSpecialVacationType() {
		element(specialVacationOptionChildBirth).waitUntilVisible();
		specialVacationOptionChildBirth.selectByValue("FUNERAL");
	}

	public void selectSpecialVacationType_ChildBirth() {
		element(specialVacationOptionChildBirth).waitUntilVisible();
		specialVacationOptionChildBirth.selectByValue("CHILD_BIRTH");
	}
	public void selectSpecialVacationType_Other() {
		element(specialVacationOptionChildBirth).waitUntilVisible();
		specialVacationOptionChildBirth.selectByValue("OTHER");
	}
	
	public void selectMaternityLeaveType_Concediu() {
		element(maternityLeaveOptionPrenatal).waitUntilVisible();
		maternityLeaveOptionPrenatal.selectByValue("CIC");
	}
	
	
	public void click_startDate() {
		element(startDate).waitUntilVisible();
		startDate.click();
	}

	public void click_endDate() {
		endDate.click();
	}

	
	

	public void click_holiday() {
		holiday.click();
	}


	public void click_SickLeave() {
		SickLeave.click();
	}

	public void click_SpecialVacation() {
		SpecialVacation.click();
	}
	

	public void click_MaternityLeave() {
		MaternityLeave.click();
	}

	public void click_Save() {
		Save.click();
	}

	public void click_VacationWithoutPayment() {
		vacationwithoutpayment.click();
	}

	public void click_SpecialVacation_Marriage() {
		Marriage.click();
	}

	public void click_Comment() {
		Comment.click();
	}

	public void enter_Comment(String keyword) {
		Comment_Box.type(keyword);
	}

	public void click_SpecialVacationBoxOption() {
		SpecialVacationOption.click();
	}

	
    public void enter_DurationAndDomain(String keyword){
    	Duration_Box.type(keyword);
    }

    public void enter_InstitutionName(String keyword){
    	Institution_Box.type(keyword);
    }
    


}