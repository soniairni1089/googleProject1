package com.google1.advance;

 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;



import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragDrop {

	

	public static void main(String[] args) {

WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		
			
		WebElement link = driver.findElement(By.xpath("//a[ltext()='click Here']"));
		link.click();
		link.click();
		link.click();
		link.click();
		
	
	
		
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);//returning all windows name as  CDwindow-9284BB474AC83E556793821AE3E2CA73
		driver.quit();
		
	}

}