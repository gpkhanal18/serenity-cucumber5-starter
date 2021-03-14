package starter.heroku.pages.rest;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;

import static net.serenitybdd.rest.SerenityRest.rest;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.CoreMatchers.containsString;

public class RestCallGetBooks {

    String api = "https://openlibrary.org/works/OL45883W.json";

    @Step
    public void makeaGetCall(){
        rest().get(api);
    }

    @Step
    public void validateResponse(){
        System.out.println("inside validateResponse");
        then().assertThat().content(containsString("Fantastic Mr. Fox"));
        then().statusCode(200).body("description", Matchers.containsString("Fox88888"));
    }
}
