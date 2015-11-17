package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation")
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
    
    
}
