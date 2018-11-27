package org.test.Maven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	public static WebDriver driver;
	
	@Given("^The user in the demo guru page$")
	public void the_user_in_the_demo_guru_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Michael\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	    
	}

	@When("^The user enter the valid username,password and click login button$")
	public void the_user_enter_the_valid_username_password_and_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr165242");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nYjadAs");
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		}

	@Then("^the user should be in managers home page$")
	public void the_user_should_be_in_managers_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("http://demo.guru99.com/V4/manager/Managerhomepage.php",driver.getCurrentUrl());
		
	    
	}

	
	
}
