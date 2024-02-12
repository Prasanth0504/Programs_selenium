package com.seleniumrevision;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
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

public class TextBox {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> place = driver.findElements(By.xpath("//*[@placeholder]"));

		File file = new File("C:\\Users\\Prasanth\\Desktop\\Doc\\file\\oldfile\\Values.xlsx");

		Workbook wb = new XSSFWorkbook();
		Sheet createSheet = wb.createSheet("Ui values");
		
		for (int i = 0; i <place.size(); i++) {
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(place.get(i).getAttribute("placeholder"));
			
		}


		FileOutputStream stream = new FileOutputStream(file);
		wb.write(stream);

		System.out.println("Successfully done");

	}

}
