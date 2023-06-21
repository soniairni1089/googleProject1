package com.google.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.googleBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TeamPossible_GoogleSearch {
	
	
	WebDriver driver;
	
	
	
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		driver.get("http//www.google.com");
		driver.manage().window().maximize();
		
		
	    
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		//step 1:identify the web elementand give the element a name
		//8 locators
		//id,name,tag,class name,linktext,partial linktext,xpath.css-selector
		
		   WebElement searchBox = null;
		   searchBox.sendKeys(string);
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		//WebElement searchBtn;searchBtn=driver.findElement(By.name("btnk"));
	
		 
		WebElement searchBtn = null;
		searchBtn.click();
	   
	}

	@Then("I find  search result")
	public void i_find_search_result() {
		WebElement searchResult=driver.findElement(By.id("result-stats"));
		WebElement resultStats = null;
		String result=resultStats.getText();
		
		System.out.println("++++++++++++++");
		
		System.out.println("++++++++++++++");
	         
		
		  
	   
	}
}
