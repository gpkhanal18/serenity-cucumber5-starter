package starter.heroku.pages.rest;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.springframework.beans.factory.annotation.Value;
import util.GetEnvironmentVariable;

import static net.serenitybdd.rest.SerenityRest.rest;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.CoreMatchers.containsString;

public class RestCallGetBooks {

    String resource = "/works/OL45883W.json";
    String baseUrlFromConfig = GetEnvironmentVariable.getEnvironmentVariable("rest.base.url");

    @Step
    public void makeaGetCall(){
        rest().get(baseUrlFromConfig+resource);
       }

    @Step
    public void validateResponse(){
        System.out.println("inside validateResponse");
        then().assertThat().content(containsString("Fantastic Mr. Fox"));
        then().statusCode(200).body("description", containsString("Fox"));
    }
}
