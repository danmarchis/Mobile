package com.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://172.22.4.88:9090/login")
public class DictionaryPage extends PageObject {

    @FindBy(id="_58_login")
    private WebElementFacade username;
    
    @FindBy(id="_58_password")
    private WebElementFacade password;

    @FindBy(css= "input[type='submit']")
    private WebElementFacade lookupButton;
    
    @FindBy(css= "input[type='Vacation']")
    private WebElementFacade VacationButton;

    public void enter_username(String keyword) {
        username.type(keyword);
    }
    

    public void enter_password(String keyword) {
        password.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public void lookup_Vacation(){
    	VacationButton.click();
    }

}




    /*public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}
    
    */