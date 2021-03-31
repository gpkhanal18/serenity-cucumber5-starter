package starter.heroku.pages.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class FramesPageObjectModel extends PageObject {

    public void verifyFramesPageIsDisplayed(){
        String currentUrl = getDriver().getCurrentUrl();
        assertThat(currentUrl, Matchers.containsString("frames"));
    }
    
}
