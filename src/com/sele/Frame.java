package com.sele;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

public static void main(String[]  args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.nykaa.com/l-oreal-professionnel-absolut-repair-lipidium-shampoo/p/18402?productId=18402&pps=1");
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]"));
		click.sendKeys("");
}
	
}
