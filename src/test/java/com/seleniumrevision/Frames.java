package com.seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement sample = driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There are 2')]"));
		String text=sample.getText();
		System.out.println(text);
		
		//WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		
		WebElement text1 = driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		
		System.out.println(text1.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement frame2 = driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		System.out.println(frame2.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
