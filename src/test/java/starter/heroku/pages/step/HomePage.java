package starter.heroku.pages.step;

import net.thucydides.core.annotations.Step;
import starter.heroku.pages.pageobject.HomePageObjectModel;

public class HomePage {

    HomePageObjectModel homePageObjectModel;

    @Step
    public void openWebsite(){
        homePageObjectModel.open();
    }

    @Step
    public void verifyWebsiteIsOpen(){
        homePageObjectModel.verifyWebsiteIsRunning();
    }
    @Step
    public void clickLink(String linkName){
        homePageObjectModel.clickLinks(linkName);
    }

}
