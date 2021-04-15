package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},
glue= {"StepDefinition"},
tags="@ValidLogin or @InvalidLogin",
dryRun=false,//this will check did implement all methods//incase if any missed this will help to find it
monochrome=true,//to get right format in console
strict=true,//this checks strictly whether any steps are missed in step definition
plugin = {"html:testoutput/loginreport.html","junit:testoutput/loginreport.xml", "json:testoutput/loginreport.json",}
		)
public class Test_runner {
	

}
