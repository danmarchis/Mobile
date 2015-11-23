package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ViewVacationsPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holidayCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElementFacade vacationWithoutPaymentCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElementFacade SpecialVacationCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElementFacade sickLeaveCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_MATERNITY_LEAVECheckbox")
	private WebElementFacade maternityLeaveCheckBOx;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade oneFiveDaysCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElementFacade pendingCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElementFacade approvedCheckBox;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade oneFiveCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;
	
	@FindBy(css = "a[href*='orderByCol=startDate']")
	private WebElementFacade startDateHeaderFilter;
	
	@FindBy(css = ".aui-paginator-next-link")
    private WebElementFacade nextPageButton;

	@FindBy(css = "a[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacations;

	public void accesViewVacation() {
		viewVacations.click();
	}

	public void checkHoliday() {
		holidayCheckBox.click();
	}

	public void checkVacationWithoutPayment() {
		vacationWithoutPaymentCheckBox.click();
	}

	public void checkPending() {
		pendingCheckBox.click();
	}

	public void checkOneFive() {
		oneFiveCheckBox.click();
	}
	
	public void clickApply() {
		applyButton.click();

	}
	
	public void clickStartDayFilter() {
		startDateHeaderFilter.click();

	}
	
	public void nextPage() {
		nextPageButton.click();

	}

	/*public class noRegistrations extends Exception {

		public noRegistrations(String message) {
			super(message);
		}

	}*/

	
		
		
	public void verifyThatTypeIsCorrect(String message) {
		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(8) a"));
			for (WebElement row : rows) {
				Assert.assertTrue("The row does not contain the expected type", row.getText().contentEquals(message));
			}
		}
	

	public void verifyThatStatusIsCorrect(String message) {
		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(9) a"));
			for (WebElement row : rows) {
				Assert.assertTrue("The row does not contain the expected type", row.getText().contentEquals(message));
			}
		}
	}

