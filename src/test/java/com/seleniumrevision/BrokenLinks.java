package com.seleniumrevision;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/broken");
		
		List<WebElement> Link=driver.findElements(By.tagName("a"));
		
		for(WebElement Alllink:Link) {
			
			String attribute=Alllink.getAttribute("href");
						
			//System.out.println(attribute);
		
		
		if(attribute!=null) {
			
			URL url = new URL(attribute);
			URLConnection connection=url.openConnection();
			HttpURLConnection http=(HttpURLConnection)connection;
			int responsecode =http.getResponseCode();			
		
		if(responsecode>=400)
		System.out.println("Broken Links: "+attribute);
		}
		
		
		
		}
		
	}

}
