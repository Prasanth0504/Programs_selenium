package com.seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement nested = driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']"));
		nested.click();
		
		driver.switchTo().frame(1);
		WebElement frame1=driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
		
		System.out.println(frame1.getText());
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		
		WebElement frame2 = driver.findElement(By.xpath("//h5[.='iFrame Demo']"));
		System.out.println(frame2.getText());
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Entered into inner Frame");
		
		driver.switchTo().defaultContent();
		WebElement single = driver.findElement(By.xpath("//a[.='Single Iframe ']"));
		single.click();
		WebElement frame3 = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame3);
		WebElement frame4 = driver.findElement(By.xpath("//h5[.='iFrame Demo']"));
		System.out.println(frame4.getText());
		
		
		WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox1.sendKeys("Entered into single Frame");
		
		
		
		

	}

}
