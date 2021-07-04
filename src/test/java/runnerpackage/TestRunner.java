package runnerpackage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/features/Contact.feature","src/main/java/features/Menulink.feature"},


                               plugin = {"pretty","html:target/cucmber-html-report"}, glue = {"test"})


public class TestRunner {

}
