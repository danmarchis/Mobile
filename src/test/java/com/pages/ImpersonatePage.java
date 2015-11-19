package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(ConstantClass.ENV_URL)

public class ImpersonatePage extends PageObject {

	@FindBy(id = "_145_mySites")
	private WebElement goTo;

	@FindBy(id = "aui_3_4_0_1_1346")
	private WebElement controlPanel;

	@FindBy(id = "_160_portlet_125")
	private WebElement usersOrganizations;

	@FindBy(css = "span.aui-search-bar input.aui-field-input-text")
	private WebElement searchField;

	@FindBy(css = "span.aui-search-bar span.aui-button-content")
	private WebElement searchFormContainer;

	public void goToOption() {
		goTo.click();
	}

	public void controlPanelOption() {
		controlPanel.click();
	}

	public void usersOrganizationsOption() {
		usersOrganizations.click();
	}

	public void nameField() {
		element(searchField).waitUntilVisible();
		searchField.click();
	}

	public void searchOptionClick() {
		element(searchFormContainer).waitUntilVisible();
		searchFormContainer.click();
	}

	public void enter_username(String keyword) {
		searchField.sendKeys(keyword);
	}

}
