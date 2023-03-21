package com.sele;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imdb {
	
	
public static void main(String[]  args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://m.imdb.com/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//input[@name='q']"));

		search.sendKeys("Vaathi");
		
		Thread.sleep(3000);
		
		
		WebElement movie = driver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
		movie.click();
		Thread.sleep(3000);
		
		WebElement Vaathi = driver.findElement(By.xpath("//a[text()='Vaathi']"));
		Vaathi.click();
		Thread.sleep(3000);
		
		
		
		WebElement Rat = driver.findElement(By.xpath("(//span[text()='7.9'])[1]"));
		Rat.click();
		Thread.sleep(3000);
		
		WebElement Ratings = driver.findElement(By.xpath("(//span[@class='ipl-rating-star__rating'])[1]"));
		String text  = Ratings.getText();
		System.out.println("Rating of the movie"+text);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun\\Screenshot\\imdb.png");
		FileUtils.copyFile(src, des);
		
		
}
}
