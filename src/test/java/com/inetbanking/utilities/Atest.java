package com.inetbanking.utilities;

public class Atest {

	public static void main(String[] args) {
		
		
		
		
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\Lenovo Thinkstation\\eclipse-workspace\\inetBanking_01\\src\\test\\java\\com\\inetbanking\\testData\\LoginData.xlsx");
		
		
		String name = config.getData(1, 1, 0);
		int num = config.getRowCount(0);
		System.out.println(name);
		System.out.println(num); 
		
		
		
		
		
		
		

	}

}
