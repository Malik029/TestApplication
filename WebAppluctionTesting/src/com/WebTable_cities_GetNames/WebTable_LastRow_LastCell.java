package com.WebTable_cities_GetNames;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_LastRow_LastCell extends BaseTest {
	
	public void capturingCompleteDataTest() throws IOException
	{
		 FileInputStream excelTestDataFile=new FileInputStream("./src/com/XLFiles/Book1_for.xlsx");
			XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		    XSSFSheet testDataSheet=workBook.getSheet("Sheet3");
		    
		
        By webTableRowLocator=By.tagName("tr");
        List<WebElement> webTableRow=driver.findElements(webTableRowLocator);
         int rowCount=webTableRow.size();
         int row=rowCount-1;
        
         for(int rowIndex=1;rowIndex<=row;rowIndex++)
     		{
        	 Row row1=testDataSheet.createRow(rowIndex-1);
        	 
        	 By webTableColumnLocator=By.tagName("td");
        	 List<WebElement> webTableColumn=driver.findElements(webTableColumnLocator);
        	 int columnCount=webTableColumn.size();
        	int columns=columnCount/row;
        	
			for(int columnIndex=1;columnIndex<=columns;columnIndex++)
			{
				Cell rowOfCell=row1.createCell(columnIndex-1);
				
				By cityNamesLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+columnIndex+"]");
				WebElement cityNames=driver.findElement(cityNamesLocator);
				String data=cityNames.getText();
				
			    rowOfCell.setCellValue(data);	

				System.out.print(data+"   ");
			}
			System.out.println();
			 FileOutputStream outPutFile=new FileOutputStream("./src/com/XLFiles/Book1_for.xlsx");
		 	 workBook.write(outPutFile);
		}
	}
	public static void main(String[] args) throws IOException {
		
		WebTable_LastRow_LastCell completeData=new WebTable_LastRow_LastCell();
		completeData.SetUp();
		completeData.capturingCompleteDataTest();
		completeData.tearDown();
		
	}
}


		
	

	
	
	
	

