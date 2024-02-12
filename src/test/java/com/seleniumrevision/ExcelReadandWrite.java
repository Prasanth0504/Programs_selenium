package com.seleniumrevision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadandWrite {

	public static void main(String[] args) throws IOException {

		
		//poi.ooxml dependency required
		
		File file = new File("C:\\Users\\Prasanth\\Desktop\\"
				+ "eclipse-workspace\\dsds\\src\\test\\resources\\Excel\\NewExcel.xlsx");

		Workbook wb = new XSSFWorkbook();

		Sheet sheet = wb.createSheet("Write");

		Row row = sheet.createRow(0);

		Cell cell = row.createCell(0);

		cell.setCellValue("Welcome");

		FileOutputStream stream = new FileOutputStream(file);
		wb.write(stream);

		System.out.println("Completed");

		FileInputStream st = new FileInputStream(file);
		Sheet sheet2 = wb.getSheet("Write");

		Row row2 = sheet2.getRow(0);
		Cell cell2 = row2.getCell(0);
		String stringCellValue = cell2.getStringCellValue();
		System.out.println(stringCellValue);

	}

}
