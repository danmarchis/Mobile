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

public class NewVacationRequestTest {


	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
    public LoginSteps logInSteps;
	
	@Steps
	public MyRequestSteps myrequest;
   
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;

    @Test
    public void Holiday_request() 
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(5, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(5, "Feb", 2018);
    	newVacationRequestSteps.Holiday();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_Holiday();
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("5/02/2018");
    
    }

   
    @Test
    public void Vacation_without_payment_request() 
    {
   
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(6, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(6, "Feb", 2018);
    	newVacationRequestSteps.VacationWithoutPayment();
    	newVacationRequestSteps.enter_DurationBox("mar");
    	newVacationRequestSteps.enter_InstitutionBox("para");
        newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_VacationWithoutPayment();;
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("6/02/2018");
    }

    
    @Test
    public void SickLeave_request()
    {
   
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(7, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(7, "Feb", 2018);
    	newVacationRequestSteps.SickLeaveBox();
        newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SickLeave();
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("7/02/2018");
    	
    }


    @Test
    public void Special_Vacation_Marriage_request()
    {
   
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(8, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(8, "Feb", 2018);
    	newVacationRequestSteps.SpecialVacationBox();
        newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SpecialVacation();
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("8/02/2018");
    	
    }


    @Test
    public void Special_Vacation_ChildBirth_request()
    {
   
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(9, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(9, "Feb", 2018);
    	newVacationRequestSteps.SpecialVacationBox();
        newVacationRequestSteps.select_SpecialVacationOptionChildBirth();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SpecialVacation();
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("9/02/2018");
    	
    }

    @Test
    public void Special_Vacation_Funeral_request()
    {
   
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(12, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(12, "Feb", 2018);
    	newVacationRequestSteps.SpecialVacationBox();
        newVacationRequestSteps.select_SpecialVacationOptionFuneral();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SpecialVacation();
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("12/02/2018");
    	
    }

    @Test
    public void Special_Vacation_Other_request()
    {
   
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(13, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(13, "Feb", 2018);
    	newVacationRequestSteps.SpecialVacationBox();
        newVacationRequestSteps.select_SpecialVacationOptionOther();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SpecialVacation();
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("13/02/2018");
    	
    }


    @Test
    public void MaternityLeave_Prenatal_Postnalat_request()
    {
   
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(14, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(14, "Feb", 2018);
    	newVacationRequestSteps.MaternityLeaveBox();
        newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_MaternityLeave();
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("14/02/2018");
    	
    }

    @Test
    public void MaternityLeave_Concediu_Ingrijire_Copii_request()
    {
    	
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(19, "Feb", 2018);
    	newVacationRequestSteps.selectEndDate(19, "Feb", 2018);
    	newVacationRequestSteps.MaternityLeaveBox();
    	newVacationRequestSteps.select_MaternityLeaveOptionConcediu();
    	newVacationRequestSteps.enter_DurationBox("para");
    	newVacationRequestSteps.enter_InstitutionBox("mar");
        newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_MaternityLeave();
        myrequest.click_OneToFiveDays();
        myrequest.click_Pending();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("19/02/2018");
    	
    }

    
    

} 

