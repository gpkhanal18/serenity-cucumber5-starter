package starter.heroku.pages.pageobject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.Matchers;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageObjectModel extends PageObject {

    @FindAll({
            @FindBy(how = How.LINK_TEXT, using = "Frames2222"),
            @FindBy(how = How.LINK_TEXT, using = "password333"),
            @FindBy(how = How.LINK_TEXT, using = "password222"),
            @FindBy(how = How.LINK_TEXT, using = "Frames")
    })
    private WebElementFacade linkNameWebElementFacade;

    public void clickLinks(String linkName){
//        WebElementFacade linkNameWebElementFacade = $(By.linkText(linkName));
        linkNameWebElementFacade.waitUntilClickable();
        linkNameWebElementFacade.click();
    }

    public void verifyWebsiteIsRunning(){
        String title = getDriver().getTitle();
        System.out.println("title is " + title);
        assertThat(title, Matchers.is("The Internet"));
    }

}
