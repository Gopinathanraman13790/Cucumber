package org.test.Maven;



import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
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

//	@When("^The user enter the valid username,password and click login button$")
//	public void the_user_enter_the_valid_username_password_and_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr165242");
//	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nYjadAs");
	   
//		
//		}
	
	@When("^The user enter the valid username,password and click login button$")
	public void the_user_enter_the_valid_username_password_and_click_login_button(DataTable credentials) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	    // using List 
//		List<String> credentialList = credentials.asList(String.class);	
//		System.out.println(credentialList);
//	    driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(credentialList.get(0));
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentialList.get(1) );
		
		// map based using key and value
//		Map<String, String> cresentialMap = credentials.asMap(String.class, String.class);
//		System.out.println(cresentialMap);
//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(cresentialMap.get("UserName"));
//       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cresentialMap.get("Password"));
//	    
		// multiple values using list
//		List<List<String>> credentialLists = credentials.asLists(String.class);
//		System.out.println(credentialLists);
//		System.out.println(credentialLists.get(2).get(0));
//		System.out.println(credentialLists.get(2).get(1));
//		System.out.println(credentialLists.get(3).get(0));
//		System.out.println(credentialLists.get(3).get(1));
//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(credentialLists.get(0).get(0));
//       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentialLists.get(0).get(1));
//		
		// multiple values using list
		List<Map<String, String>> cresentialMaps = credentials.asMaps(String.class, String.class );
		System.out.println(cresentialMaps);
		System.out.println(cresentialMaps.get(1).get("Password"));
		System.out.println(cresentialMaps.get(3).get("UserName"));
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(cresentialMaps.get(0).get("UserName"));
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cresentialMaps.get(0).get("Password"));
		
		
	}

	
	@When("^The user clicks the login button$")
	public void the_user_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}


	@Then("^the user should be in managers home page$")
	public void the_user_should_be_in_managers_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("http://demo.guru99.com/V4/manager/Managerhomepage.php",driver.getCurrentUrl());
		
	    
	}

	
	
}
