package com.inetbanking.utilities;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestClass {

	
	
	
@Test(dataProvider = "wordpressData")	
public void loginToWordpress (String username,String password) throws InterruptedException

{
	
	System.out.println(username);
	System.out.println(password);
	
	
}
	
	
	
	
@DataProvider(name = "wordpressData")
public static Object[][] passData(){
	
	
	ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\Lenovo Thinkstation\\eclipse-workspace\\inetBanking_01\\src\\test\\java\\com\\inetbanking\\testData\\LoginData.xlsx");
	
	int rows = config.getRowCount(0);
	System.out.println(rows);
	Object[][] data = new Object[rows][2]; 
	
	for(int i = 0;i<rows;i++)
	{
		data[i][0]=config.getData(0, i, 0);
		data[i][1]=config.getData(0, i, 1);
		
	}
	
	
	return data;
	
	
	

	}	

}
