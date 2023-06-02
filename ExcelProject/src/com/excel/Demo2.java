package com.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2 {

	public static void main(String[] args) throws IOException {

            
		FileInputStream input = new FileInputStream("C:\\Users\\rrajs\\OneDrive\\Desktop\\Data.xlsx");
          
		XSSFWorkbook wb = new XSSFWorkbook(input);
		
		XSSFSheet sheet = wb.getSheet("people");
		
		int lastRowNumber  = sheet.getLastRowNum();
		System.out.println(lastRowNumber);
		
		XSSFRow row = sheet.getRow(0);
		
		int ageCellIndex=-1;
		int statusCellIndex=-1;
		
		
		for(int i=0; i<row.getLastCellNum(); i++)
		{
			
			XSSFCell cell = row.getCell(i);
			
			if(cell.getStringCellValue().trim().equals("Age"))
			{
				ageCellIndex=i;
				
				
			}
			else if(cell.getStringCellValue().trim().equals("Status")) {
				
				statusCellIndex=i;
				
			}
		}
			
		
	
				
		ArrayList list = new ArrayList();
		
		for(int i=1; i<=lastRowNumber; i++) {
			
			row=sheet.getRow(i);
			XSSFCell ageCell = row.getCell(ageCellIndex);
            XSSFCell statusCell = row.getCell(statusCellIndex);
            list.add(ageCell);
			list.add(statusCell);
		}
		System.out.println(list);	
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		for(int i=1; i<=lastRowNumber; i++) {
			
			row=sheet.getRow(i);
			XSSFCell ageCell = row.getCell(ageCellIndex);
			XSSFCell statusCell = row.getCell(statusCellIndex);
			m.put((int)ageCell.getNumericCellValue(), statusCell.getStringCellValue());
			if(ageCell.getNumericCellValue()<=18) {
				
				statusCell.setCellValue("Minor");
				
			}
			else
				
				statusCell.setCellValue("Major");
			
		}
		
	}	
	

}
