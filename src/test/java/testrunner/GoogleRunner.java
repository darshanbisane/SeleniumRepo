package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\Cucumberfw\\src\\test\\resources\\Featurefiles\\Google.feature",glue="stepdef")
public class GoogleRunner {

}
