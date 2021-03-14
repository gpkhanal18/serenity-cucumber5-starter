package starter.heroku.pages.pageobject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageObjectModel extends PageObject {

    public void clickLinks(String linkName){
        $(By.linkText(linkName)).waitUntilClickable();
        $(By.linkText(linkName)).click();
    }

    public void verifyWebsiteIsRunning(){
        String title = getDriver().getTitle();
        System.out.println("title is " + title);
        assertThat(title, Matchers.is("The Internet"));
    }

}
