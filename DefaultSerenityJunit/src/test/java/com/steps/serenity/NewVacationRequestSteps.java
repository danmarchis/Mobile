package com.steps.serenity;

import com.pages.DatePickerPag;
import com.pages.SiteMenuPage;
import com.pages.VacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps  extends ScenarioSteps {
	VacationRequestPage newVacationRequestPage;
	SiteMenuPage vacationOptionsPage;

	DatePickerPag datePickerDanPage;


	@Step
	public void selectStartDate(int day, String month, int year) {
		newVacationRequestPage.click_startDate();

		datePickerDanPage.setDate(day, month, year);
	}
	
	

	@Step
	public void click_NewVacationRequestFromTheLeftMenu() {
		vacationOptionsPage.create_page_newVacationRequest();
	}

	@Step
	public void selectEndDate(int day, String month, int year) {
		newVacationRequestPage.click_endDate();
        datePickerDanPage.setDate(day, month, year);
	}
	
	
	 @Step
	    public void Holiday() {
	        newVacationRequestPage.click_holiday();
	    }

     @Step
        public void Save(){
    	 newVacationRequestPage.click_Save();
     }

     @Step
         public void VacationWithoutPayment(){
    	 newVacationRequestPage.click_VacationWithoutPayment();
    	 
    	}
     @Step
         public void SickLeaveBox(){
    	 newVacationRequestPage.click_SickLeave();
     }
     @Step
         public void SpecialVacationBox(){
    	 newVacationRequestPage.click_SpecialVacation();
     }
     
     @Step
         public void MaternityLeaveBox(){
    	 newVacationRequestPage.click_MaternityLeave();
     }
     
      @Step
         public void CommentClick(){
    	 newVacationRequestPage.click_Comment();
     }
     @Step
         public void enter_CommentBox(String keyword){
    	 newVacationRequestPage.enter_Comment(keyword);
     }

    

     @Step
     public void select_SpecialVacationOptionFuneral(){
    	 newVacationRequestPage.selectSpecialVacationType_Funeral();
     }
     @Step
     public void select_SpecialVacationOptionChildBirth(){
    	 newVacationRequestPage.selectSpecialVacationType_ChildBirth();
     }
     @Step
     public void select_SpecialVacationOptionOther(){
    	 newVacationRequestPage.selectSpecialVacationType_Other();
     }
     @Step
     public void select_MaternityLeaveOptionConcediu(){
    	 newVacationRequestPage.selectMaternityLeaveType_Concediu();
     }
    @Step
     public void enter_DurationBox(String keyword){
    	 newVacationRequestPage.enter_DurationAndDomain(keyword);
     }


    @Step
    public void enter_InstitutionBox(String keyword){
    	newVacationRequestPage.enter_InstitutionName(keyword);
    }

    @Step
    public void verifyMessage(String message) {
    		newVacationRequestPage.verify_Message(message);
    }
}
