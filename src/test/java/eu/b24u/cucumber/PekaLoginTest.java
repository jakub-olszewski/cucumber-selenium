package eu.b24u.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * PekaLoginTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 13.04.2019 10:34
 **/
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/peka.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/peka-page.json",
        "html:target/peka-page-html"},
        glue = {"eu.b24u.cucumber.page.peka.login",
                "eu.b24u.cucumber.init"})
public class PekaLoginTest {
}
