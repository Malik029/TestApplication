package com.WebTable_cities_GetNames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_CapturingDynamicTableData {
	 WebDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "./SeleniumApplication/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get(applicationUrlAddress);
			
			driver.manage().window().maximize();
					
		}
		
		public void tearDown()
		{
			driver.quit();
		}
		
		public void getCompleteWebTableDataTest()
		{
			// Identifying the webTable
			// /html/body/div[5]/section[1]/div - property of WebTable
			
			By webTableLocator=By.xpath("/html/body/div[5]/section[1]/div");
			WebElement webTable=driver.findElement(webTableLocator);
			
			// Identify the number of Row of the WebTable
			
			By rowsLocator=By.tagName("tr");
			List<WebElement>rows=webTable.findElements(rowsLocator);
			
			// of the WebTable - should goto all the Rows
			for(int rowIndex=0;rowIndex<rows.size();rowIndex++)
			{
				
				// Going to a Particual Row and find the Number of Cells in the Row
				By rowOfCellLocator=By.tagName("td");
				List<WebElement>rowOfCells=rows.get(rowIndex).findElements(rowOfCellLocator);
				
				// to goto every Row of all the Cells
				for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
				{
					String testData=rowOfCells.get(rowOfCellIndex).getText();
					System.out.print(testData+"  ");
				}
				System.out.println();
							
			}
			
			
		}

		public static void main(String[] args) {
			
			WebTable_CapturingDynamicTableData dynamicTableData = new WebTable_CapturingDynamicTableData();
			dynamicTableData.setUp();
			dynamicTableData.getCompleteWebTableDataTest();
			dynamicTableData.tearDown();
			
		}
		
	}


	
