package com.seleniumrevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		WebElement board = driver.findElement(By.xpath("//img[@class='imgdp']"));
		board.click();
		
		String mon="April";
		String year="2023";
		String date="15";
		
		
		while (true) {
			
			String monthyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String[] arr = monthyear.split(" ");
			String month=arr[0];
			String yr=arr[1];
			
			if (month.equalsIgnoreCase(mon)&&yr.equals(year)) {
				
				break;
				
			} else {
				WebElement prev = driver.findElement(By.xpath("//span[text()='Prev']"));
				prev.click();
			}
			
		}
		
		/*WebElement Date = driver.findElement(By.xpath("//a[.='5']"));
		Date.click();*/
		
		
		List<WebElement> datetable = driver.findElements(By.className("ui-datepicker-calendar"));
		for (WebElement dt : datetable) {
			
			String datetext=dt.getText();
			System.out.println(datetext);
			
			if (datetext.equals(date)) {
				dt.click();
			}
			else {
				System.out.println("Date not found");
			}
			
		}
		
		
		
		
		

	}

}
