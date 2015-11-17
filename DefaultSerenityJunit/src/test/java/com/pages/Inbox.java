package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26_evovacation_WAR_EvoVacationportlet_backURL%3D%252Fvacation%253Fp_p_id%253Devovacation_WAR_EvoVacationportlet%2526p_p_lifecycle%253D0%2526p_p_state%253Dnormal%2526p_p_mode%253Dview%2526p_p_col_id%253Dcolumn-1%2526p_p_col_count%253D1%2526_evovacation_WAR_EvoVacationportlet_backURL%253D%25252Fvacation%25253Fp_p_id%25253Devovacation_WAR_EvoVacationportlet%252526p_p_lifecycle%25253D0%252526p_p_state%25253Dnormal%252526p_p_mode%25253Dview%252526p_p_col_id%25253Dcolumn-1%252526p_p_col_count%25253D1%252526_evovacation_WAR_EvoVacationportlet_backURL%25253D%2525252Fvacation%252526_evovacation_WAR_EvoVacationportlet_menuItem%25253Dinbox%2526_evovacation_WAR_EvoVacationportlet_menuItem%253Dinbox%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dinbox&_evovacation_WAR_EvoVacationportlet_menuItem=inbox")
public class Inbox extends PageObject {
	
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

    public void click_inbox12(){
		 inbox.click();
		
    }
    
    public void tick_all(){
		 tickAll.click();
		
   }
    
    public void approve_all(){
		 approveButton.click();
		
  }

}