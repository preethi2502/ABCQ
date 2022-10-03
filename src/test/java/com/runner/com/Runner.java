package com.runner.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClass;
import com.properties.com.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace\\new\\ZCucumber"
		+ "\\src\\test\\java\\com\\feature\\com\\TestScript.feature", glue = "com.stepdefeniton.com"

)

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Exception {
		String browser = FileReaderManager.getInstanceFR().getInstanceCR().getBrowser();

		driver = BaseClass.browserLaunch(browser);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
