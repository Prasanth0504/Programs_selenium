package com.seleniumrevision;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement simple = driver.findElement(By.id("alertButton"));
		simple.click();
		driver.switchTo().alert().accept();

		System.out.println("Simple Alert done");

		WebElement timer = driver.findElement(By.id("timerAlertButton"));
		timer.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();

		/*
		  timer = driver.findElement(By.id("timerAlertButton"));
		 driver.switchTo().alert().accept();
		 */
		System.out.println("Timer Alert done");

		WebElement confirm = driver.findElement(By.id("confirmButton"));
		confirm.click();

		driver.switchTo().alert().accept();

		System.out.println("Confirm Alert done");

		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();

		driver.switchTo().alert().sendKeys("Sridevi");
		driver.switchTo().alert().accept();
		System.out.println("Prompt Alert done");

	}

}
