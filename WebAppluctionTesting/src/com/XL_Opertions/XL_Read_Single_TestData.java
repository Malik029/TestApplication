package com.XL_Opertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Read_Single_TestData {
	public static void main(String[] args) throws Throwable{
		
	FileInputStream ExcelTestDataFile=new FileInputStream("./src/com/XLFiles/Book1_XL_single.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(ExcelTestDataFile);
	XSSFSheet sheet= workBook.getSheet("Sheet1");
	Row sheetofrow=sheet.getRow(3);
	Cell rowofcell=sheetofrow.getCell(4);
	String testData=rowofcell.getStringCellValue();
	System.out.println("the data in row of cell is:-"+testData);

	
}
}
