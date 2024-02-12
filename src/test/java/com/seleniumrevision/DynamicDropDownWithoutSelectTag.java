package com.seleniumrevision;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownWithoutSelectTag {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException	  {
		
		
//EventListerns-->blur-->Document & window need to remove
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[1]")).click();
		
	 List<WebElement> li = driver.findElements(By.xpath("//div[@tabindex='-1']"));
		System.out.println(li.size());
		
		for (WebElement list : li) {
			System.out.println(list.getText());
			
		}
		
		driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[1]")).click();

		
		driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]")).click();
		
		List<WebElement> li2 = driver.findElements(By.xpath("//div[contains(@class,'option')]"));
		System.out.println(li2.size());
		for (WebElement list2: li2) {
			
			System.out.println(list2.getText());
		}

		driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]")).click();
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_ALT);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
		
		WebElement color = driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[3]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",color);
		
		List<WebElement> colorli = driver.findElements(By.xpath("//div[contains(@class,'-option')]"));
		System.out.println(colorli.size());
		
		
		for (WebElement colo : colorli) {
			
			System.out.println(colo.getText());
			
		}
		
		
		
		driver.close();
		
		
		
	}

}
