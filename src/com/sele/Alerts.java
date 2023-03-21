package com.sele;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
public static void main(String[]  args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		driver.get("https:demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alertbox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertbox.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement alertok = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		alertok.click();
		Thread.sleep(3000);
		WebElement cancelbox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		cancelbox.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		WebElement Alerttext = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		Alerttext.click();
		WebElement Alertlast = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		Alertlast.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		driver.close();
		
		
}

}
