package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/result1.html"}, //reporting purpose
		monochrome=false,  //console output colour
		//tags = "@TC_001 or @bharathhi", //tags from feature file
		features = {"src/test/resources/Features/launch_homepage.feature"}, //location of feature files
		glue= "definitions") //location of step definition files

public class testRunner {

	    

}
