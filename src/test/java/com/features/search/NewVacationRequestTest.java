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
    	newVacationRequestSteps.selectStartDate(13, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(13, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("13/04/2018");
        signout.signOut();
    
    }

   /*
    @Test
    public void Vacation_without_payment_request() 
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(3, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(3, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("3/04/2018");
        signout.sign_out();
    }

    
    @Test
    public void SickLeave_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(4, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(4, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("4/04/2018");
        signout.sign_out();
    	
    }


    @Test
    public void Special_Vacation_Marriage_request()
    {
        logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(5, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(5, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("5/04/2018");
    	signout.sign_out();
    }


    @Test
    public void Special_Vacation_ChildBirth_request()
    {
        logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(6, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(6, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("6/04/2018");
    	signout.sign_out();
    }

    @Test
    public void Special_Vacation_Funeral_request()
    {
        logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(9, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(9, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("9/04/2018");
    	signout.sign_out();
    }
    

    @Test
    public void Special_Vacation_Other_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(10, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(10, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("10/04/2018");
    	signout.sign_out();
    }


    @Test
    public void MaternityLeave_Prenatal_Postnalat_request()
    {
        logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(11, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(11, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("11/04/2018");
    	signout.sign_out();
    }

    @Test
    public void MaternityLeave_Concediu_Ingrijire_Copii_request()
    {
    	logInSteps.getHomePage();
    	logInSteps.login_as_tester();
    	newVacationRequestSteps.click_NewVacationRequestFromTheLeftMenu();
    	newVacationRequestSteps.selectStartDate(12, "Apr", 2018);
    	newVacationRequestSteps.selectEndDate(12, "Apr", 2018);
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
        myrequest.showEmployeeIfExistStartDate("12/04/2018");
    	signout.sign_out();
    }

    
    
*/
} 

