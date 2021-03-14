package util;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class GetEnvironmentVariable {

    public static String getEnvironmentVariable(String variable){
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        String varName = EnvironmentSpecificConfiguration.from(variables).getProperty(variable);
        return varName;
    }
}
