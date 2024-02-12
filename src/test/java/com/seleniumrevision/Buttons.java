package com.seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement dblclk= driver.findElement(By.id("doubleClickBtn"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(dblclk).perform();
		
		WebElement rightclk= driver.findElement(By.id("rightClickBtn"));
		
		action.contextClick(rightclk).perform();
		
		WebElement click= driver.findElement(By.xpath("//button[.='Click Me']"));
		
		click.click();
		
	}

}
