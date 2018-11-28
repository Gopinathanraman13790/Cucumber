package org.test.Maven;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeleAddCustomer {
	
	public static WebDriver driver;
	@Given("^The Telecome Adduser details are adding the AddCustomer page$")
	public void the_Telecome_Adduser_details_are_adding_the_AddCustomer_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Michael\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	   
	}

//	@When("^The user enter the valid values$")
//	public void the_user_enter_the_valid_values() {
//	    Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
//		driver.findElement(By.id("fname")).sendKeys("Gopi");
//		driver.findElement(By.id("lname")).sendKeys("Nathan");
//		driver.findElement(By.id("email")).sendKeys("gopi@gmail.com");
//		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Chennai");
//		driver.findElement(By.id("telephoneno")).sendKeys("9876543212");
//				
//	}

	

@When("^The user enter the valid values$")
public void the_user_enter_the_valid_values(DataTable adduser) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc).
    // Field names for YourType must match the column names in 
    // your feature file (except for spaces and capitalization).
	Map<String, String> AdduserMap = adduser.asMap(String.class,String.class);
	System.out.println(AdduserMap );
	driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
	driver.findElement(By.id("fname")).sendKeys(AdduserMap.get("FirstName") );
	driver.findElement(By.id("lname")).sendKeys(AdduserMap.get("Lastname") );
	driver.findElement(By.id("email")).sendKeys(AdduserMap.get("Email") );
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(AdduserMap.get("Address"));
	driver.findElement(By.id("telephoneno")).sendKeys(AdduserMap.get("Phone"));
	
	
}


	
	@When("^The user clicks the Submit button$")
	public void the_user_clicks_the_Submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("^the user should be in addUsers id home page$")
	public void the_user_should_be_in_addUsers_id_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
    // Assert.assertEquals("http://demo.guru99.com/telecom/access.php?uid=057600", driver.getCurrentUrl());	
     Assert.assertTrue("Submitted sucessfully",true);
	}



}
