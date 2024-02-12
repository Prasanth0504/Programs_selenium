package com.seleniumrevision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EY_India_Select_DropDown {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement create = driver.findElement(By.xpath("//a[.='Create new account']"));
		create.click();
		
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("month")));
		*/
		WebElement month = driver.findElement(By.id("month"));
		
		Select select = new Select(month);
		
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i <options.size(); i++) {
			
			String text = options.get(i).getText();
			
			System.out.println(text);
		}
		
		
		
		
		
		
		
		

	}

}
