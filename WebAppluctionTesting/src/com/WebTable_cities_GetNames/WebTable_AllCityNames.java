package com.WebTable_cities_GetNames;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_AllCityNames extends BaseTest {
	 public void capturingAllTheDataTest() throws IOException
	 {
		 FileInputStream testDataFile = new FileInputStream("./src/com/XLFiles/Book1_for.xlsx");
		 XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		 XSSFSheet testDataSsheet =workBook.getSheet("Malik"); 

      /*
		 String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";

		 String xpathExpressionPart2="]/td[";

		 String xpathExpressionPart3="]";
		 */
		 
	  for(int TableRowOfIndex=1;TableRowOfIndex<=36;TableRowOfIndex++)
	  {
		  Row newRow=testDataSsheet.createRow(TableRowOfIndex-1);
	   for(int TableCellOfIndex=1;TableCellOfIndex<=8;TableCellOfIndex++)
	   {
		   Cell newRowOfCell=newRow.createCell(TableCellOfIndex-1);
	// By tableRowOfCellLocator=By.xpath(xpathExpressionPart1+rowIndex+xpathExpressionPart2+rowOfCellIndex+xpathExpressionPart3);


	   By cityNamesLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+TableRowOfIndex+"]/td["+TableCellOfIndex+"]");
	   WebElement cityNames=driver.findElement(cityNamesLocator);
	  
	   String cityNamesText=cityNames.getText();
	   newRowOfCell.setCellValue(cityNamesText);
	   System.out.print(cityNamesText+" - ");
	   }
	   System.out.println(TableRowOfIndex);
	 }
	  FileOutputStream output=new FileOutputStream("./src/com/XLFiles/Book1_for.xlsx");
	  workBook.write(output);
		
	 }
	

	 public static void main(String[] args) throws IOException {
		 WebTable_AllCityNames capturingAllTheData=new  WebTable_AllCityNames();
	  capturingAllTheData.SetUp();
	  capturingAllTheData.capturingAllTheDataTest();
	  capturingAllTheData.tearDown();
	  
	 }
	}



