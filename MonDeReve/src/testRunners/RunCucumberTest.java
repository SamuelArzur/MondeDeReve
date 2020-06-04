package src.testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="MonDeReve/test/ressources/features/", glue="")
public class RunCucumberTest {
}
