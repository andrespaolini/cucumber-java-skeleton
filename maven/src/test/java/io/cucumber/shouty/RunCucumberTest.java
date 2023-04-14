package io.cucumber.shouty;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/io/cucumber/shouty/hear_shout.feature"}, glue = {"io.cucumber.shouty"},
        plugin = {"pretty"})
public class RunCucumberTest extends AbstractTestNGCucumberTests{
}
