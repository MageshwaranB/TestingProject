package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderEg
{
	public Object[][] testData(String excelPath,String sheetName) throws IOException 
	{
		ExcelUtils excel=new ExcelUtils(excelPath,sheetName);
		int rowCount = excel.getRowCount();
		int columnCount = excel.getColumnCount();
		Object arr[][]=new Object[rowCount-1][columnCount];
		for (int i = 1; i < rowCount; i++) 
		{
			for (int j = 0; j < columnCount; j++) {
				String data = excel.getCellDataString(i, j);
				System.out.print(data+" ");
				arr[i-1][j]=data;
			}
			System.out.println();
		}
		return arr;
	}
	
	
	@DataProvider(name="testdata")
	public  Object[][] getData() throws IOException {
		Object[][] data=testData("./excel/dummydata.xlsx", "Sheet1");
		return data;
	}
	
	@Test(dataProvider = "testdata")
	public void test(String uname, String pword) {
		System.out.println(uname+"|"+pword);
	}
}
