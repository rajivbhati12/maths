
/**
 * Created by rajivbhati on 3/18/17.
 */
package test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features"
        ,
                glue = "test/java/stepDefinition"
                )
public class CucumberRunner {
}
