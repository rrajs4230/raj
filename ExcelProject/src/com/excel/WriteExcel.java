package com.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {


		FileInputStream input =new FileInputStream("D:\\Data1.xlsx");
		
		System.out.println("Excel Sheet is initialize......");
		
		XSSFWorkbook wb = new XSSFWorkbook(input);
		
		XSSFSheet sheet = wb.getSheet("people");
		int lastRowNum = sheet.getLastRowNum();
		int rowNum=0;
		
		XSSFRow row = sheet.getRow(rowNum);
		
		
		int cellNum=0;
		
		
		   for(int i=0; i<row.getLastCellNum(); i++)
		   {
			   
			   if(row.getCell(i).getStringCellValue().trim().equals("Age")) {
				   
				   cellNum=i;
				  System.out.println("--Cell Name is Age--");
			   }
			   
		   }
	   

		 
		 for(int i=0; i<row.getLastCellNum(); i++) 
		 {
			 row=sheet.getRow(0);
			 if(row.getCell(i).getStringCellValue().trim().equals("Status"))
			 {
				 
				 System.out.println("Cell is Status");
				 cellNum=i;
			 }
			   
			 
		 }
		 
		 
		 XSSFCell  cell =null;
		 int cellValue = 0 ;
		 rowNum=1;
         while(rowNum<=lastRowNum) {
	    
         row = sheet.getRow(rowNum); 
	
        cell=row.getCell(--cellNum);
        System.out.println("Current cellNumber:"+cellNum);
        cellValue=(int)row.getCell(cellNum).getNumericCellValue();
        System.out.println(cellValue);
        cell = row.getCell(++cellNum);
        System.out.println("Current cellNumber:"+cellNum);
		 
		 if(cellValue<=18) {
		     
			 cell = row.createCell(cellNum);
			 cell.setCellValue("Minor");
		
		 } else {
			 cell = row.createCell(cellNum);
			 cell.setCellValue("Major");
		 
		     }			 
			 
		 rowNum++;
		 
		 
		 }
		 
         
		 FileOutputStream out = new FileOutputStream("D:\\Data.xlsx");
		 wb.write(out);
		 
		 wb.close();
		 out.close();
		 
	
	}

		

		
   }
	

	
	
		

	

