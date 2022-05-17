
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features="/Selenium/src/CreateOpportunity.feature",glue="/Selenium/src/TCreateOppor.java",
monochrome=true,
//only the scenario with @smoke
//tags="@Smoke or @sanity"
//tags="@Smoke and @regression")
tags="not @Smoke")
public class Runner extends AbstractTestNGCucumberTests{



}
