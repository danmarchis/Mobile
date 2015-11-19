package com.pages;

import ch.lambdaj.function.convert.Converter;
import constantPckg.ConstantClass;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl(ConstantClass.BASE_URL)
public class LoginPage extends PageObject{
	//WebElement element;
			@FindBy(id="_58_login")
			private WebElementFacade screenName;
			
			@FindBy(id="_58_password")
		    private WebElementFacade password;
			
			//@FindBy(jquery=":submit")
			@FindBy(css="input[type='submit']")
			private WebElementFacade buttonClick;
			
			public void add_screen_name(String keyword) {
				screenName.type(keyword);
			}
			public void add_password(String keyword) {
				password.type(keyword); 
			}
			
			public void click_login(){
				//element.sendKeys(Keys.ENTER);
				 buttonClick.click();
				
				
		    }
			
			
			
			
}
