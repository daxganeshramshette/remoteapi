package cucumber.options;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features="src/test/java/features",
		glue= {"steps"},
		plugin= {"pretty","html:target/Destination"})

public class testRunner {}
