package com.seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/upload-download");
		
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Prasanth\\Desktop\\Doc\\file\\oldfile\\sampleFile.jpeg");
		
		System.out.println("Successfully Uploaded");

	}

}
