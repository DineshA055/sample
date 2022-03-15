package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
		 
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
 		
	
	public ExcelUtils() {
		
	}
	
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	public static int getRowCount() {
		int rowCount = 0;
		try {
			
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows"+rowCount);
		}catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return rowCount;
	}
	public static int getColCount() {
		 int colCount = 0;
		try {
			
		colCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of column"+colCount);
		}catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return colCount;
	}

	 public static String getCellDataString(int rowNum, int colNum) {
		 String cellData = null;
		 try {
		 	
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();  
			//System.out.println(cellData);
		 }catch(Exception exp) {
				exp.getMessage();
				exp.getCause();
				exp.printStackTrace();
	 }
		 return cellData;
		 
}

	 public static void getCellDataNumber(int rowNum, int colNum) {
		     
		 try {
		 	double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();  
			System.out.println(cellData);
		 }catch(Exception exp) {
				exp.getMessage();
				exp.getCause();
				exp.printStackTrace();
}
		 
	 }
}