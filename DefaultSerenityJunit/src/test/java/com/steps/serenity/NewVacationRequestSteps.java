package com.steps.serenity;

import com.pages.DatePickerPag;
import com.pages.SiteMenuPage;
import com.pages.VacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps  extends ScenarioSteps {
	VacationRequestPage newVacationRequestPage;
	SiteMenuPage vacationOptionsPage;
	DatePickerPag datePickerBernadettPage;

	@Step
	public void selectStartDate(int day, String month, int year) {
		newVacationRequestPage.click_startDate();
		datePickerBernadettPage.setDate(day, month, year);
	}

	@Step
	public void click_NewVacationRequestFromTheLeftMenu() {
		vacationOptionsPage.create_page_newVacationRequest();
	}

	@Step
	public void selectEndDate(int day, String month, int year) {
		newVacationRequestPage.click_endDate();
		datePickerBernadettPage.setDate(day, month, year);
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
         public void Marriage(){
    	 newVacationRequestPage.click_SpecialVacation_Marriage();
     }

     @Step
         public void CommentClick(){
    	 newVacationRequestPage.click_Comment();
     }
     @Step
         public void enter_CommentBox(String keyword){
    	 newVacationRequestPage.enter_Comment(keyword);
     }


}
