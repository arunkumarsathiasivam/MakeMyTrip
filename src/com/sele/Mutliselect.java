package com.sele;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mutliselect {
	
	
public static void main(String[]  args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		
//		Using window.scrollBy()to scroll down the screen, 
//		here 0 represents the horizontal scroll and 400 represents vertical scroll 
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		
		WebElement cars = driver.findElement(By.name("cars"));
		cars.click();
		Thread.sleep(3000);
		
		
		
        Select s = new Select(cars);
	    s.selectByValue("saab");
	    s.selectByVisibleText("Audi");
	    s.selectByIndex(0);
 	
}

}
