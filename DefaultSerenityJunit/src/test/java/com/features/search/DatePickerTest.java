package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.EndUserSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.NewVacationRequestSteps;



import com.steps.serenity.TrackerSteps;
import com.pages.LoginPage;
import com.steps.serenity.LoginSteps;



@RunWith(SerenityRunner.class)

public class DatePickerTest {


	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
    public LoginSteps logInSteps;
   
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;

    @Test
    public void new_simple_request() 
    {
    	logInSteps.is_the_home_page();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(19, "Nov", 2015);
    	newVacationRequestSteps.selectEndDate(20, "Nov", 2015);
    	newVacationRequestSteps.MaternityLeaveBox();
    	newVacationRequestSteps.select_MaternityLeaveOptionConcediu();
    	newVacationRequestSteps.enter_DurationBox("Mar");
    	newVacationRequestSteps.enter_InstitutionBox("Para");
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
    	//newVacationRequestSteps.selectHoliday();
    	//NewVacationRequestPage.selectVacationWithoutPayment();
    	
    	
    }
} 

