package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

public static void main(String[]  args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumArun"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjijLjt0N79AhUJmmYCHVnJBasYABAAGgJzbQ&ohost=www.google.com&cid=CAESbOD2YgETxWS5y1eL91beMIUswN4rRHV5_o7MyQKqHn72-Pse5LukI9ClgWAFS0ZV6GcC9yEuuxt6ysocanM8FTthULTfEuSXQxxIc7jqMqEDOWmHvqYb2ym3C1Q0csvP9ea_m0JjWgoNyobHWQ&sig=AOD64_3RQo9iVvT-YNU-aHrY7SGcjG6kow&q&adurl&ved=2ahUKEwj88LLt0N79AhUFXWwGHWOmCXcQ0Qx6BAgJEAE");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		WebElement hairtab = driver.findElement(By.xpath("//a[text()='hair']"));
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(hairtab).perform();
		Thread.sleep(3000);
	
//		
		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		WebElement shampootab = driver.findElement(By.xpath("//a[text()='Shampoo']"));
		shampootab.click();
		Thread.sleep(5000);
		
//		String windowHandle = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String str : all) {
			 driver.switchTo().window(str);			
		}		
		
//		driver.switchTo(windowHandles);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	
//		String windowHandle = driver.getWindowHandle();
//		//System.out.println(windowHandle);
//		
//		
//		Set<String> all = driver.getWindowHandles();
//		for(String str : all ) {
//			driver.switchTo().window(str);
		
		
		WebElement shampoowindo = driver.findElement(By.xpath("//div[@class='productWrapper css-xin9gt']"));
		shampoowindo.click();
		Thread.sleep(3000);
		
		Set<String> allnext = driver.getWindowHandles();
		for (String str : allnext) {
			 driver.switchTo().window(str);
			
		}
		
		JavascriptExecutor jsi = (JavascriptExecutor)driver;
		jsi.executeScript("window.scrollBy(0,300)");
		
//add to bag tab inside the specific shampoo window
		WebElement Addtobagtab = driver.findElement(By.xpath("//button[@class=' css-1qvy369']"));
		Addtobagtab.click();
		Thread.sleep(3000);
		
		WebElement Addtobagkuttybutton = driver.findElement(By.xpath("//button[@class='css-g4vs13']"));
		Addtobagkuttybutton.click();
		Thread.sleep(3000);
		
//		driver.switchTo().frame("mobileCartIframe?ptype=customIframeCart");
//		driver.switchTo().frame(1);
//		Thread.sleep(3000);
		
//		driver.switchTo().frame("id of the element");
//
		WebElement Bagframe = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(Bagframe);
		WebElement proceedbutton = driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]"));
		proceedbutton.click();
		
	}
}


