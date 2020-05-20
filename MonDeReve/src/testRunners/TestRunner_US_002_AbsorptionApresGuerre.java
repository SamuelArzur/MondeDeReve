package src.testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="MonDeReve/test/ressources/features/US_002_AbsorptionApresGuerre.feature", glue="")
public class TestRunner_US_002_AbsorptionApresGuerre {

}
