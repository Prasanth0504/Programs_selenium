package com.seleniumrevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDataHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/DynamicData.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("save")).click();
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.xpath("//*[@id='loading']"));
		String text = name.getText();
		System.out.println(text);
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement login = driver.findElement(By.name("login"));
			String attribute = login.getAttribute("id");
			System.out.println(attribute);
		
		
		//Using Contains Xpath
			//using Startswith Xpath
		
		
		

	}

}
