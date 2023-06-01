package com.XL_Opertions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_forloop {
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream TestDataFile=new FileInputStream("./src/com/XLFiles/Book1_for.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(TestDataFile);
		XSSFSheet TestDatasheet= workBook.getSheet("Sheet1");
		
		int rowscount=TestDatasheet.getLastRowNum();
		for(int rowindex=0;rowindex<=rowscount;rowindex++)
		{
		Row row=TestDatasheet.getRow(rowindex);
		int cellcount=row.getLastCellNum();

		for(int rowofcellindex=0;rowofcellindex<cellcount;rowofcellindex++)
		{
			Row activerow=TestDatasheet.getRow(rowindex);

			Cell activeRowofactivecell=row.getCell(rowofcellindex);
		
			String testData=activeRowofactivecell.getStringCellValue();
		
			System.out.print(testData+" ");
			
		}
		System.out.println();
		}
	}
}


/* int rowCount=testDataSheet.getLastRowNum();
  
  for(int rowIndex=0;rowIndex<=rowCount;rowIndex++)
  {
   Row row=testDataSheet.getRow(rowIndex);
   
   int cellCount=row.getLastCellNum();
   
   for(int rowOfCellIndex=0;rowOfCellIndex<cellCount;rowOfCellIndex++)
   {
    Row activeRow=testDataSheet.getRow(rowIndex);
    Cell activeRowOfActiveCell=activeRow.getCell(rowOfCellIndex);
    String testData=activeRowOfActiveCell.getStringCellValue();
    System.out.print(testData+" ");
   
    
   }System.out.println();
   */


















