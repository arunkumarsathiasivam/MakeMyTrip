package com.sele;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;

public class Action {
	
public static void main(String[]  args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		Robot r = new Robot();
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(mobile).perform();
		Thread.sleep(3000);
		
		/*
	
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//int size = driver.getWindowHandles().size();
		//System.out.println(size);
		
		//String windowHandle = driver.getWindowHandle();
		//System.out.println(windowHandle);
		
		Set<String> all = driver.getWindowHandles();
		//System.out.println(all);
		for(String str : all) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
			

			int size = driver.getWindowHandles().size();
			System.out.println("Total size of the window is :"+size);
			
			
			
			*/
		}		
}

