package com.seleniumrevision;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Virtusa_WebTableToList {

	public static void main(String[] args) throws ParseException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		List<WebElement> webdata = driver.findElements(By.xpath("//div[@class='rt-tr -odd']"));
		
		String text="";
		for (int i = 0; i <webdata.size(); i++) {
			
			text=text+webdata.get(i).getText();
			
			//System.out.println(text);
			
		}
		
		List<String> list=new ArrayList<>();
		
		list.add(text);
		
		System.out.print(list);
		
		
		
		
		
		
		
		
		

	}

}
