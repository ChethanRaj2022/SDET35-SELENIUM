package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_DataFetch {

	public static void main(String[] args) throws Throwable {
		//Write a program to read the 1st and 2nd column
		String path=" ";
		FileInputStream fis = new FileInputStream ("./data/testdata.xlsx");
		 Workbook book = new WorkbookFactory().create(fis);
		 int n=book.getSheet("Sheet2").getLastRowNum();
		 for(int i=0;i<n;i++) {
			 String Coll1= book.getSheet("Sheet2").getRow(3).getCell(2).getStringCellValue();
			 String Coll2= book.getSheet("Sheet2").getRow(3).getCell(1).getStringCellValue();
			 System.out.println(Coll1+ " "+Coll2);
			 
		 }
		 

	}

}
