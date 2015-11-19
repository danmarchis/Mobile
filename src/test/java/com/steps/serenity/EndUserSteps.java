package com.steps.serenity;

import com.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void enters_username(String keyword) {
    	dictionaryPage.enter_username(keyword);
    }

    @Step
    public void enters_password(String keyword) {
    	dictionaryPage.enter_password(keyword);
    }

    @Step
    public void starts_login() {
        dictionaryPage.lookup_terms();
    }


    @Step
    public void is_the_home_page() {
    	dictionaryPage.open();
}

    @Step
    public void looks_for(String username , String password) {
        enters_username(username);
        enters_password(password);
        starts_login();
        
    }
}

  /*@Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

 

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}
    
*/