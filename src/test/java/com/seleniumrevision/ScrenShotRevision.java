package com.seleniumrevision;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrenShotRevision {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		
		//for Particular portion alone
		WebElement page = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File source = page.getScreenshotAs(OutputType.FILE);
		
		File path = new File("C:\\Users\\Prasanth\\Desktop\\Doc\\google.png");

		FileUtils.copyFile(source,path);
		
		//For entire page
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot) driver;
		WebElement email = driver.findElement(By.id("email"));
		
		File s = ts.getScreenshotAs(OutputType.FILE);
		
		File file = new File("C:\\Users\\Prasanth\\Desktop\\Doc\\file\\fb.png");
		
		FileUtils.copyFile(s,file);
	

	}

}
