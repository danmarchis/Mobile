package com.steps.serenity;
import com.pages.DatePickerPag;
import com.pages.MyRequestPage;
import com.pages.SiteMenuPage;
import com.pages.VacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyRequestSteps extends ScenarioSteps {

	SiteMenuPage MyRequests;
	MyRequestPage Request;


  @Step
 public void click_MyRequestFromLeftMenu(){
	 MyRequests.create_page_newMyRequests();
 }
  public void click_Holiday(){
	  Request.Holiday();
  }
  public void click_VacationWithoutPayment(){
	  Request.VacationWithoutPayment();
  }
  public void click_SpecialVacation(){
	  Request.SpecialVacation();
  }
  public void click_SickLeave(){
	  Request.SickLeave();
  }
  public void click_MaternityLeave(){
	  Request.MaternityLeave();
  }
  public void click_OneToFiveDays(){
	  Request.OneToFiveDays();
  }
  public void click_Pending(){
	  Request.Pending();
  }
   public void click_Apply(){
	   Request.ApplyButton();
   }




}
