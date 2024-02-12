package com.seleniumrevision;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EY_WorkingLinks {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		int count=0;
		for (int i = 0; i <link.size(); i++) {
			
			String attribute = link.get(i).getAttribute("href");
			
			URL url=new URL(attribute);
			
			URLConnection openConnection = url.openConnection();
			
			HttpURLConnection urlconnection=(HttpURLConnection) openConnection;
			
			int response=urlconnection.getResponseCode();
			
			if(response>=200&&response<300) {
				
				System.out.println(i+" "+attribute);
				count++;
				
			}
			
			
			
		}
System.out.println("Working Link count is: "+count);
	}

}
