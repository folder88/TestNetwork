package com.inetbanking.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException{
		
		System.out.println("user is "+user);
		System.out.println("password is "+pwd);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		Thread.sleep(5000);
		
		lp.clickSubmit();
	
		
		
		
		
		if(isAlertPresent() == true) {
			
			System.out.println("incorrect");  
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			
		}
		
		else {
			Assert.assertTrue(true);
			System.out.println("correct");
			lp.clickLogout();
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
	}
	
	
	public boolean isAlertPresent() {
		
		
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e){
			
			return false;
		}
	}
	
	
	
	
@DataProvider(name = "LoginData")
	String[][] getData() throws IOException
	
	
	{
	String path="C:\\Users\\Lenovo Thinkstation\\eclipse-workspace\\inetBanking_01\\src\\test\\java\\com\\inetbanking\\testData\\OpenDocument.xlsx";
	
	int rownum=XLUtils.getRowCount(path, "Sheet1");
	int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
	
	String logindata[][]=new String [rownum][colcount];
	
	for(int i = 1;i <= rownum;i++) {
		
		
			for(int j = 0;j < colcount;j++)
			{	
			logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			
		    }
		
		
	}
	return logindata;
	
	}
}
