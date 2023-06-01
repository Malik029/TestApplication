package com.XL_Opertions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xl_WriteOperations {
	public static void main(String[] args) throws IOException {

		FileInputStream ExcelTestDataFile = new FileInputStream("./src/com/XLFiles/Book1_write.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(ExcelTestDataFile);
		XSSFSheet TestDatasheet = workBook.getSheet("Sheet1");

		int numROws = TestDatasheet.getLastRowNum();
		System.out.println(numROws);
		Row newrow = TestDatasheet.createRow(4);
		
		Cell newrowofcell = newrow.createCell(4);
		Cell newrowofCell0 = newrow.createCell(5);
		Cell newrowofcell1 = newrow.createCell(6);

		newrowofcell.setCellValue("maheboob");
		newrowofcell.setCellValue("M");
		newrowofCell0.setCellValue("arrow to");
		newrowofcell1.setCellValue("A");
		FileOutputStream fileoutput1 = new FileOutputStream("./src/com/XLFiles/Book1_write.xlsx");
		workBook.write(fileoutput1);

		/*
		 * System.err.print("the xl out put value is:-"+newrowofcell+" "+newrowofcell1);
		 * System.out.println();
		 * 
		 */
	}

}
