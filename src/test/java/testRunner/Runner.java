package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:/Cucumber_RestAssured_API_Automation/src/test/java/features",
    glue = {"stepdef"},
    tags = {"@SmokeTest"},
    format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },plugin = "json:target/cucumber-reports/CucumberTestReport.json")


public class Runner {
   
//    private TestNGCucumberRunner testNGCucumberRunner;
//   
//    @BeforeClass
//    public void setUp() throws Exception
//    {
//  testNGCucumberRunner = new TestNGCucumberRunner(Runner.class);
//    }
//   
//   
//    @Test(dataProvider="features")
//      public void my_test(CucumberFeatureWrapper cucumberFeature)
//    {
//  testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//    }
//   
//   
//    @DataProvider
//public Object[][] features()
//    {
//  return testNGCucumberRunner.provideFeatures();  
//    }
//   
//   
//    @AfterClass
//public void tearDown()
//    {
//  testNGCucumberRunner.finish();   
//    }

}