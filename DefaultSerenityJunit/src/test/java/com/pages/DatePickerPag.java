package com.pages;

import java.util.List;

import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(ConstantClass.BASE_URL)
public class DatePickerPag extends PageObject {

	@FindBy(css = "[style*='display: block'] .dp_caption")
	private WebElementFacade title;

	@FindBy(css = "[style*='display: block'] .dp_yearpicker td")
	private List<WebElementFacade> yearList;

	@FindBy(css = "[style*='display: block'] .dp_monthpicker td")
	private List<WebElementFacade> monthList;

	@FindBy(css = "[style*='display: block'] .dp_daypicker td:not([class*='disabled'])")
	private List<WebElementFacade> dayList;

	public void setDate(int day, String month, int year) {
		// click twice on title to open year view
		title.click();
		title.click();

		//select year
		for (WebElementFacade i : yearList)
			if (i.getText().contentEquals(Integer.toString(year))) {
				i.click();
				break;
			}

		//select month
		for (WebElementFacade i : monthList)
			if (i.getText().contentEquals(month)) {
				i.click();
				break;
			}

		//select day
		for (WebElementFacade i : dayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				break;
			}

	}

}