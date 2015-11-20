package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class InboxPage extends PageObject {
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_multipleApproveButton")
    private WebElementFacade approveButton;
    
    @FindBy(id="_evovacation_WAR_EvoVacationportlet_multipleRejectButton")
    private WebElementFacade rejectButton;

    @FindBy(name="_evovacation_WAR_EvoVacationportlet_allRowIds")
    private WebElementFacade tickAll;
	
    @FindBy(className="aui-paginator-link aui-paginator-next-link")
    private WebElementFacade nextPageButton;
    
    @FindBy(className="aui-paginator-link aui-paginator-last-link")
    private WebElementFacade lastPage;
    
    @FindBy(className="aui-paginator-link aui-paginator-prev-link")
    private WebElementFacade previousPage;
    
    @FindBy(className="aui-paginator-link aui-paginator-first-link")
    private WebElementFacade firstPage;
    
    @FindBy(css="a[href*='menuItem=inbox']")
    private WebElementFacade inbox;
    
    @FindBy(css="ul.nav-tabs li:nth-child(2)")
    private WebElementFacade assignedToOthers;

    public void click_inbox12(){
		 inbox.click();
		
    }
    
    public void tick_all(){
		 tickAll.click();
		
   }
    
    public void approve_all(){
		 approveButton.click();
		
  }

    public void reject_all(){
		 rejectButton.click();
		
 }
    public void click_assigntoothers(){
    	assignedToOthers.click();
		
 }
}