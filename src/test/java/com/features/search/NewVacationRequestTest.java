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
	public SignOutSteps signout;
   
    @Steps
    public NewVacationRequestSteps newVacationRequestSteps;

    @Test
    public void Holiday_request() 
    {
    	logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(15, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(15, "Oct", 2018);
    	newVacationRequestSteps.Holiday();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_Holiday();
        myrequest.click_OneToFiveDays();
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("15/10/2018");
        signout.signOut();
    
    }

   
    @Test
    public void Vacation_without_payment_request() 
    {
    	logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(16, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(16, "Oct", 2018);
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
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("16/10/2018");
        signout.signOut();
    }

    
    @Test
    public void SickLeave_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(17, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(17, "Oct", 2018);
    	newVacationRequestSteps.SickLeaveBox();
        newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SickLeave();
        myrequest.click_OneToFiveDays();
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("17/10/2018");
        signout.signOut();
    	
    }


    @Test
    public void Special_Vacation_Marriage_request()
    {
        logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(18, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(18, "Oct", 2018);
    	newVacationRequestSteps.SpecialVacationBox();
        newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SpecialVacation();
        myrequest.click_OneToFiveDays();
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("18/10/2018");
    	signout.signOut();
    }


    @Test
    public void Special_Vacation_ChildBirth_request()
    {
        logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(19, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(19, "Oct", 2018);
    	newVacationRequestSteps.SpecialVacationBox();
        newVacationRequestSteps.select_SpecialVacationOptionChildBirth();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SpecialVacation();
        myrequest.click_OneToFiveDays();
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("19/10/2018");
    	signout.signOut();
    }

    @Test
    public void Special_Vacation_Funeral_request()
    {
        logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(22, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(22, "Oct", 2018);
    	newVacationRequestSteps.SpecialVacationBox();
        newVacationRequestSteps.select_SpecialVacationOptionFuneral();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SpecialVacation();
        myrequest.click_OneToFiveDays();
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("22/10/2018");
    	signout.signOut();
    }
    

    @Test
    public void Special_Vacation_Other_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(23, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(23, "Oct", 2018);
    	newVacationRequestSteps.SpecialVacationBox();
        newVacationRequestSteps.select_SpecialVacationOptionOther();
    	newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_SpecialVacation();
        myrequest.click_OneToFiveDays();
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("23/10/2018");
    	signout.signOut();
    }


    @Test
    public void MaternityLeave_Prenatal_Postnalat_request()
    {
        logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(24, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(24, "Oct", 2018);
    	newVacationRequestSteps.MaternityLeaveBox();
        newVacationRequestSteps.CommentClick();
    	newVacationRequestSteps.enter_CommentBox("Mama are mere");
    	newVacationRequestSteps.Save();
        newVacationRequestSteps.verifyMessage("Your request completed successfully.");
        myrequest.click_MyRequestFromLeftMenu();
        myrequest.click_MaternityLeave();
        myrequest.click_OneToFiveDays();
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("24/10/2018");
    	signout.signOut();
    }

    @Test
    public void MaternityLeave_Concediu_Ingrijire_Copii_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.loginAsTester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(25, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(25, "Oct", 2018);
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
        myrequest.select_VacationStatusCheckAllBox();
        myrequest.click_Apply();
        myrequest.showEmployeeIfExistStartDate("25/10/2018");
    	signout.signOut();
    }

    
    

} 

