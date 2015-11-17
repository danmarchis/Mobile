package com.pages;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(ConstantClass.BASE_URL)
public class MyRequestPage extends PageObject{

	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	    private WebElementFacade pendingCheckBox;

	 @FindBy(id="_evovacation_WAR_EvoVacationportlet_applyButton")
	    private WebElementFacade applyButton;
}
