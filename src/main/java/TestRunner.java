import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/Feature",
        plugin = "html:target/cucumber-html-report")
public class TestRunner {

}
