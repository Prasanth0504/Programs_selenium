package com.seleniumrevision;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileConfiguration {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver;
		FileInputStream stream=new FileInputStream("Configuration.properties");
		
		Properties properties=new Properties();
		
		properties.load(stream);
		
		String browser = properties.getProperty("browser");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			
		driver = new ChromeDriver();
						
		}
		else {
			
		driver=new FirefoxDriver();
			
		}
		
		driver.get("https://www.facebook.com/");
		
		
		
		
		
		
		
		
	}

}
