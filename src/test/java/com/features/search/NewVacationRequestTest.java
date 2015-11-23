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
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(1, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(1, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("01/10/2018");
        signout.sign_out();
    
    }

   
    @Test
    public void Vacation_without_payment_request() 
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(2, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(2, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("02/10/2018");
        signout.sign_out();
    }

    
    @Test
    public void SickLeave_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(3, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(3, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("03/10/2018");
        signout.sign_out();
    	
    }


    @Test
    public void Special_Vacation_Marriage_request()
    {
        logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(4, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(4, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("04/10/2018");
    	signout.sign_out();
    }


    @Test
    public void Special_Vacation_ChildBirth_request()
    {
        logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(5, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(5, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("05/10/2018");
    	signout.sign_out();
    }

    @Test
    public void Special_Vacation_Funeral_request()
    {
        logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(8, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(8, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("08/10/2018");
    	signout.sign_out();
    }
    

    @Test
    public void Special_Vacation_Other_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(9, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(9, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("09/10/2018");
    	signout.sign_out();
    }

    
    @Test
    public void MaternityLeave_Prenatal_Postnalat_request()
    {
        logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(10, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(10, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("10/10/2018");
    	signout.sign_out();
    }

    @Test
    public void MaternityLeave_Concediu_Ingrijire_Copii_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(11, "Oct", 2018);
    	newVacationRequestSteps.selectEndDate(11, "Oct", 2018);
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
        myrequest.showEmployeeIfExistStartDate("11/10/2018");
    	signout.sign_out();
    }

    
    

} 

