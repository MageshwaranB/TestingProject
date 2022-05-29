package utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) throws IOException {
		workbook =new XSSFWorkbook(excelPath);
		sheet=workbook.getSheet(sheetName);
	}
	
	public static int getRowCount() throws IOException {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows "+ rowCount);
		return rowCount;
		
	}
	public static int getColumnCount() throws IOException {
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of columns "+columnCount);
		return columnCount;
	}
	/*
	public static void main(String[] args) throws IOException {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}*/
	
	public static String getCellDataString(int rowNum,int colNum) throws IOException {
		
		String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("cell Data "+cellData);
		return cellData;
	}
	
	public static void getCellDataNumber(int rowNum,int colNum) throws IOException {
		
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println("cell Data "+cellData);
	}
	
}
