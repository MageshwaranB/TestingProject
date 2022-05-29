package dummytesting;

import org.testng.annotations.Test;

public class DataProviderEgPt2 {
	@Test(dataProvider = "dataSet1",dataProviderClass = DataProviderEgPt1.class)
		public void test(String name, String password) {
			System.out.println(name+"--------"+password);
		}
		
		@Test(dataProvider = "dataSet1",dataProviderClass = DataProviderEgPt1.class)
		public void test1(String name, String password,String test) {
			System.out.println(name+"--------"+password+"----"+test);
		}
		
		@Test(dataProvider = "dataSet1",dataProviderClass = DataProviderEgPt1.class)
		public void test2(String name, String password,String test,String test1) {
			System.out.println(name+"--------"+password+"----"+test+"----"+test1);
		}
}

