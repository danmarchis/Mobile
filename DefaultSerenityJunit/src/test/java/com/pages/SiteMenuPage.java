package com.pages;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl(ConstantClass.BASE_URL)
public class SiteMenuPage extends PageObject {
	
	@FindBy(css="a[href*='menuItem=inbox']")
    private WebElementFacade inbox;
    
    @FindBy(css="a[href*='menuItem=view-vacations']")
    private WebElementFacade viewVacations;

    @FindBy(css="a[href*='menuItem=vacation-report']")
    private WebElementFacade vacationReport;
	
    @FindBy(css="a[href*='menuItem=vacation-tracker']")
    private WebElementFacade vacationTrack;
    
    @FindBy(css="a[href*='menuItem=new-request']")
    private WebElementFacade newRequest;
    
    @FindBy(css="a[href*='menuItem=my-requests']")

    private WebElementFacade newMyRequests;
    
    @FindBy(css = "a[href*='menuItem=new-request']")
    private WebElementFacade newVacationRequest;
    
    @FindBy(id="_145_userAvatar")
    private WebElementFacade userAvatar;
    
    @FindBy(css = "a[href*='logout']")
    private WebElementFacade signOut;

    private WebElementFacade myRequest;

    
    public void accesTracker(){
    	vacationTrack.click();
    }
    

    @FindBy(css="a[href*='orderByCol=employeName']")
	private WebElementFacade employeeName;
	

	
	public void sortByEmployeeName(){
		employeeName.click();
	}
    

    public void accesNewVacation(){
    	newRequest.click();
    }
    
    public void accesUserOptions(){
    	userAvatar.click();
    }
    
    public void signOutOption(){
    	signOut.click();
    }
    
    public void accesMyRequest(){
    	myRequest.click();
    }
    
    public void accesViewVacation(){
    	viewVacations.click();
    }
    
    
    public void create_page_newMyRequests() {
     newMyRequests.click();
    }
    
    
 
    public void create_page_newVacationRequest() 
    {
     newVacationRequest.click();
    }

}
