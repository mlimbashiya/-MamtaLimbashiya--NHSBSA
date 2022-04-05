package NHSBSA;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        tags = " ",
        plugin = {"pretty", "html:target/cucumber/report.html"}
)
public class TestRun {
}
