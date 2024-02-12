package com.seleniumrevision;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HexawareGetDataFromUI {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		List<WebElement> input = driver.findElements(By.tagName("input"));
		String text2;
		for (WebElement text: input) {
			
			text2 = text.getAttribute("placeholder");
			System.out.println(text2);
		}
		
		List<WebElement> address = driver.findElements(By.tagName("textarea"));
			
			File file = new File("C:\\Users\\Prasanth\\Desktop\\Doc\\file\\oldfile\\TextData.xlsx");
			
			Workbook wb=new XSSFWorkbook();
			
			Sheet sheet = wb.createSheet("Text");
			Sheet createSheet = wb.createSheet("data");
			
			for (int i = 0; i <input.size(); i++) {
				
				Row row = sheet.createRow(i);
				Cell cell = row.createCell(0);
				cell.setCellValue(input.get(i).getAttribute("placeholder"));
			}
			
			for (int i = 0; i < address.size(); i++) {
				Row createRow = createSheet.createRow(i);
				Cell createCell = createRow.createCell(0);
				String add=address.get(i).getAttribute("placeholder");
				createCell.setCellValue(add);
				
			}
			FileOutputStream stream = new FileOutputStream(file);
			
			wb.write(stream);
		
		
		

	}

}
