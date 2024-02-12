package com.seleniumrevision;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindlowHandling {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("tabButton")).click();
		
		
		driver.get("https://demoqa.com/sample");
		 WebElement sample = driver.findElement(By.id("sampleHeading"));
		String text=sample.getText();
		System.out.println(text);
		driver.navigate().back();
		
		System.out.println("done");
		WebElement window=driver.findElement(By.id("windowButton"));
		window.click();
		
String parentwindow= driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		List<String> list=new ArrayList<String>(windowHandles);
		
		
		driver.switchTo().window(list.get(1));
		driver.switchTo().window(list.get(0));
		
		/*for (String each : windowHandles) {
			
			if (!parentwindow.equals(each)) {
				driver.switchTo().window(each);
			}
		
		}
		
		
		driver.switchTo().window(parentwindow);*/
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
