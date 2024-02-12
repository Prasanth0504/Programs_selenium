package com.seleniumrevision;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		action.moveToElement(electronics).perform();
		
		/*WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Health & Personal Care']")));
		*/
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		wait.until(new Function<WebDriver, WebElement> (){
			public WebElement apply(WebDriver driver){
				
				return driver.findElement(By.xpath("//a[text()='Health & Personal Care']"));
				
			}
			
		}
		);
	
		WebElement health = driver.findElement(By.xpath("//a[text()='Health & Personal Care']"));
		
		action.moveToElement(health).perform();
	
		WebElement trimmer = driver.findElement(By.xpath("//a[text()='Trimmers']"));
		trimmer.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
