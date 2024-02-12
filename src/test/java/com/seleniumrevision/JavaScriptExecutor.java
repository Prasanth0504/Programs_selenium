package com.seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement lang = driver.findElement(By.xpath("//a[@title='Tamil']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		
		//Scroll down
		executor.executeScript("arguments[0].scrollIntoView(true)",lang);
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement passw = driver.findElement(By.id("pass"));
		
		//Scroll Up
		executor.executeScript("arguments[0].scrollIntoView(false)",user);
		
		//instead of sendkeys (setAttribute)
		executor.executeScript("arguments[0].setAttribute('value','Prasanth')",user,passw);
		executor.executeScript("arguments[0].setAttribute('value','Prasanth@123')",passw);
		
		//instead of getAttribute
		System.out.println(executor.executeScript("return arguments[0].getAttribute('value')",user));
		WebElement create = driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]"));
		
		//to click
		executor.executeScript("arguments[0].click()",create);

	}

}
