package starter.heroku.pages.rest;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;
import util.GetEnvironmentVariable;

import static net.serenitybdd.rest.SerenityRest.rest;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.CoreMatchers.containsString;

public class RestCallGetBooks {

    static String referenceNumber;

    public static String getReferenceNumber() {
        return referenceNumber;
    }

    String resource = "/works/OL45883W.json";
    String restBaseUrl = GetEnvironmentVariable.getEnvironmentVariable("rest.base.url");

    @Step
    public void makeaGetCall(){
        String url = restBaseUrl + resource;
        Response response = rest().get(url);
        referenceNumber = response.getBody().asString();
    }

    @Step
    public void validateResponse(){
        System.out.println("inside validateResponse");
        then().assertThat().content(containsString("Fantastic Mr. Fox"));
        then().statusCode(200).body("description", containsString("Fox"));
    }

    @Step
    public void makeaPostCall(){
        postRequest postRequest = new postRequest("apple", "ball", "cat");
        RequestSpecification request = rest();
        request.header("Content-Type", "application/json");
        request.body(postRequest);
        Response response = request.post("https://jsonplaceholder.typicode.com/post");
        System.out.println("post response body is " + response.getBody());
        System.out.println("post response is " + response);
    }
}
