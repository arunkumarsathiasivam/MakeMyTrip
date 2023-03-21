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
import org.openqa.selenium.support.ui.Select;

public class AdactinArun {
	
 public static void main(String[]  args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		
	    WebElement user = driver.findElement(By.id("(username"));
		user.sendKeys("arunkumar");
		
	    WebElement pass = driver.findElement(By.xpath("(//input[@name='password']"));
	    pass.sendKeys("12345");	
	
		WebElement login = driver.findElement(By.xpath("(//input[@id='login']"));
		login.click();
		Thread.sleep(3000);
		
		
		
		WebElement location = driver.findElement(By.xpath("(//select[@name='location')"));
		Select s = new Select(location);
		s.selectByValue("Vadapalani");
		
		WebElement hotel = driver.findElement(By.xpath("(//select[@name='location')"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Star");
		
		WebElement roomtype = driver.findElement(By.xpath("(//select[@name='room_type')"));
		Select s2 = new Select(hotel);
		s2.selectByIndex(2);
		
		
		WebElement romcount = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(hotel);
		s3.selectByValue("5");
		
		
		WebElement cc  = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		cc.clear();
		cc.sendKeys("15/03/2023");
		
		WebElement cd  = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		cd.clear();
		cd.sendKeys("18/03/2023");
		
		
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adults);
		s4.selectByValue("4");
		
		WebElement child = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(child);
		s5.selectByValue("4");
		
		
		WebElement search = driver.findElement(By.xpath("//input[@name=Submit']"));
		search.click();
		Thread.sleep(2000);
		
	
		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radio.click();
		Thread.sleep(2000);
		
		WebElement Fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		Fname.sendKeys("Sundar");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		Fname.sendKeys("Pichai");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("# 25, Anna University, Guindy");
		
		WebElement card = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		card.sendKeys("1234567898");
		
		WebElement typecard = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6= new Select(typecard);
		s6.selectByValue("VISA");
		
		WebElement xmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7= new Select(xmonth);
		s7.selectByIndex(1);
		
		WebElement xyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8= new Select(xyear);
		s8.selectByVisibleText("2022");
		
		WebElement CCV = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		CCV.sendKeys("007");
		
		WebElement book = driver.findElement(By.xpath("//input[@type='button'])[1]"));
		book.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun\\Screenshot\\Adactin.png");
		FileUtils.copyFile(src, des);
		
		
		
}
}

		
		
		
		
		
		
		
		
		


