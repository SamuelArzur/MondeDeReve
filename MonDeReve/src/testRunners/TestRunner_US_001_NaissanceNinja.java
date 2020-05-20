package src.testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="MonDeReve/test/ressources/features/US_001_NaissanceNinja.feature", glue="")
public class TestRunner_US_001_NaissanceNinja {
}
