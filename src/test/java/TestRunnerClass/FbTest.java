package TestRunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src/test/java/FatureFiles/fb.feature"},
		glue="StepDefinitonFiles",
		monochrome=true,
		dryRun=false,
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class FbTest extends AbstractTestNGCucumberTests{

}
