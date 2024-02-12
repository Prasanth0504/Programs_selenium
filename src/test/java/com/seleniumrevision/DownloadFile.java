package com.seleniumrevision;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) {
		
		/*ChromeOptions option = new ChromeOptions();
		Map<String,Object> prefs =new HashMap<>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory","C:\\Users\\Prasanth\\Desktop\\Doc\\file\\oldfile" );
		option.setExperimentalOption("prefs", prefs);
		
	
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://demoqa.com/upload-download");
		
		WebElement download =driver.findElement(By.id("downloadButton"));
		
		download.click();*/
		
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		Map<String,Object> prefs=new HashMap<>();
		String path="C:\\Users\\Prasanth\\Desktop\\Doc\\file\\oldfile";
		prefs.put("profile.default_content_settings.popups",0);
		prefs.put("download.default_directory",path);
		options.setExperimentalOption("prefs",prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		WebElement dload =driver.findElement(By.xpath("//a[.='4.16.1']"));
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",dload);
		
	}

}
