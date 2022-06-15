package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_specificdata {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream ("./data/testdata.xlsx");
		 Workbook book =  WorkbookFactory.create(fis);
		 String findData="admin8";
		 
		int n = book.getSheet("Sheet3").getLastRowNum();
		for(int i=0;i<n;i++) {
		
			String cellvalue = book.getSheet("Sheet3").getRow(8).getCell(0).getStringCellValue();
		if (cellvalue.equals(findData))
		{
		 book.getSheet("Sheet3").getRow(i+1).getCell(1).getStringCellValue();
		 System.out.println("Next cell value"+cellvalue);
		 
		 break;
		
	}
		}
	}
}

	

