package starter.heroku.pages.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.heroku.pages.step.CheckboxPage;
import starter.heroku.pages.step.FramesPage;
import starter.heroku.pages.step.HomePage;

public class HerokuPageStepDef {

    @Steps
    HomePage homePage;
    @Steps
    CheckboxPage checkboxPage;
    @Steps
    FramesPage framesPage;

    @Given("I am on a homepage of heroku app")
    public void i_am_on_a_homepage_of_heroku_app() {
        homePage.openWebsite();
        homePage.verifyWebsiteIsOpen();
    }

    @Then("I should be navigated to the checkboxes page")
    public void i_should_be_navigated_to_the_checkboxes_page() {
      checkboxPage.verifyCheckboxPageIsDisplayed();
    }

    @When("I click {string} link")
    public void i_click_link(String linkName) {
        homePage.clickLink(linkName);
    }

    @Then("I should be navigated to the frames page")
    public void i_should_be_navigated_to_the_frames_page() {
        framesPage.verifyFramesPageIsDisplayed();
    }


}
