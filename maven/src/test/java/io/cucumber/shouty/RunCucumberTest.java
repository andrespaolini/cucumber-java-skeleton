package io.cucumber.shouty;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke", features = {"src/test/resources/io/cucumber/shouty/hear_shout.feature"}, glue = {"io.cucumber.shouty"},
        plugin = {})
public class RunCucumberTest extends AbstractTestNGCucumberTests{
}
