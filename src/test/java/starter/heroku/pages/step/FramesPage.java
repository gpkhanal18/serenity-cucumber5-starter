package starter.heroku.pages.step;

import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import starter.heroku.pages.pageobject.FramesPageObjectModel;

public class FramesPage {

    FramesPageObjectModel framesPageObjectModel;

    @Step
    @Screenshots(onlyOnFailures=true)
    public void verifyFramesPageIsDisplayed(){
        framesPageObjectModel.verifyFramesPageIsDisplayed();
    }
}
