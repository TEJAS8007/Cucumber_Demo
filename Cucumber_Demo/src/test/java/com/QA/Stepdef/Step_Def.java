package com.QA.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class Step_Def {

	static WebDriver driver;

	@Given("user navigate to {string}")
	public void user_navigate_to(String url) {
		ChromeOptions chrome=new ChromeOptions();
		chrome.setBinary("C:\\Users\\HP\\OneDrive\\Desktop\\Testing Reqmnt\\chrome-win32\\chrome-win32\\chrome.exe");
		driver=new ChromeDriver(chrome);

		driver.get("https://demo.guru99.com/test/newtours/login.php");
	}

	@When("user enter userName as {string}")
	public void user_enter_user_name_as(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String ps) {
		driver.findElement(By.name("password")).sendKeys(ps);
	}

	@Then("Login should be complete")
	public void login_should_be_complete() {
		driver.findElement(By.name("submit")).click();

		System.out.println("Login Complete.........");

		// driver.quit();

		driver.navigate().back();

	}


	@Given("user should enter {string}")
	public void user_should_enter(String string) {
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("user should enter pass {string}")
	public void user_should_enter_pass(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("DDTest Should get Completed..")
	public void dd_test_should_get_completed(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.name("submit")).click();

		System.out.println("Done");
	}

}
