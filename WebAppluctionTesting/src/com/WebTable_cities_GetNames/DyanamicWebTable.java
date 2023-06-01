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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DyanamicWebTable {

	 WebDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

		@BeforeTest
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(applicationUrlAddress);
			driver.manage().window().maximize();
		}
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
		
		@Test
		public void getCompleteWebTableDataTest() throws IOException
		{

			// Identifying the file(Excel File) in the System
			FileInputStream excelTestDataFile = new FileInputStream
													("./src/com/XLFiles/Book1_for.xlsx");
			
			// Identify the workBook in the file(Excel File)
			XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
			
			// Identify a particular sheet in the WorkBook
			XSSFSheet testDataSheet = workBook.getSheet("sheet6");

			// Identifying the webTable
			// /html/body/div[5]/section[1]/div - property of WebTable
			
			By webTableLocator=By.xpath("/html/body/div[5]/section[1]/div");
			WebElement webTable=driver.findElement(webTableLocator);
			
			// Identify the number of Row of the WebTable
			
			By rowsLocator=By.tagName("tr");
			List<WebElement>rows=webTable.findElements(rowsLocator);
			
			// of the WebTable - should goto all the Rows
			for(int rowIndex=1;rowIndex<rows.size();rowIndex++)
			{
					// in the Sheet - creating a new Row
				Row newRow=testDataSheet.createRow(rowIndex-1);
				
				// Going to a Particual Row and find the Number of Cells in the Row
				By rowOfCellLocator=By.tagName("td");
				List<WebElement>rowOfCells=rows.get(rowIndex).findElements(rowOfCellLocator);
				
				// to goto every Row of all the Cells
				for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
				{
					Cell newRowOfCell=newRow.createCell(rowOfCellIndex);
					String testData=rowOfCells.get(rowOfCellIndex).getText();
					
					newRowOfCell.setCellValue(testData);
					System.out.print(testData+"  ");
					
					FileOutputStream fileOutPut = new FileOutputStream("./src/com/XLFiles/Book1_for.xlsx");
	             workBook.write(fileOutPut);
	      			}
				System.out.println();
			}
		}
	}

