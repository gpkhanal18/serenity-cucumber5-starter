package starter.heroku.pages;

import net.thucydides.core.annotations.Step;
import starter.heroku.pages.pageobject.FramesPageObjectModel;

public class FramesPage {

    FramesPageObjectModel framesPageObjectModel;

    @Step
    public void verifyFramesPageIsDisplayed(){
        framesPageObjectModel.verifyFramesPageIsDisplayed();
    }
}
