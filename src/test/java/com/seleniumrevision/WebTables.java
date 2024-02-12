package com.seleniumrevision;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demoqa.com/webtables");	
	List<WebElement>cierra=driver.findElements(By.xpath("//div[@class='rt-td']"));
	
	File file =new File("C:\\Users\\Prasanth\\Desktop\\Doc\\file\\oldfile\\Webtable.xlsx");
	
	
	Workbook wb = new XSSFWorkbook();
	
	Sheet sheet = wb.createSheet("Webtable");
	
	
		
		for (int i = 0; i <cierra.size(); i++) {
			
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			
		String text =cierra.get(i).getText();
			cell.setCellValue(text);
			System.out.println(text);
		}
		
		FileOutputStream opstream = new FileOutputStream(file);
		
		wb.write(opstream);
		
		System.out.println("Successfully completed");
		
		
		
		
		
		
		
		
		
		
		

	}

}
