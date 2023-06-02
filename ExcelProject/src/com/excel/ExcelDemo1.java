package com.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo1 {

	public static void main(String[] args)  {
		
		Workbook workbook = new  XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Hello, world!");
		sheet.autoSizeColumn(0);
		
		try {
		    FileOutputStream outputStream = new FileOutputStream("D:\\ExcelData\\output.xlsx");
		    workbook.write(outputStream);
		    workbook.close();
		    outputStream.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}


	}

}
