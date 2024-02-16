package runnerClass;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;




@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features = "featurefiles/facebook.feature" , glue = "stepDefenition")
public class FacebookRunner  {
	
}
