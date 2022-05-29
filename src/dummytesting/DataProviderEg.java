package dummytesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEg {

	@DataProvider
	public Object[][]  dataSet() {
		Object[][] set=new Object[4][2];//4rows and 2 columns
		//first row
		set[0][0]="user1";
		set[0][1]="pass1";
		//second row
		set[1][0]="user2";
		set[1][1]="pass2";
		//third row
		set[2][0]="user3";
		set[2][1]="pass3";
		//fourth row
		set[3][0]="user4";
		set[3][1]="pass4";
		return set;
	}
	
	@DataProvider
	public Object[][] dataSet1() {
		
		return new Object[][] 
				{
				{"username","password","Test"},
				{"username1","password1","Test1"},
				{"username2","password2","Test2"}
				};
	}
				
	
	@Test(dataProvider = "dataSet")
	public void test(String name, String password) {
		System.out.println(name+"--------"+password);
	}
	
	@Test(dataProvider = "dataSet1")
	public void test1(String name, String password,String test) {
		System.out.println(name+"--------"+password+"----"+test);
	}
}
