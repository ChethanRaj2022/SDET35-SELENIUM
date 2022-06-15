package Generic_Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	/*
	 * It Contains External Files Specific Libraries 
	 * @author ChethanRaj s r 
	 */

public class Excel_Utility {
	
	/*
	 * This Method is used to get the Value from Excel sheet in String form
	 * @param SheetName
	 * @param rowNum
	 * @param CelNum
	 * @return String 
	 */
	
	public String getStringDataFromExcel(String SheetName, int rowNum, int CelNum) throws Throwable {
		
		String path = "./data/testdata.xlsx";
		FileInputStream fin = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fin);
		String stringCellValue =workbook.getSheet(SheetName).getRow(rowNum).getCell(CelNum).getStringCellValue();
		return stringCellValue;
	}
		
	/*
	 * This Method is used to get the Value from Excel sheet in numeric form
	 * @param SheetName
	 * @param rowNum
	 * @param CelNum
	 * @return double
	 */
	
	public double getNumDataFromExcel(String SheetName, int rowNum, int CelNum) throws Throwable {
			
		String path = "./data/testdata.xlsx";
		FileInputStream fin = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fin);
		double stringCellValue = workbook.getSheet(SheetName).getRow(rowNum).getCell(CelNum).getNumericCellValue();
		return stringCellValue;
	}
	
	
	/*
	 * This Method is used to get the Value from Excel sheet in boolean form
	 * @param SheetName
	 * @param rowNum
	 * @param CelNum
	 * @return boolean
	 */
	
	public boolean getbooleanDataFromExcel(String SheetName, int rowNum, int CelNum) throws Throwable {
		
		String path = "./data/testdata.xlsx";
		FileInputStream fin = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fin);
		boolean stringCellValue = workbook.getSheet(SheetName).getRow(rowNum).getCell(CelNum).getBooleanCellValue();
		return stringCellValue;
	}
}
