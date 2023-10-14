package stepDefinitionTags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test/esources/featureTags", glue = {"stepDefinitionTags"}
,tags = "@smoke")
public class TestRunner {

}
