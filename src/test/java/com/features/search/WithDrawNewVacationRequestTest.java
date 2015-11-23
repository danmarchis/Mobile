package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.EndUserSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.NewVacationRequestSteps;
import com.steps.serenity.SignOutSteps;
import com.steps.serenity.TrackerSteps;
import com.pages.LoginPage;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.MyRequestSteps;



@RunWith(SerenityRunner.class)

public class WithDrawNewVacationRequestTest {


	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
    public LoginSteps logInSteps;
	
	@Steps
	public MyRequestSteps myrequest;
	
	@Steps
	public SignOutSteps signout;
   
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;
    
    @Test    
    public void Holiday_request() 
    {
    	logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(4, "Dec", 2018);
    	newVacationRequestSteps.selectEndDate(4, "Dec", 2018);
    	newVacationRequestSteps.Holiday();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        newVacationRequestSteps.select_WithDraw();
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_Holiday();
        myrequest.click_OneToFiveDays();
        myrequest.click_WithDrawnBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("04/12/2018");
        signout.signOut();
    
    }
    
}