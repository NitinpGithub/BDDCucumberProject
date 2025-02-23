package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features",
        glue={"StepDefinition","Hooks"},
        publish=true,
        plugin={"pretty","html:target/HtmlReport.html"}
)
public class MyRunnerTest {
}
