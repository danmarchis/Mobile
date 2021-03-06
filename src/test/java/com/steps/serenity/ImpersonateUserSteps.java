package com.steps.serenity;

import com.pages.ImpersonateUserPage;
import com.pages.UserListPage;

import constantPckg.ConstantClass;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ImpersonateUserSteps extends ScenarioSteps {

	ImpersonateUserPage impersonatePage;
	UserListPage userListPage;

	@Step
	public void go_to() {
		impersonatePage.goToOption();
	}

	@Step
	public void ctrl_panel() {
		impersonatePage.controlPanelOption();
	}

	@Step
	public void users_and_org() {
		impersonatePage.usersOrganizationsOption();
	}

	@Step
	public void name_field() {
		impersonatePage.nameField();
	}

	@Step
	public void enter_username(String keyword) {
		impersonatePage.enterUsername(keyword);
	}

	@Step
	public void search_option() {
		impersonatePage.searchOptionClick();
	}

	@Step
	public void findUserAndImpersonate(String string) {
		userListPage.findUserAndImpersonate(string);
	}
	
	@Step
	public void navigateTo(String URL){
		getDriver().get(URL);
	}
	
	@Step
	public void sign_out() {
		impersonatePage.openAt(ConstantClass.ENV_URL + "/c/portal/logout");
	}
	
	
}
