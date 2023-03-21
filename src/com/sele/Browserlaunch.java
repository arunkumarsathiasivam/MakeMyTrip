package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
	
public static void main(String[]  args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Arun@yahoo.com");
		WebElement m=driver. findElement(By.id("login-signin"));
		m.click();
}
}
