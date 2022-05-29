package logincredentials;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Methods
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static int getRowCount() throws IOException {
		int rowCount=sheet.getPhysicalNumberOfRows();
		return rowCount;
	}
	public int getColumnCount() throws IOException {
		int columnCount=sheet.getRow(0).getPhysicalNumberOfCells();
		return columnCount;
	}
	public String getStringData(int rowNum,int columnNum) throws IOException{
		String rowData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
		return rowData;
	}
	public Methods(String excelPath,String sheetName) throws IOException {
		workbook=new XSSFWorkbook(excelPath);
		sheet=workbook.getSheet(sheetName);
	}
	
}
