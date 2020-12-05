package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "F:\\SOFTWARE TESTING\\Selenium\\FreeCrmBDDFramework\\src\\main\\java\\Features\\login.feature" }, //The path of feature file
                 glue = { "stepDefinitions" },//The path of stepDefination file
                format = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//To generate different types of reports
                monochrome = true,//Display the console output in proper readable format
               // strict = true, 
                dryRun = false
                
               
                
                //tags = {"@SmokeTest"}	
                //tags = {"@SmokeTest , @RegressionTest"}    //15
                // tags = {"@SmokeTest" , "@RegressionTest"}  //5
                //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
                   )
public class Runner {
	

}
       // ORed  : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	   // ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest