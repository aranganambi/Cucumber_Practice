package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="featurefiles\\regularExpression.feature" , glue = "stepDefenition")
public class Regular_Expression_Runner {

}
