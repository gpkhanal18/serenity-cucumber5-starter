package starter.heroku.pages.stepdefinitions;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import static net.serenitybdd.rest.SerenityRest.rest;

public class Scratch {

    public static void main(String[] args) {

        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        String baseUrlFromConfig = EnvironmentSpecificConfiguration.from(variables).getProperty("rest.base.url");


            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("-----------------------------" + baseUrlFromConfig +"----------------------------------");
            System.out.println("---------------------------------------------------------------------------------------");

    }


}
