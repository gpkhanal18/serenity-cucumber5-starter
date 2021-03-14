package starter.heroku.pages;

import net.thucydides.core.annotations.Step;
import starter.heroku.pages.pageobject.CheckBoxPageObjectModel;

public class CheckboxPage {

    CheckBoxPageObjectModel checkBoxPageObjectModel;

    @Step
    public void verifyCheckboxPageIsDisplayed(){
        checkBoxPageObjectModel.verifyCheckBoxPageIsDisplayed();
    }
}
