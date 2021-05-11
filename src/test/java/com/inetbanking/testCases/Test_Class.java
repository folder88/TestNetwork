package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class Test_Class {
	
	
	
	public static String slow_computer_id = "product_attribute_72_5_18_52";
	public static String medium_computer_id = "product_attribute_72_5_18_53";
	public static String fast_computer_id = "product_attribute_72_5_18_65";
	
	public static String pc_8gb = "product_attribute_72_6_19_91";
	public static String pc_4gb = "product_attribute_72_6_19_55";
	
	public static String pc_harddrive_320 = "product_attribute_72_3_20_57";
	public static String pc_harddrive_400 = "product_attribute_72_3_20_58";
	
	
	
	
	
	
	@Test(dataProvider="LoginData")
	
	void loginDDT(String user ,String pwd,String pwd2) throws InterruptedException{
		
		
	

}
	
	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException{
		
		
		
		String logindata[][]=new String [3][3];
		logindata[0][0]=slow_computer_id;  logindata[0][1]=pc_4gb; logindata[0][2]=pc_harddrive_320;
		logindata[1][0]=slow_computer_id; logindata[1][1]=pc_8gb; logindata[1][2]=pc_harddrive_320;
		logindata[2][0]=medium_computer_id; logindata[2][1]=pc_4gb;logindata[2][2]=pc_harddrive_320;
		
		return logindata;
		
	}
	
	
}