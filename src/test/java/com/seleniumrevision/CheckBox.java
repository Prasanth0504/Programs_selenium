package com.seleniumrevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']"));
		
		checkbox.click();
		
		List<WebElement> box = driver.findElements(By.xpath("//*[@class='rct-icon rct-icon-uncheck']"));
		
		for (int i = 0; i <box.size() ; i++) {
			
			try {
				box.get(i).click();
				
			} catch (Exception e) {
				
			}
		
			
			
		}
		
		System.out.println("Done");
		
		
		
		
	}

}
