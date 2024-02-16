package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles\\data_Table_With_Header.feature" , glue = "stepDefenition")
public class Data_Table_With_Header_StepDefenition {

}

