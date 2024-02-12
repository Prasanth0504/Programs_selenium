package com.seleniumrevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement debacct = driver.findElement(By.id("bank"));
		
		WebElement debamt = driver.findElement(By.id("amt7"));
		
		WebElement credacct = driver.findElement(By.id("loan"));
		
		WebElement credamt = driver.findElement(By.id("amt8"));
		
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement amt = driver.findElement(By.xpath("//a[text()=' 5000']"));
		Actions action = new Actions(driver);
		
		action.dragAndDrop(bank,debacct).perform();
		
		action.dragAndDrop(amt,debamt).perform();
		
		action.dragAndDrop(sales,credacct).perform();
		
		action.dragAndDrop(amt,credamt).perform();
		
		WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		
		System.out.println(perfect.getText());
		
		
		
		
		
		
		
	}

}
