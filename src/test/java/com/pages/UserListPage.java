package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class UserListPage extends PageObject{
	
	@FindBy(css = ".taglib-search-iterator")
	private WebElement listContainer;
	
	public void findUserAndImpersonate(String name){
		element(listContainer).waitUntilVisible();
		
		List<WebElement> entryList = listContainer.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));
		
		for (WebElement elementNow : entryList) {
			if(elementNow.findElement(By.cssSelector(".col-screen-name")).getText().contains(name)){
				WebElement actionButton = elementNow.findElement(By.cssSelector(".nobr"));
				actionButton.click();
				waitABit(500);
				WebElement actionsContainer = getDriver().findElement(By.cssSelector("div.lfr-menu-list div.lfr-component"));
				actionsContainer.findElement(By.cssSelector("a[id*='impersonate']")).click();
				waitABit(5000);
				
			}
		}
	}
}
