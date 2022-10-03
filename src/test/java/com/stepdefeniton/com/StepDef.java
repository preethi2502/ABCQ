package com.stepdefeniton.com;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClass;
import com.pom.com.POM;
import com.properties.com.FileReaderManager;
import com.runner.com.Runner;

import io.cucumber.java.en.*;

public class StepDef extends BaseClass {

	public static WebDriver driver = Runner.driver;
	POM pom = new POM(driver);

	@Before
	public void pageLaunched() {
		System.out.println("page launched successfully");
	}

	@After
	public void pageMoved() {
		System.out.println("page moved to NEXT PAGE ");
	}

	@Given("page should be launched")
	public void page_should_be_launched() throws Exception {
		String url = FileReaderManager.getInstanceFR().getInstanceCR().getUrl();
		getUrl(url);
	}

	@When("the user enter the username in the username field")
	public void the_user_enter_the_username_in_the_username_field() {
		sendKeys(pom.getUsername(), "AshokPreethi");
	}

	@When("user enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() {
		sendKeys(pom.getPassword(), "J255GQ");
	}

	@Then("user click the login button")
	public void user_click_the_login_button() {
		click(pom.getLogin());
	}

}
