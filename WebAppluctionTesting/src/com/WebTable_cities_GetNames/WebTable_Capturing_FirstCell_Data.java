package com.WebTable_cities_GetNames;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_Capturing_FirstCell_Data extends BaseTest {
	public void capturefirstcelldata() throws IOException  {
		FileInputStream xl=new FileInputStream("./src/com/XLFiles/Book_DatandTime.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(xl);
		XSSFSheet datasheet=workbook.getSheet("Sheet1");
		for(int index=1;index<=36;index++){
		By CityNamelocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
		WebElement citiesName=driver.findElement(CityNamelocator);
		String cityNameText=citiesName.getText();
		Row newrow=datasheet.createRow(index-1);

		System.out.println(index+" "+cityNameText);
		Cell rowofcell=newrow.createCell(0);
		rowofcell.setCellValue(cityNameText);		
		
		 FileOutputStream output=new FileOutputStream("./src/com/XLFiles/Book_DatandTime.xlsx");
		  workbook.write(output);
		}
	}
	
	public static void main(String[] args) throws IOException {
		 WebTable_Capturing_FirstCell_Data name=new  WebTable_Capturing_FirstCell_Data();
		 name.SetUp();
		 name.capturefirstcelldata();
		name.tearDown();
	}

}
