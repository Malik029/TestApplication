package com.OrangeHRM_;

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

import com.WebTable_cities_GetNames.WebTable_LastRow_LastCell;

public class EmployeeList_TestData extends Add_Employee_OrangeHRM {
	
	
	
	
    public void AddEmployeeList(){
    
    	
    	By AddEmployeelocator=By.linkText("Employee List");
		WebElement AddEmployee=driver.findElement(AddEmployeelocator);
		AddEmployee.click();
		
    }
    public void capturTest () throws IOException {
    	 FileInputStream excelTestDataFile=new FileInputStream("./src/com/XLFiles/Book1_for.xlsx");
			XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		    XSSFSheet testDataSheet=workBook.getSheet("Sheet2");
		    
    	
    	 By EmpRowLocator=By.tagName("tr");
         List<WebElement> EmpRow=driver.findElements(EmpRowLocator);
          int rowCount=EmpRow.size();
          int row=rowCount;
          for(int rowindex=1;rowindex<=row;rowindex++) {
        	  Row row1=testDataSheet.createRow(rowindex-1);
        	  
        	  By EmpCellLocator=By.tagName("td");
         	 List<WebElement> Empcell=driver.findElements(EmpCellLocator);
         	 int cellCount=Empcell.size();
         	int cell=cellCount/row;
         	for(int cellindex=1;cellindex<=cell;cellindex++) {
				Cell rowOfCell=row1.createCell(cellindex-1);
				
      ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr["+rowindex+"]/td["+cellindex+"]
         	By	EmployeelistLocator=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[\"+rowindex+\"]/td[\"+cellindex+\"]");
         		WebElement EmployeList=driver.findElement(EmployeelistLocator);
         	String Emptestdata=EmployeList.getText();
         	 rowOfCell.setCellValue(Emptestdata);	
         		System.out.println("the Add Employee testDatais:-"+Emptestdata);
         		 
         	}         	
         	System.out.println();
         	 FileOutputStream outPutFile=new FileOutputStream("./src/com/XLFiles/Book1_for.xlsx");
		 	 workBook.write(outPutFile);
         	
          }
    }
	
	public static void main(String[] args) throws IOException {
		EmployeeList_TestData orgData=new EmployeeList_TestData();
		orgData.browserLaunch();
		orgData.navigateOrangeHRM();
		orgData.validateLoginPage();
		orgData.loginWith_validTest_data();
		orgData.automatePIM();
		orgData.AddEmployeeList();
		orgData.capturTest();
	}
}
